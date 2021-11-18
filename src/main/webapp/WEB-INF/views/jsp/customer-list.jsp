<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Book</title>
<style>
table, th, td {
	border: 1px solid black;
}
td {
	padding-right: 30px;
}
</style>
</head>
<body>
	<c:url value="/book-save" var="urlSave"/>
	<h1>List all Book:</h1>
	<a href="${urlSave}">Add Book</a>
	<br />
	<br />


	<table>
		<tr>
			<th>Book Id</th>
			<th>Title</th>
			<th>Category</th>
			<th>Price</th>
			<th>Delete</th>
		</tr>
		<c:if test="${not empty listbook}">
			<c:forEach var="book" items="${listbook}">
				<tr style="border: 1px black solid">
					<td>${book.id}</td>
					<td>${book.title}</td>
					<td>${book.cat.name}</td>
					<td>${book.price}</td>

					<td> <a href="<%=request.getContextPath()%>/bookDelete/${book.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</c:if>
	</table>

</body>
</html>