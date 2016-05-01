$(document).ready(function() {
	
			page();
			order();
			isNum(".price");
			isAmount(".amount");
			isDate(".date");
			encode();
			
			
			
});






/*排序*/
function order() {
	$("#orderBy").change(function(){
		
		
		if ($(this).val() != -1) {
			/*获取order参数*/
			var order = $(this).val();
			
			$("#sequence").change(function(){
				
				if($(this).val()!=-1){
					/*获取sequence参数*/
					var sequence = $(this).val();
					var formId = $("form[name]").attr("name");
					$("form[id=order").attr("action",formId + "!list?order=" + order + "&sequence=" + sequence);
					$("input[name='orderQuery']").submit();
				}
			});
			
		}
	});
}

/*底部分页*/
function page() {
	var lastPage = parseInt($("#lastPage").val());
	
	/* 获取form的name属性,name命名要与控制器一致 ，页面内的其他form不可以设name属性，否则有冲突 */
	var formId = $("form[name]").attr("name");

	$("#btn_page").click(
			function() {
				var curPage = parseInt($("#toPage").val());
				if ((curPage != null && curPage != undefined && curPage!="" && curPage != NaN
						&& curPage > 0 && curPage <= lastPage))
				{
					$("form[name='" + formId + "']").attr("action",
							formId + "!list?curPage=" + curPage );
					$("form[name='" + formId + "']").attr("method", "post");
					$("#btn_page").submit();
				}else{
					alert("请输入合法页数");
					$("#toPage").val("");
					return;
				}

			});

	$("#toPage").keyup(function(event) {
		if (event.keyCode == 13) {
			$("#btn_page").click();
		}
	});
}




/*价格验证*/
function isNum (className){
	$(className).blur(function(){
		if(/^-?\d+\.?\d{0,2}$/.test(this.value)==false){
				this.value="请输入数字";
				this.focus();
		}
	});	
}
/*数量验证*/
function isAmount (className){
	$(className).blur(function(){
		if(/^\d+$/.test(this.value)==false){
			this.value="请输入数字";
			this.focus();
		} 
	});	
}




/*日期验证*/
function isDate(className) {
	$(className).blur(function(){
		if(/^((?:19|20)\d\d)-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$/.test(this.value)==false){
				this.value="请输入日期";
				this.focus();
		}
	});	
}
/*密码验证*/
function isPass(className) {
	$(className).blur(function(){
		if(/^[0-9a-zA-Z_]{8}$/.test(this.value)==false){
			this.value="请输入8位密码，数字、字母、下划线";
			this.focus();
		}
	});	
}

function encode() {
	for (var i = 0; i < document.links.length; i++) {

		document.links[i].href = encodeURI(document.links[i].href);

	} 
}

