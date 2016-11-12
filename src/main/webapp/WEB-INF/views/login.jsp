<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="template/header.jsp"/>
<script>function sendlogin() {
    $.ajax({
        type: 'GET',
        contentType: 'application/JSON',
        url: '${urlpath}',
        dataType: 'JSON',
        data: JSON.stringify({
            'login': documet.getElementById('login').value,
            'password': document.getElementById('password').value,
            'is-admin': document.getElementById('is-admin').value
        }),
        succses: function (data, textstatus, error) {

        }
    })
}</script>
<body>
<form>
    Lolgin:<input type="text" id="login"/>
    <br/>Password: <input type="password" id="password"/>
    <br/><input type="checkbox" id="is-admin"/>
    <br/>
    <button onclick="sendlogin()" value="Login">Login</button>
</form>
</body>
</html>
