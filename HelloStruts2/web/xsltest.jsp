<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<body>
	<h2>Struts2 XSL result example</h2>
	<s:form action="doXSL" method="post">
		<s:textfield label="Enter Code" name="code" />
		<s:textfield label="Enter Name" name="name" />
		<s:textfield label="Enter City" name="city" />
		<s:textfield label="Enter Salary" name="salary" />
		<s:submit label="Submit" />
		<s:reset label="Reset" />
	</s:form>
</body>
</html>