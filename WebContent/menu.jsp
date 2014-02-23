<%--

	Author	:-	Vikash
	Purpose	:-	contains the menu part of the application.
	
 --%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<nav>
	<ul>
		<li><h:outputLink value="/Konto/faces/index.jsp">
				<h:outputText value="Search" />
			</h:outputLink>
			<ul>
				<li><h:outputLink value="">
						<h:outputText value="By Title" />
					</h:outputLink></li>
				<li><h:outputLink value="">
						<h:outputText value="By Author" />
					</h:outputLink></li>
				<li><h:outputLink value="">
						<h:outputText value="By ISBN" />
					</h:outputLink></li>
			</ul>
		<li><h:outputLink value="">
				<h:outputText value="Suggest Book" />
			</h:outputLink></li>
		<li><h:outputLink value="">
				<h:outputText value="Change Password" />
			</h:outputLink></li>
		<li><h:form><h:commandLink value="Logout" action="#{home.logout }" /></h:form></li>
	</ul>
</nav>