<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Spring MVC internationalization</h1>
	Language:
	<a href="welcome?Language=en">English</a>
	<a href="welcome?Language=hi_IN">Hindi</a>
	<h3>
		<spring:message code="welcome.greeting" text="Welcome"></spring:message>
	</h3>

	Current Local : ${pageContext.response.locale}
</body>
</html>