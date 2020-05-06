<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<form action="#" th:th:action="@{/insert}" th:object="${insert}" method="post">
    <p><input name="id" type="text" placeholder="id"></p>
    <p><input name="username" type="password" placeholder="username"></p>
    <p><input name="age" type="text" placeholder="age"></p>
    <p><input name="password" type="password" placeholder="password"></p>

    <button type="submit">submit</button>
</form>

</body>
</html>
