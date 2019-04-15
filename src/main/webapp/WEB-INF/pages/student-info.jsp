<%@include file="include.jsp" %>
<html>
<head>
    <title>User Info</title>
</head>
<body>
<c:set var="transfered" value="${student}"/>

<div class = "container">
    <ul>
        <li>
            <div class="column">
                name : ${transfered.name}
            </div>
        </li>

        <li>
            <div class="column">
                type : ${transfered.studentType}
            </div>
        </li>

        </li>

        <li>
            <div class="column">
                id : ${transfered.id}
            </div>
        </li>

    </ul>
</div>
</body>
</html>
