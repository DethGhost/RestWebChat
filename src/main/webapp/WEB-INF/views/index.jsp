<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<jsp:include page="template/header.jsp"/>
<body>
&ensp;
<%--<a href="${s:mvcUrl('LA#index')}" title="Login Page">--%>
    <%--<button>Sign In</button>--%>
<%--</a>--%>
&ensp;
<a href="${s:mvcUrl('RC#getRegisteration')}" title="Registration page">
    <button>Register</button>
</a>
</body>
</html>