<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE>
<html>
<head>
<title>Text Tag Example</title>
</head>
<body>
	<s:i18n name="HelloWorldStruts2">
		<s:text name="name.success" />
		<br>
		<s:text name="name.xYz">Message doesn't exists</s:text>
		<br>
		<s:text name="name.msg.param">
			<s:param>ZARA</s:param>
			<s:param>HAYAT</s:param>
			<s:param>KHAN</s:param>
		</s:text>
		<br>
		<s:text name="name.LoMNop"/>
	</s:i18n>
	<br>
	<s:text name="date.Format.Key"/>
	<br>
	<s:text name="date.Format.Month"/>
</body>
</html>