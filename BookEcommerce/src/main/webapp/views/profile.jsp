<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<!--  This file has been downloaded from bootdey.com @bootdey on twitter -->
<!--  All snippets are MIT license http://bootdey.com/license -->
<title>My Profile</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container light-style flex-grow-1 container-p-y">

		<h4 class="font-weight-bold py-3 mb-4">Account settings</h4>

		<form action="profile" method="post" enctype="multipart/form-data">

			<div class="card overflow-hidden">
				<div class="row no-gutters row-bordered row-border-light">
					<div class="col-md-3 pt-0">
						<div class="list-group list-group-flush account-settings-links">
							<a class="list-group-item list-group-item-action active"
								data-toggle="list" href="#account-general">General</a> <a
								class="list-group-item list-group-item-action"
								data-toggle="list" href="#account-change-password">Change
								password</a> <a class="list-group-item list-group-item-action"
								data-toggle="list" href="#account-info">Cart</a> <a
								class="list-group-item list-group-item-action"
								data-toggle="list" href="#account-social-links">Social links</a>
							<a class="list-group-item list-group-item-action"
								data-toggle="list" href="#account-connections">Connections</a> <a
								class="list-group-item list-group-item-action"
								data-toggle="list" href="#account-notifications">Notifications</a>
						</div>
					</div>

					<div class="col-md-9">
						<div class="tab-content">


							<div class="tab-pane fade active show" id="account-general">

								<div class="card-body media align-items-center">
									<img src="${sessionScope.acc._avatar }" alt=""
										class="d-block ui-w-80">
									<div class="media-body ml-4">
										<input type="file" name="photo" class="form-control"
											placeholder="Upload PhoTo">
										<button type="button" class="btn btn-default md-btn-flat">Reset</button>


									</div>
								</div>
								<hr class="border-light m-0">

								<div class="card-body">

									<div class="form-group">
										<label class="form-label">FirstName</label> <input type="text"
											name="firstname" class="form-control mb-1"
											value="${sessionScope.acc._firstname}">
									</div>

									<div class="form-group">
										<label class="form-label">LastName</label> <input type="text"
											name="lastname" class="form-control"
											value="${sessionScope.acc._lastname}">
									</div>
									<div class="form-group">
										<label class="form-label">E-mail</label> <input type="text"
											name="email" class="form-control mb-1"
											value="${sessionScope.acc._email}">

									</div>
									<div class="form-group">
										<label class="form-label">Address</label> <input type="text"
											name="address" class="form-control"
											value="${sessionScope.acc._addresses }">
									</div>
									<div class="form-group">
										<label class="form-label">Phone</label> <input type="text"
											name="phone" class="form-control"
											value="${sessionScope.acc._phone }">
									</div>
								</div>

							</div>
							<div class="tab-pane fade" id="account-change-password">
								<div class="card-body pb-2">
									<p>${mess}</p>
									<div class="form-group">
										<label class="form-label">Current password</label> <input
											type="password" name="password" class="form-control">
									</div>

									<div class="form-group">
										<label class="form-label">New password</label> <input
											type="password" name="newpassword" class="form-control">
									</div>

									<div class="form-group">
										<label class="form-label">Repeat new password</label> <input
											type="password" name="confirmpassword" class="form-control">
									</div>

								</div>
							</div>
							<div class="tab-pane fade" id="account-info">
								<div class="container mb-4">
									<div class="row">
										<div class="col-12">
											<div class="table-responsive">
												<table class="table table-striped">
													<thead>
														<tr>
															<th scope="col"></th>
															<th scope="col">Product</th>
															<th scope="col">Available</th>
															<th scope="col" class="text-center">Quantity</th>
															<th scope="col" class="text-right">Price</th>
															<th></th>
														</tr>
													</thead>
													<tbody>
														<tr>
															<td><img
																src="https://dummyimage.com/50x50/55595c/fff" /></td>
															<td>Product Name Dada</td>
															<td>In stock</td>
															<td><input class="form-control" type="text"
																value="1" /></td>
															<td class="text-right">124,90 €</td>
															<td class="text-right"><button
																	class="btn btn-sm btn-danger">
																	<i class="fa fa-trash"></i>
																</button></td>
														</tr>
														<tr>
															<td><img
																src="https://dummyimage.com/50x50/55595c/fff" /></td>
															<td>Product Name Toto</td>
															<td>In stock</td>
															<td><input class="form-control" type="text"
																value="1" /></td>
															<td class="text-right">33,90 €</td>
															<td class="text-right"><button
																	class="btn btn-sm btn-danger">
																	<i class="fa fa-trash"></i>
																</button></td>
														</tr>
														<tr>
															<td><img
																src="https://dummyimage.com/50x50/55595c/fff" /></td>
															<td>Product Name Titi</td>
															<td>In stock</td>
															<td><input class="form-control" type="text"
																value="1" /></td>
															<td class="text-right">70,00 €</td>
															<td class="text-right"><button
																	class="btn btn-sm btn-danger">
																	<i class="fa fa-trash"></i>
																</button></td>
														</tr>
														<tr>
															<td></td>
															<td></td>
															<td></td>
															<td></td>
															<td>Sub-Total</td>
															<td class="text-right">255,90 €</td>
														</tr>
														<tr>
															<td></td>
															<td></td>
															<td></td>
															<td></td>
															<td>Shipping</td>
															<td class="text-right">6,90 €</td>
														</tr>
														<tr>
															<td></td>
															<td></td>
															<td></td>
															<td></td>
															<td><strong>Total</strong></td>
															<td class="text-right"><strong>346,90 €</strong></td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
										<div class="col mb-2">
											<div class="row">
												<div class="col-sm-12  col-md-6">
													<button class="btn btn-block btn-light">Continue
														Shopping</button>
												</div>
												<div class="col-sm-12 col-md-6 text-right">
													<button
														class="btn btn-lg btn-block btn-success text-uppercase">Checkout</button>
												</div>
											</div>
										</div>
									</div>
								</div>

							</div>
							<div class="tab-pane fade" id="account-social-links">
								<div class="card-body pb-2">

									<div class="form-group">
										<label class="form-label">Twitter</label> <input type="text"
											class="form-control" value="https://twitter.com/user">
									</div>
									<div class="form-group">
										<label class="form-label">Facebook</label> <input type="text"
											class="form-control" value="https://www.facebook.com/user">
									</div>
									<div class="form-group">
										<label class="form-label">Google+</label> <input type="text"
											class="form-control" value="">
									</div>
									<div class="form-group">
										<label class="form-label">LinkedIn</label> <input type="text"
											class="form-control" value="">
									</div>
									<div class="form-group">
										<label class="form-label">Instagram</label> <input type="text"
											class="form-control" value="https://www.instagram.com/user">
									</div>

								</div>
							</div>
							<div class="tab-pane fade" id="account-connections">
								<div class="card-body">
									<button type="button" class="btn btn-twitter">
										Connect to <strong>Twitter</strong>
									</button>
								</div>
								<hr class="border-light m-0">
								<div class="card-body">
									<h5 class="mb-2">
										<a href="javascript:void(0)"
											class="float-right text-muted text-tiny"><i
											class="ion ion-md-close"></i> Remove</a> <i
											class="ion ion-logo-google text-google"></i> You are
										connected to Google:
									</h5>
									nmaxwell@mail.com
								</div>
								<hr class="border-light m-0">
								<div class="card-body">
									<button type="button" class="btn btn-facebook">
										Connect to <strong>Facebook</strong>
									</button>
								</div>
								<hr class="border-light m-0">
								<div class="card-body">
									<button type="button" class="btn btn-instagram">
										Connect to <strong>Instagram</strong>
									</button>
								</div>
							</div>
							<div class="tab-pane fade" id="account-notifications">
								<div class="card-body pb-2">

									<h6 class="mb-4">Activity</h6>

									<div class="form-group">
										<label class="switcher"> <input type="checkbox"
											class="switcher-input" checked=""> <span
											class="switcher-indicator"> <span class="switcher-yes"></span>
												<span class="switcher-no"></span>
										</span> <span class="switcher-label">Email me when someone
												comments on my article</span>
										</label>
									</div>
									<div class="form-group">
										<label class="switcher"> <input type="checkbox"
											class="switcher-input" checked=""> <span
											class="switcher-indicator"> <span class="switcher-yes"></span>
												<span class="switcher-no"></span>
										</span> <span class="switcher-label">Email me when someone
												answers on my forum thread</span>
										</label>
									</div>
									<div class="form-group">
										<label class="switcher"> <input type="checkbox"
											class="switcher-input"> <span
											class="switcher-indicator"> <span class="switcher-yes"></span>
												<span class="switcher-no"></span>
										</span> <span class="switcher-label">Email me when someone
												follows me</span>
										</label>
									</div>
								</div>
								<hr class="border-light m-0">
								<div class="card-body pb-2">

									<h6 class="mb-4">Application</h6>

									<div class="form-group">
										<label class="switcher"> <input type="checkbox"
											class="switcher-input" checked=""> <span
											class="switcher-indicator"> <span class="switcher-yes"></span>
												<span class="switcher-no"></span>
										</span> <span class="switcher-label">News and announcements</span>
										</label>
									</div>
									<div class="form-group">
										<label class="switcher"> <input type="checkbox"
											class="switcher-input"> <span
											class="switcher-indicator"> <span class="switcher-yes"></span>
												<span class="switcher-no"></span>
										</span> <span class="switcher-label">Weekly product updates</span>
										</label>
									</div>
									<div class="form-group">
										<label class="switcher"> <input type="checkbox"
											class="switcher-input" checked=""> <span
											class="switcher-indicator"> <span class="switcher-yes"></span>
												<span class="switcher-no"></span>
										</span> <span class="switcher-label">Weekly blog digest</span>
										</label>
									</div>

								</div>
							</div>

						</div>
					</div>
				</div>
			</div>

			<div class="text-right mt-3">
				<button type="submit" class="btn btn-primary">Save changes</button>
				&nbsp;
				<a href="home">Cancel</a>
			</div>
		</form>

	</div>

	<style type="text/css">
