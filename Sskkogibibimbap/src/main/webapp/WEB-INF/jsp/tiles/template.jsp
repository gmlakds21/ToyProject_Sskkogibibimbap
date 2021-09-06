<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
    						integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
    						crossorigin="anonymous">
    <link rel="stylesheet" href="resources/css/layout/header.css">
    <link rel="stylesheet" href="resources/css/BrandStory.css">
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<!-- <script src="/js/product.js"></script> -->
    <title>sskkogibibimbap</title>
</head>
<body>
	<header>
	    <tiles:insertAttribute name="header"/>
	</header>
	<div>
	    <tiles:insertAttribute name="main"/>
	</div>
	<footer>
	    <tiles:insertAttribute name="footer"/>
	</footer>	
</body>
</html>