<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<Html>
<t:pageTemplate pageTitle="POS">
    <h1>Registration</h1>
</t:pageTemplate>
<body>
<br>
<br>
<form>

    <label> Surnname </label>
    <input type="text" name="surname" size="15"/> <br> <br>
    <label> Name: </label>
    <input type="text" name="name" size="15"/> <br> <br>
    <label> Email: </label>
    <input type="text" name="email" size="15"/> <br> <br>

    <br>
    <br>
    Password:
    <input type="Password" id="password" name="password"> <br>
    <br> <br>
    Re-type password:
    <input type="Password" id="repassword" name="repassword"> <br> <br>
    <input type="button" value="Submit"/>
</form>
</body>
</html>
