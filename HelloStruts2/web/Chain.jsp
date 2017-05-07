<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE>
<html>
<head>
<title>Hello World</title>
</head>
<body>
	Hello World,
	<s:if test="%{name!=null}">
		<s:property value="name" />
	</s:if>
	<s:else>
		${param.name} from Param
	</s:else>
	<br><br>
	After Chain, <br><br>
	<s:if test="%{chain!=null}">
		<s:property value="chain" />
	</s:if>
	AND
	<s:if test="%{chain2!=null}">
		<s:property value="chain2" />
	</s:if>
	
	
</body>
</html>