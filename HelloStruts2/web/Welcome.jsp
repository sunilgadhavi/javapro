<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Struts 2 ValueStack example</title>
</head>
<body>
	<h2>ApplicationScope Variable</h2>
	<s:property value="#application.myenv" />
	<h2>Current Date</h2>
	<h3>Day/Month/Year Format</h3>
	<s:date name="currentDate" format="dd/MM/yyyy" />
	<h3>Month/Day/Year Format</h3>
	<s:date name="currentDate" format="MM/dd/yyyy" />
	<h3>Nice="true"</h3>
	<s:date name="currentDate" nice="true" />
	<h3>default</h3>
	<s:date name="currentDate"/>
	<h3>some.i18n.key</h3>
	<s:date name="currentDate" format="%{getText('date.Format.Key')}"/>
	<br>
	<br>
	<h3>This is a ValueStack example.</h3>

	<h5>
		UserName:
		<%-- <s:property value="name" /> --%>
		aaaa-${name}
	</h5>
	<h5>
		Value1:
		<%-- <s:property value="value1" /> --%>
		bbbb-${value1}
	</h5>
	<h5>
		Value2:
		<s:property value="value2" />
	</h5>


	<br>
	<s:if test="name=='Sunil'">
	Hi ${name}
	</s:if>
	<s:elseif test="name=='Mandar'">
	Hi ${name}
	</s:elseif>
	<s:else>
	Sorry..... You're not authorized person........
	</s:else>
	<br>
	<br>
	<br>

	<%-- <hr>
	<s:iterator value="days">
		<p>
			day is:
			<s:property />
		</p>
	</s:iterator> --%>
	<hr>
	<s:select name="list5" list="days" value="%{'25'}">
		<%-- <p>
			day is:
			<s:property />
		</p> --%>
	</s:select>
	<hr>

	<s:property value="#session.mySessionPropKey" />
	or
	<br>
	<s:property value="#session['mySessionPropKey']" />
	or
	<br>
	<p>%{#session['mySessionPropKey']}</p>
	or
	<br>
	<s:textfield name="var1" label="%{#session['mySessionPropKey']}" />
	<br>
	<br>

	<c:set var="foo" value="bar" scope="request" />
	<s:textfield name="var2" label="%{#request.foo}" />

	<br> request var2={#request.foo}
	<hr>
	1111 ${sessionScope['mySessionPropKey']} ------ ${requestScope.foo}
	<hr>
	<s:select label="label" name="name"
		list="#{'1':'One','2':'Two','':'Three', '4':'four'}" value="%{''}" />

	<br>

	<s:select label="label" name="name22" list="{'name1','name2','name3'}"
		value="%{'name2'}" />
	<br>

	<s:select label="label" name="name1"
		list="#{'foo':'foovalue', 'bar':'barvalue'}" />

	<br> aaaaa-
	<s:textfield label="fib111" name="fib1"
		value="#fib =:[#this==0 ? 0 : #this==1 ? 1 : #fib(#this-2)+#fib(#this-1)], 
		#fib(11)" />

	<br>
	<br>

	<s:set var="fib123" scope="request"
		value="#fib =:[#this==0 ? 0 : #this==1 ? 1 : #fib(#this-2)+#fib(#this-1)], #fib(11)" />
	4343434--
	<s:property value="%{#request.fib123}" />
	<br>
	<br>
	<s:property
		value="#fib =:[#this==0 ? 0 : #this==1 ? 1 : #fib(#this-2)+#fib(#this-1)], #fib(11)" />


</body>
</html>