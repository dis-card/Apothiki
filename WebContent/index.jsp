<%--

	Author	:-	Vikash
	Purpose	:-	home page of the application.
	
 --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
<f:loadBundle var="lMsg" basename="message"/>
	<html>
<head>
<%@include file="common.jsp"%>
<title>Konto</title>
<head>
<body>
	<%@include file="header.jsp"%>
	<h:form>
		<h:panelGrid columns="3" styleClass="loginTable">
			<h:outputLabel value="#{lMsg.username}"/>
			<h:inputText id="username" required="true" requiredMessage="#{lMsg.required}" value="#{login.username }" />
			<h:message for="username" styleClass="errorMsg" />
			
			
			<h:outputLabel value="#{lMsg.password }"/>
			<h:inputSecret id="password" required="true" requiredMessage="#{lMsg.required}" value="#{login.password }"/>
			<h:message for="password" styleClass="errorMsg" />
			
			<h:commandButton value="#{lMsg.login}" action="#{login.authenticate }" />
			<h:commandButton immediate="true" value="#{lMsg.reset}" action="#{login.reset }" />
		</h:panelGrid>
	</h:form>
	<%@include file="footer.jsp"%>

</body>
	</html>
</f:view>