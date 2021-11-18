<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Category</title>
</head>
<body>
	<a href="<c:url value="/book-list" />" >List all Books</a><br />

	<h1>Add new Customer:</h1>
	<c:url value="/book-save" var="saveCustomer"/>
	<form action="${saveCustomer}" method="post">
		<lable>Title:</lable>
		<input type="text" name="title">
		<br><br>
		<lable>Category:</lable>
		<Select name="cat">
			<c:if test="${not empty listCat}">
				<c:forEach var="cat" items="${listCat}">
					<option value="${cat.id}">${cat.name}</option>
				</c:forEach>
			</c:if>

		</Select>
		<br><br>
		<lable>Price:</lable>
		<br><br><input type="text" name="price">
		<br><br><input type="submit">
	</form>

</body>
</html>