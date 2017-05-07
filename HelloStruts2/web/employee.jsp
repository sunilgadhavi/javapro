<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Employees</title>
</head>
<body>
	<b>Example of Iterator Tag</b>
	<br />

	<s:iterator value="employees">
		<s:property value="empName" /> ,
        <s:property value="department" />
		<br />
	</s:iterator>
	<br />
	<br />

	<b>Employees sorted by Department</b>
	<br />
	<s:bean name="com.example.struts2.DepartmentComparator"
		var="deptComparator" />

	<s:sort comparator="deptComparator" source="employees">
		<s:iterator>
			<s:property value="empName" /> ,
            <s:property value="department" />
			<br />
		</s:iterator>
	</s:sort>
	<br />
	<br />
	<b>SubSet Tag - Employees working in Recruitment department </b>
	<br />
	<s:subset decider="recruitmentDecider" source="employees">
		<s:iterator>
			<s:property value="empName" /> ,
            <s:property value="department" />
			<br />
		</s:iterator>
	</s:subset>
	<br />
	<br />
	<b>SubSet Tag - Employees 2 and 3 </b>
	<br />
	<s:subset start="1" count="2" source="employees">
		<s:iterator>
			<s:property value="empName" /> ,
            <s:property value="department" />
			<br />
		</s:iterator>
	</s:subset>
	<br>
	<br>
	<h2>MergedList</h2>
	<s:merge var="allemployees">
		<s:param value="employees" />
		<s:param value="contractors" />
		<s:param value="customers" />
	</s:merge>
	<s:iterator value="allemployees">
		<s:property value="empName" />,
		<s:property value="department" />
		<br />
	</s:iterator>
	<br>
	<br>
	<h2>AppendList</h2>
	<s:append var="appendEmployees">
		<s:param value="employees" />
		<s:param value="contractors" />
		<s:param value="customers" />
	</s:append>
	<s:iterator value="appendEmployees">
		<s:property value="empName" />,
		<s:property value="department" />
		<br />
	</s:iterator>

	<h2>Example of Generator Tag</h2>
	<h3>The colours of rainbow:</h3>
	<s:generator val="%{'Violet|Indigo|Blue|Green|Yellow|Orange|Red '}"
		count="7" separator="|">
		<s:iterator>
			<s:property />
			<br />
		</s:iterator>
	</s:generator>

	<h3>Include HelloWorld:</h3>
	<s:include value="HelloWorld.jsp">
		<%-- <s:param name="name">ABCD</s:param> --%>
		<%-- <s:param name="name" value="ABCD"/> --%>
	</s:include>

	<h3>Bean Tag Example:</h3>
	<s:bean name="org.apache.struts2.util.Counter" var="counter">
		<s:param name="first" value="20" />
		<s:param name="last" value="25" />
	</s:bean>
	
	<ol>
		<s:iterator value="#counter">
			<li><s:property /></li>
		</s:iterator>
	</ol>
	
	<s:property value="#counter.current"/>
	
	<s:set var="#counter.current" value="20"/>
	
	<s:property value="#counter.current"/>
	
	<ul>
		<s:iterator value="#counter">
			<li><s:property /></li>
		</s:iterator>
	</ul>

</body>
</html>