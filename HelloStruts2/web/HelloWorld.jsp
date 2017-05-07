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
		${name}
	</s:if>
	<s:else>
		${param.name} from Param
	</s:else>
	
	
	
</body>
</html>