body {
	background: #f5f5f5;
	margin-top: 20px;
}

.ui-w-80 {
	width: 80px !important;
	height: auto;
}

.btn-default {
	border-color: rgba(24, 28, 33, 0.1);
	background: rgba(0, 0, 0, 0);
	color: #4E5155;
}

label.btn {
	margin-bottom: 0;
}

.btn-outline-primary {
	border-color: #26B4FF;
	background: transparent;
	color: #26B4FF;
}

.btn {
	cursor: pointer;
}

.text-light {
	color: #babbbc !important;
}

.btn-facebook {
	border-color: rgba(0, 0, 0, 0);
	background: #3B5998;
	color: #fff;
}

.btn-instagram {
	border-color: rgba(0, 0, 0, 0);
	background: #000;
	color: #fff;
}

.card {
	background-clip: padding-box;
	box-shadow: 0 1px 4px rgba(24, 28, 33, 0.012);
}

.row-bordered {
	overflow: hidden;
}

.account-settings-fileinput {
	position: absolute;
	visibility: hidden;
	width: 1px;
	height: 1px;
	opacity: 0;
}

.account-settings-links .list-group-item.active {
	font-weight: bold !important;
}

html:not(.dark-style) .account-settings-links .list-group-item.active {
	background: transparent !important;
}

.account-settings-multiselect ~ .select2-container {
	width: 100% !important;
}

.light-style .account-settings-links .list-group-item {
	padding: 0.85rem 1.5rem;
	border-color: rgba(24, 28, 33, 0.03) !important;
}

.light-style .account-settings-links .list-group-item.active {
	color: #4e5155 !important;
}

.material-style .account-settings-links .list-group-item {
	padding: 0.85rem 1.5rem;
	border-color: rgba(24, 28, 33, 0.03) !important;
}

.material-style .account-settings-links .list-group-item.active {
	color: #4e5155 !important;
}

.dark-style .account-settings-links .list-group-item {
	padding: 0.85rem 1.5rem;
	border-color: rgba(255, 255, 255, 0.03) !important;
}

.dark-style .account-settings-links .list-group-item.active {
	color: #fff !important;
}

.light-style .account-settings-links .list-group-item.active {
	color: #4E5155 !important;
}

.light-style .account-settings-links .list-group-item {
	padding: 0.85rem 1.5rem;
	border-color: rgba(24, 28, 33, 0.03) !important;
}
</style>

	<script type="text/javascript">
		
	</script>

</body>
</html>