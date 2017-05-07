<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE>
<html>
<head>
<title>Struts 2 ValueStack example</title>
</head>
<body>
	<h3>This is a ValueStack example.</h3>
	<s:form action="welcome">
		<s:textfield name="name" label="UserName" />
		<s:submit value="Hello" align="center" />
	</s:form>
</body>
</html>