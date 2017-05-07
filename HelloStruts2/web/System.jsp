<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE>
<html>
<head>
<title>System Details</title>
</head>
<body>
	<p>The environment name property can be accessed in three ways:</p>
	(Method 1) Environment Name:
	<s:property value="env.name" />
	<br /> (Method 2) Environment Name:
	<s:push value="env">
		<s:property value="name" />
		<br />
	</s:push>
	(Method 3) Environment Name:
	<s:set var="myenv" value="env.name" scope="application"/>
	<s:property value="#application.myenv" />
</body>
</html>