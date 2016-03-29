$(document).ready(
		function() {

			var data;
			function execute(obj) {
				if (data.length <= 0) {
					return;
				}
				var json = eval(data);
				var str = '<option value="-1">--请选择分类--</option>';
				for (var i = 0; i < json.length; i++) {
					str += "<option value=" + json[i].catagorgyId + ">"
							+ json[i].catagorgyName + "</option>";
				}
				obj.children("option").remove();
				obj.css('display', 'inline');
				obj.append(str);
			}
			$(function() {
				var oSelect = $("#selecttype");
				oSelect.change(function() {
					// 清空二级菜单和三级菜单
					$("#sectype").hide();
					$("#sectype").children('option').remove();
					$("#thirdtype").hide();
					$("#thirdtype").children('option').remove();
					$.ajax({
						type : "get",
						url : "catagorgy!listCata?catagorgyId="
								+ oSelect.val(),
						success : function(msg) {
								data = msg;
						},
						error : function(obj, msg) {
							// alert("没有子分类");
							data = "";
						},
						complete : function(data) {
							execute($("#sectype"));
								}
						});

				});

				$("#sectype").change(
						function() {
							$.ajax({
								type : "get",
								url : "catagorgy!listCata?catagorgyId="
										+ $(this).val(),
								success : function(msg) {
									data = msg;
								},
								error : function(obj, msg) {
									// alert("没有子分类");
									data = "";
								},
								complete : function(data) {
									execute($("#thirdtype"));
								}
							});

						});

			});
});