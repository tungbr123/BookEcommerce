<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<!-- Site meta -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Free Bootstrap 4 Ecommerce Template</title>
<!-- CSS -->

</head>
<body>
	<nav class="navbar navbar-expand-md navbar-dark bg-dark">
		<div class="container">
			<a class="navbar-brand" href="index.html">Simple Ecommerce</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarsExampleDefault"
				aria-controls="navbarsExampleDefault" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse justify-content-end"
				id="navbarsExampleDefault">
				<ul class="navbar-nav m-auto">
					<li class="nav-item m-auto"><a class="nav-link"
						href="index.html">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="category.html">Categories</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="product.html">Product</a>
					</li>
					<li class="nav-item active"><a class="nav-link"
						href="contact.html">Cart <span class="sr-only">(current)</span></a>
					</li>
					<li class="nav-item"><a class="nav-link" href="contact.html">Contact</a>
					</li>
				</ul>

				<form class="form-inline my-2 my-lg-0">
					<div class="input-group input-group-sm">
						<input type="text" class="form-control" aria-label="Small"
							aria-describedby="inputGroup-sizing-sm" placeholder="Search...">
						<div class="input-group-append">
							<button type="button" class="btn btn-secondary btn-number">
								<i class="fa fa-search"></i>
							</button>
						</div>
					</div>
					<a class="btn btn-success btn-sm ml-3" href="cart.html"> <i
						class="fa fa-shopping-cart"></i> Cart <span
						class="badge badge-light">3</span>
					</a>
				</form>
			</div>
		</div>
	</nav>
	<section class="jumbotron text-center">
		<div class="container">
			<h1 class="jumbotron-heading">E-COMMERCE CART</h1>
		</div>
	</section>
	<div class="container mb-4">
		<div class="row">
			<div class="col-12">
				<div class="table-responsive">
					<table class="table table-striped">
						<thead>
							<tr>
								<th scope="col"></th>
								<th scope="col">Product</th>
								<th scope="col">Price</th>
								<th scope="col" class="text-center">Quantity</th>
								<th scope="col" class="text-right">PriceTotal</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${sessionScope.ListCartItem }" var= "p"> 
							<tr>
								<td><img src="" />
								</td>
								<td>${p._productId._name }</td>
								<td>${p._productId._promotionalPrice }</td>
								<td><input class="form-control" type="text" value="${p._count }" /></td>
								<td class="text-right">${p._productId._promotionalPrice * p._count }</td>
								<td class="text-right"><a href="delete?id=${p.id }"><button
										class="btn btn-sm btn-danger">
										<i class="fa fa-trash"></i>
									</button></a></td>
							</tr>
							</c:forEach>
							<tr>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td>Sub-Total</td>
								<td class="text-right">${sessionScope.total}</td>
							</tr>
							<tr>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td>Shipping</td>
								<td class="text-right">Free</td>
							</tr>
							<tr>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td><strong>Total</strong></td>
								<td class="text-right"><strong>${sessionScope.total}</strong></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div class="col mb-2">
				<div class="row">
					<div class="col-sm-12  col-md-6">
						<a href="home"><button class="btn btn-block btn-light">Continue Shopping</button></a>
					</div>
					<div class="col-sm-12 col-md-6 text-right">
						<a href="checkout"><button class="btn btn-lg btn-block btn-success text-uppercase">Check Out</button></a>
					</div>
				</div>
			</div>
		</div>
	</div>



	<!-- JS -->
	<script src="//code.jquery.com/jquery-3.2.1.slim.min.js"
		type="text/javascript"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		type="text/javascript"></script>
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		type="text/javascript"></script>

</body>
</html>
