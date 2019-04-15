<%@include file="WEB-INF/pages/include.jsp" %>
<html>
<head>
    <title>Main</title>
</head>
<body>
    <div class="header">
        <ul>
            <li><a href="register">Register</a></li>
        </ul>
        <c:if test="${!inSystem}">
        <form action="login" method="post">
            <ul>
                <li>Input name:
                    <input name="name" type="text">
                </li>
                <li>Submit:
                    <input type="submit" value="submit">
                </li>
            </ul>
        </form>
        </c:if>
        <c:if test="${inSystem}">
            <li>Hello ${currentUserName}</li>
        </c:if>
    </div>
</body>
</html>
