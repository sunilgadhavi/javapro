<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE>
<html>
<head>
<title>Employee Form</title>
</head>
<body>
	<s:form action="empinfo" method="post">
		<s:textfield name="emp.empName" label="Name" size="20" />
		<s:textfield name="emp.age" label="Age" size="20" />
		<s:submit label="Submit" align="center" />
	</s:form>
</body>
</html>