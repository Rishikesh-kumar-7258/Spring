<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Contact form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
	<h1 class="text-center">${heading }</h1>
	<p class="text-center">${desc }</p>
		<form action="processForm" method="post">
			<div class="mb-3">
				<label for="name" class="form-label">Name</label> <input type="text"
					class="form-control" id="name" name="name">
			</div>
			<div class="mb-3">
				<label for="email" class="form-label">Email address</label> <input
					type="email" class="form-control" id="email" name='email'>

			</div>
			<div class="mb-3">
				<label for="password" class="form-label">Password</label> <input
					type="password" class="form-control" id="password" name="password">
			</div>

			<button type="submit" class="btn btn-success text-center">Submit</button>
		</form>

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
</body>
</html>