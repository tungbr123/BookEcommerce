<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<
<section class="jumbotron text-center">
	<div class="container">
		<h1 class="jumbotron-heading">E-COMMERCE PRODUCT</h1>
		<p class="lead text-muted mb-0">Le Lorem Ipsum est simplement du
			faux texte employé dans la composition et la mise en page avant
			impression. Le Lorem Ipsum est le faux texte standard de l'imprimerie
			depuis les années 1500...</p>
	</div>
</section>
<div class="container">
	<div class="row">
		<div class="col">
			<nav aria-label="breadcrumb">
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="home">Home</a></li>
					<li class="breadcrumb-item"><a href="#">Category</a></li>
					<li class="breadcrumb-item active" aria-current="page">Product</li>
				</ol>
			</nav>
		</div>
	</div>
</div>
<div class="container">
	<div class="row">
		<!-- Image -->
		<div class="col-12 col-lg-6">
			<div class="card bg-light mb-3">
				<div class="card-body">
					<a href="" data-toggle="modal" data-target="#productModal"> <img
						class="img-fluid" src="${product._listImages}" />
						<p class="text-center">Zoom</p>
					</a>
				</div>
			</div>
		</div>

		<!-- Add to cart -->
		<div class="col-12 col-lg-6 add_to_cart_block">
			<div class="card bg-light mb-3">
				<div class="card-body">
				<form method="post" action="productDetail">
					<div class="alert alert-success">
						<strong>${mess}</strong>
					</div>
					<h5 class="cname">Danh mục:"${cate._name }"</h5>${product._name }
					<p class="price">${product._price}$</p>
					<p class="price_discounted">${product._promotionalPrice}$</p>
					
						<div class="form-group">
							<label for="colors">Color</label> <select class="custom-select"
								id="colors">
								<option selected>Select</option>
								<option value="1">Blue</option>
								<option value="2">Red</option>
								<option value="3">Green</option>
							</select>
						</div>
						<div class="form-group">
							<label>Quantity :</label>
							<div class="input-group mb-3">
								
								<input type="text" class="form-control" 
									name="quantity" min="1" max="100" value="${quantity }">
								

							</div>
						</div>
						<div>
							  <button type="submit" class="btn btn-success btn-lg btn-block text-uppercase">
                             Add To Cart
                        </button>
                        </div>
					
					<div class="product_rassurance">
						<ul class="list-inline">
							<li class="list-inline-item"><i class="fa fa-truck fa-2x"></i><br />Fast
								delivery</li>
							<li class="list-inline-item"><i
								class="fa fa-credit-card fa-2x"></i><br />Secure payment</li>
							<li class="list-inline-item"><i class="fa fa-phone fa-2x"></i><br />+33
								1 22 54 65 60</li>
						</ul>
					</div>
					<div class="reviews_product p-3 mb-2 ">
						3 reviews <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i> (4/5) <a class="pull-right"
							href="#reviews">View all reviews</a>
					</div>
					<div class="datasheet p-3 mb-2 bg-info text-white">
						<a href="" class="text-white"><i class="fa fa-file-text"></i>
							Download DataSheet</a>
					</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<div class="row">
		<!-- Description -->
		<div class="col-12">
			<div class="card border-light mb-3">
				<div class="card-header bg-primary text-white text-uppercase">
					<i class="fa fa-align-justify"></i> Description
				</div>
				<div class="card-body">
					<p class="card-text">${product._description}</p>

				</div>
			</div>
		</div>

		<!-- Reviews -->
		<div class="col-12" id="reviews">
			<div class="card border-light mb-3">
				<div class="card-header bg-primary text-white text-uppercase">
					<i class="fa fa-comment"></i> Reviews
				</div>
				<div class="card-body">
					<div class="review">
						<span class="glyphicon glyphicon-calendar" aria-hidden="true"></span>
						<meta itemprop="datePublished" content="01-01-2016">
						January 01, 2018 <span class="fa fa-star"></span> <span
							class="fa fa-star"></span> <span class="fa fa-star"></span> <span
							class="fa fa-star"></span> <span class="fa fa-star"></span> by
						Paul Smith
						<p class="blockquote">
						<p class="mb-0">Lorem ipsum dolor sit amet, consectetur
							adipiscing elit. Integer posuere erat a ante.</p>
						</p>
						<hr>
					</div>
					<div class="review">
						<span class="glyphicon glyphicon-calendar" aria-hidden="true"></span>
						<meta itemprop="datePublished" content="01-01-2016">
						January 01, 2018 <span class="fa fa-star" aria-hidden="true"></span>
						<span class="fa fa-star" aria-hidden="true"></span> <span
							class="fa fa-star" aria-hidden="true"></span> <span
							class="fa fa-star" aria-hidden="true"></span> <span
							class="fa fa-star" aria-hidden="true"></span> by Paul Smith
						<p class="blockquote">
						<p class="mb-0">Lorem ipsum dolor sit amet, consectetur
							adipiscing elit. Integer posuere erat a ante.</p>
						</p>
						<hr>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


