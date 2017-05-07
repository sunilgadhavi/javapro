<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE>
<html>
<head>
<title>Hello World</title>
</head>
<body>
	<s:url action="/visitor/hello" var="myurl">
		<s:param name="name">SECRET</s:param>
	</s:url>
	<a href='<s:property value="#myurl"/>'> <s:property value="#myurl" /></a>
</body>
</html>