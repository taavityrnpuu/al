<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ page import="org.springframework.security.core.Authentication" %>
<%@ page import="org.springframework.security.web.access.AccessDeniedHandlerImpl" %>

<%
	session.invalidate();
%>

<script language="javascript">location.replace('/index.html#AccessDeniedPage')</script>

<h1>Sorry, access is denied</h1>


<p>
<%= request.getAttribute("SPRING_SECURITY_403_EXCEPTION")%>

<p>

<%		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) { %>
			Authentication object as a String: <%= auth.toString() %><BR><BR>
<%      } %>