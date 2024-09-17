<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!-- Header -->

<header class="header trans_300">

	<!-- Top Navigation -->

	<div class="top_nav">
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<div class="top_nav_left">free shipping on all u.s orders
						over $50</div>
				</div>
				<div class="col-md-6 text-right">
					<div class="top_nav_right">
						<ul class="top_nav_menu">

							<!-- Currency / Language / My Account -->

							<li class="currency"><a href="#"> usd <i
									class="fa fa-angle-down"></i>
							</a>
								<ul class="currency_selection">
									<li><a href="#">cad</a></li>
									<li><a href="#">aud</a></li>
									<li><a href="#">eur</a></li>
									<li><a href="#">gbp</a></li>
								</ul></li>
							<li class="language"><a href="#"> English <i
									class="fa fa-angle-down"></i>
							</a>
								<ul class="language_selection">
									<li><a href="#">French</a></li>
									<li><a href="#">Italian</a></li>
									<li><a href="#">German</a></li>
									<li><a href="#">Spanish</a></li>
								</ul></li>
							<c:if test="${sessionScope.acc == null }">
								<li class="account"><a href="#"> My Account <i
										class="fa fa-angle-down"></i>
								</a>

									<ul class="account_selection">
										<li><a href="login"><i class="fa fa-sign-in"
												aria-hidden="true"></i>Sign In</a></li>
										<li><a href="register"><i class="fa fa-user-plus"
												aria-hidden="true"></i>Register</a></li>
									</ul></li>
							</c:if>
							<c:if test="${sessionScope.acc != null }">
								<li class="account"><a href="#"> ${sessionScope.acc._firstname } <i
										class="fa fa-angle-down"></i>
								</a>
									<ul class="account_selection">
										<li><a href="logout"><i class="fa fa-sign-in"
												aria-hidden="true"></i>Sign Out</a></li>
										<li><a href="profile"><i class="fa fa-sign-in"
												aria-hidden="true"></i>Profile</a></li>

									</ul></li>
							</c:if>
						</ul>

					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Main Navigation -->

	<div class="main_nav_container">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-right">
					<div class="logo_container">
						<a href="#">colo<span>shop</span></a>
					</div>
					<nav class="navbar">
						<ul class="navbar_menu">
							<li><a href="home">home</a></li>
							<li><a href="#">shop</a></li>
							<li><a href="#">promotion</a></li>
							<li><a href="#">pages</a></li>
							<li><a href="#">blog</a></li>
							<li><a href="contact.html">contact</a></li>

						</ul>
						<ul class="navbar_user">
							<form action="search" class="form-inline my-2 my-lg-0">
								<input class="form-control mr-sm-2" type="search" name="keyword"
									value="${keyword }" placeholder="Search" aria-label="Search">
								<button class="btn btn-outline-success my-2 my-sm-0"
									type="submit">Search</button>
							</form>
							<li><a href="#"><i class="fa fa-user" aria-hidden="true"></i></a></li>
							<li class="checkout">
							<c:if test="${sessionScope.acc != null }">
							<a href="cart?id=${sessionScope.acc.id }"> <i
									class="fa fa-shopping-cart" aria-hidden="true"></i> <span
									id="checkout_items" class="checkout_items">2</span>
							</a>
							</c:if>
							<c:if test="${sessionScope.acc == null }">
							<a href="login"> <i
									class="fa fa-shopping-cart" aria-hidden="true"></i> <span
									id="checkout_items" class="checkout_items">2</span>
							</a>
							</c:if></li>
						</ul>
						<div class="hamburger_container">
							<i class="fa fa-bars" aria-hidden="true"></i>
						</div>
					</nav>
				</div>
			</div>
		</div>
	</div>

</header>