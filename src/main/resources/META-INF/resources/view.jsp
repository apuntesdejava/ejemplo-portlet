<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="ejemplo.caption"/></b>
</p>

<liferay-portlet:actionURL name="registrar" var="registrarURL">
</liferay-portlet:actionURL>

<aui:form action="<%= registrarURL %>">
	<aui:input name="nombre" label="form.name.label" />
	<aui:button type="submit" value="form.submit" />
</aui:form>