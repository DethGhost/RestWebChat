<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>

<jsp:include page="template/header.jsp"/>
<body>
<s:url var="formUrl" value="/registration-handler"/>
<sf:form modelAttribute="user" action="${formUrl}">
        <div>
            <label for="name"><s:message code="reg.name"/>:</label>
            <sf:input path="name"/>
            <sf:errors path="name" cssClass="error"/>
        </div>
        <div>
            <label><s:message code="reg.login"/>: </label>
            <sf:input path="login"/>
            <sf:errors path="login" cssClass="error"/>
        </div>
        <div>
            <label><s:message code="reg.password"/>: </label>
            <sf:input path="password"/>
            <sf:errors path="password" cssClass="error"/>
        </div>
        <div class="submit">
            <button type="submit" name="save"><s:message code="reg.submit"/></button>
        </div>
</sf:form>
</body>
</html>