<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="resources/css/layout/layout.css">
    <link rel="stylesheet" href="resources/css/brand/brand.css">
    <link rel="stylesheet" href="resources/css/menu/menu.css">
    <link rel="stylesheet" href="resources/css/company/company.css">
    <link rel="stylesheet" href="resources/css/store/store.css">
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <title>씅's 꼬기가득비빔밥</title>
</head>
<body>
    <tiles:insertAttribute name="header"/>
    <tiles:insertAttribute name="main"/>
    <tiles:insertAttribute name="footer"/>
	<script src="resources/js/layout/layout.js"></script>
</body>
</html>