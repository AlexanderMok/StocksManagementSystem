<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
不好，错误页面！
<span style="color:red"><s:actionerror/></span>
<s:actionmessage/>
<a href="javascript:history.go(-1);">返回</a>
</body>
</html>