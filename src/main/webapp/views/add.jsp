<%--
  Created by IntelliJ IDEA.
  User: hoanganh
  Date: 14/05/2024
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<form:form action= "addEmployee">
    <fieldset disabled>
        <legend>Them moi sinh vien</legend>
        <div  class="form-group">
            <label for="disabledTextInput">Nhap ID moi</label>
            <input type="text" id="disabledTextInput" class="form-control" placeholder="new Id">
        </div>
        <div class="form-group">
            <label for="disabledTextInput">Ten </label>
            <input type="text" id="disabledTextInput2" class="form-control" placeholder="Ten">
        </div>
        <div class="form-group">
            <label for="disabledTextInput"> Address</label>
            <input type="text" id="disabledTextInput3" class="form-control" placeholder="Address">
        </div>
        <div class="form-group">
            <label for="disabledTextInput"> Date Of Birth</label>
            <input type="date" id="disabledTextInput4" class="form-control" placeholder="Ngay Sinh">
        </div>
        <div class="form-group">
            <label for="disabledTextInput"> Phone Number</label>
            <input type="date" id="disabledTextInput5" class="form-control" placeholder="So dien thoai">
        </div>

        <button type="submit" class="btn btn-primary">Gui</button>
    </fieldset>
</form:form>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
