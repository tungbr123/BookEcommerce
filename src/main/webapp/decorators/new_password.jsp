<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Bootstrap 5 New Password</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
	<div class="container d-flex flex-column">
		<div
			class="row align-items-center justify-content-center
          min-vh-100">
			<div class="col-12 col-md-8 col-lg-4">
				<div class="card shadow-sm">
					<div class="card-body">
						<div class="mb-4">
							<h5>New Password</h5>
							<p class="mb-2">Update your new password</p>
						</div>
						<h2 >${email}</h2>
						<form action="newpassword" method="post">
							<div class="mb-3">
							<p class="text-danger">${mess}</p>
								<label for="password" class="form-label">New password</label> <input
									type="password" class="form-control" required="" id="password"
									name="password" value=""> 
								<label for="password"
									class="form-label">Confirm new password</label> <input type="password"
									class="form-control" required="" id="password" name="password2"
									value="">
							</div>
							<div class="mb-3 d-grid">
								<button type="submit" class="btn btn-primary">Confirm</button>
							</div>
							<span>Don't have an account? <a href="login">sign
									in</a></span>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>