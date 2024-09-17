<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>


<body>

	<div class="fs_menu_overlay"></div>
	<!-- Hamburger Menu -->

	<div class="container product_section_container">
		<div class="row">
			<div class="col product_section clearfix">

				<!-- Breadcrumbs -->

				<div class="breadcrumbs d-flex flex-row align-items-center">
					<ul>
						<li><a href="home">Home</a></li>
						<li class="active"><a href="index.html"><i
								class="fa fa-angle-right" aria-hidden="true"></i>Men's</a></li>
					</ul>
				</div>

				<!-- Sidebar -->

				<div class="sidebar">
					<div class="sidebar_section">
						<div class="sidebar_title">
							<h5>Product Category</h5>
						</div>
						<ul class="sidebar_categories">
							<c:forEach items="${listC }" var="o">
								<li><a href="pagination?cid=${o.id}&page=1">${o._name }</a></li>
							</c:forEach>


						</ul>
					</div>

					<!-- Price Range Filtering -->
					<div class="sidebar_section">
						<div class="sidebar_title">
							<h5>Filter by Price</h5>
						</div>
						<p>
							<input type="text" id="amount" readonly
								style="border: 0; color: #f6931f; font-weight: bold;">
						</p>
						<div id="slider-range"></div>
						<div class="filter_button">
							<span>filter</span>
						</div>
					</div>

					<!-- Sizes -->
					<div class="sidebar_section">
						<div class="sidebar_title">
							<h5>Sizes</h5>
						</div>
						<ul class="checkboxes">
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>S</span></li>
							<li class="active"><i class="fa fa-square"
								aria-hidden="true"></i><span>M</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>L</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>XL</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>XXL</span></li>
						</ul>
					</div>

					<!-- Color -->
					<div class="sidebar_section">
						<div class="sidebar_title">
							<h5>Color</h5>
						</div>
						<ul class="checkboxes">
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>Black</span></li>
							<li class="active"><i class="fa fa-square"
								aria-hidden="true"></i><span>Pink</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>White</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>Blue</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>Orange</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>White</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>Blue</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>Orange</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>White</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>Blue</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>Orange</span></li>
						</ul>
						<div class="show_more">
							<span><span>+</span>Show More</span>
						</div>
					</div>

				</div>

				<!-- Main Content -->

				<div class="main_content">

					<!-- Products -->

					<div class="products_iso">
						<div class="row">
							<div class="col">

								<!-- Product Sorting -->

								<div
									class="product_sorting_container product_sorting_container_top">
									<ul class="product_sorting">
										<li><span class="type_sorting_text">Default
												Sorting</span> <i class="fa fa-angle-down"></i>
											<ul class="sorting_type">
												<li><span><a href="pagination?cid=${cid}&page=1&sort=0">Default
															Sorting</a></span></li>
												<li><span><a href="pagination?cid=${cid}&page=1&sort=1">Price</a></span></li>
												<li><span><a href="pagination?cid=${cid}&page=1&sort=2">Product
															Name</a></span></li>
											</ul></li>
										<li><span>Show</span> <span class="num_sorting_text">${sort}</span>
											<ul class="sorting_num">
												<i class="fa fa-angle-down"></i>
												<li class="num_sorting_btn"><span><a
														href="pagination?cid=${cid}&page=1&sort=6">6</a></span></li>
												<li class="num_sorting_btn"><span><a
														href="pagination?cid=${cid}&page=1&sort=12">12</a></span></li>
												<li class="num_sorting_btn"><span><a
														href="pagination?cid=${cid}&page=1&sort=24">24</a></span></li>
											</ul></li>
									</ul>
									<div class="pages d-flex flex-row align-items-center">
										<div class="page_current">
											<c:if test="${kt1 == 0 }">
												<span>1</span>
											</c:if>
											<c:if test="${kt1 !=0 }">
												<span>${page }</span>
											</c:if>

											<ul class="page_selection">
												<c:if test="${kt1 ==0 }">
													<c:forEach begin="1" end="${endPage}" var="i">
														<li class="page-item"><a
															class="page-link ${page==i? "
															active":"" }" href="pagination?keyword=${keyword}&cid=0&page=${i}">${i}</a></li>
													</c:forEach>
												</c:if>
												<c:if test="${kt1 ==1 }">
													<c:forEach begin="1" end="${endPage}" var="i">
														<li class="page-item"><a
															class="page-link ${page==i? "
															active":"" }" href="pagination?keyword=${keyword}&cid=0&page=${i}">${i}</a></li>
													</c:forEach>
												</c:if>
												<c:if test="${kt1 ==2 }">
													<c:forEach begin="1" end="${endPage}" var="i">
														<li class="page-item"><a
															class="page-link ${page==i? "
															active":"" }" href="pagination?keyword=${keyword}&cid=${cid }&page=${i}">${i}</a></li>
													</c:forEach>
												</c:if>
												<c:if test="${kt1 ==3 }">
													<c:forEach begin="1" end="${endPage}" var="i">
														<li class="page-item"><a
															class="page-link ${page==i? "
															active":"" }" href="pagination?cid=${cid }&page=${i}&sort=${sort}">${i}</a></li>
													</c:forEach>
												</c:if>



											</ul>
										</div>
										<div class="page_total">
											<span>of</span> ${endPage }
										</div>
										<div id="next_page" class="page_next">
											<c:if test="${kt1 ==0 }">
												<a href="pagination?keyword=${keyword}&cid=0&page=2"><i
													class="fa fa-long-arrow-right" aria-hidden="true"></i></a>
											</c:if>
											<c:if test="${kt1 ==1 }">
												<a
													href="pagination?keyword=${keyword}&cid=0&page=${page+1 }"><i
													class="fa fa-long-arrow-right" aria-hidden="true"></i></a>
											</c:if>
											<c:if test="${kt1 ==2 }">
												<a href="pagination?keyword=${keyword}&cid=${cid }&page=${page+1 }"><i
													class="fa fa-long-arrow-right" aria-hidden="true"></i></a>
											</c:if>
											<c:if test="${kt1 ==3 }">
												<a href="pagination?cid=${cid }&page=${page+1 }&sort=${sort}"><i
													class="fa fa-long-arrow-right" aria-hidden="true"></i></a>
											</c:if>
										</div>
									</div>

								</div>

								<!-- Product Grid -->

								<div class="product-grid">

									<c:forEach items="${listS}" var="p">
										<span>
											<div class="product-item men">
												<div class="product discount product_filter">
													<div class="product_image">
														<img src="${p._listImages}" alt="">
													</div>
													<div class="favorite favorite_left"></div>
													<div
														class="product_bubble product_bubble_right product_bubble_red d-flex flex-column align-items-center">
														<span>-$20</span>
													</div>
													<div class="product_info">
														<h6 class="product_name">
															<a href="productDetail?pid=${p.id}&cid=${p._categoryId}">${p._name}</a>
														</h6>
														<div class="product_price">
															$${p._promotionalPrice }<span>$${p._price }</span>
														</div>
													</div>
												</div>
												<div class="red_button add_to_cart_button">
													<a href="#">add to cart</a>
												</div>
											</div>
										</span>
									</c:forEach>
									<!-- Product Sorting -->

									<div
										class="product_sorting_container product_sorting_container_bottom clearfix">
										<ul class="product_sorting">
											<li><span>Show:</span> <span class="num_sorting_text">04</span>
												<i class="fa fa-angle-down"></i>
												<ul class="sorting_num">
													<li class="num_sorting_btn"><span>01</span></li>
													<li class="num_sorting_btn"><span>02</span></li>
													<li class="num_sorting_btn"><span>03</span></li>
													<li class="num_sorting_btn"><span>04</span></li>
												</ul></li>
										</ul>
										<span class="showing_results">Showing 1–3 of 12 results</span>
										<div class="pages d-flex flex-row align-items-center">
											<div class="page_current">
												<c:if test="${kt1 == 0 }">
													<span>1</span>
												</c:if>
												<c:if test="${kt1 !=0 }">
													<span>${page }</span>
												</c:if>

												<ul class="page_selection">
													<c:if test="${kt1 ==0 }">
														<c:forEach begin="1" end="${endPage}" var="i">
															<li class="page-item"><a
																class="page-link ${page==i? "
																active":"" }" href="pagination?keyword=${keyword}&cid=0&page=${i}">${i}</a></li>
														</c:forEach>
													</c:if>
													<c:if test="${kt1 ==1 }">
														<c:forEach begin="1" end="${endPage}" var="i">
															<li class="page-item"><a
																class="page-link ${page==i? "
																active":"" }" href="pagination?keyword=${keyword}&cid=0&page=${i}">${i}</a></li>
														</c:forEach>
													</c:if>
													<c:if test="${kt1 ==2 }">
														<c:forEach begin="1" end="${endPage}" var="i">
															<li class="page-item"><a
																class="page-link ${page==i? "
																active":"" }" href="pagination?cid=${cid }&page=${i}">${i}</a></li>
														</c:forEach>
													</c:if>
													<c:if test="${kt1 ==3 }">
													<c:forEach begin="1" end="${endPage}" var="i">
														<li class="page-item"><a
															class="page-link ${page==i? "
															active":"" }" href="pagination?cid=${cid }&page=${i}&sort=${sort}">${i}</a></li>
													</c:forEach>
												</c:if>



												</ul>
											</div>
											<div class="page_total">
												<span>of</span> ${endPage }
											</div>
											<div id="next_page" class="page_next">
												<c:if test="${kt1 ==0 }">
													<a href="pagination?keyword=${keyword}&cid=0&page=2"><i
														class="fa fa-long-arrow-right" aria-hidden="true"></i></a>
												</c:if>
												<c:if test="${kt1 ==1 }">
													<a
														href="pagination?keyword=${keyword}&cid=0&page=${page+1 }"><i
														class="fa fa-long-arrow-right" aria-hidden="true"></i></a>
												</c:if>
												<c:if test="${kt1 ==2 }">
													<a href="pagination?keyword=${keyword}&cid=${cid }&page=${page+1 }"><i
														class="fa fa-long-arrow-right" aria-hidden="true"></i></a>
												</c:if>
												<c:if test="${kt1 ==3 }">
												<a href="pagination?cid=${cid }&page=${page+1 }&sort=${sort}"><i
													class="fa fa-long-arrow-right" aria-hidden="true"></i></a>
											</c:if>
											</div>
										</div>

									</div>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Benefit -->

	<div class="benefit">
		<div class="container">
			<div class="row benefit_row">
				<div class="col-lg-3 benefit_col">
					<div class="benefit_item d-flex flex-row align-items-center">
						<div class="benefit_icon">
							<i class="fa fa-truck" aria-hidden="true"></i>
						</div>
						<div class="benefit_content">
							<h6>free shipping</h6>
							<p>Suffered Alteration in Some Form</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 benefit_col">
					<div class="benefit_item d-flex flex-row align-items-center">
						<div class="benefit_icon">
							<i class="fa fa-money" aria-hidden="true"></i>
						</div>
						<div class="benefit_content">
							<h6>cach on delivery</h6>
							<p>The Internet Tend To Repeat</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 benefit_col">
					<div class="benefit_item d-flex flex-row align-items-center">
						<div class="benefit_icon">
							<i class="fa fa-undo" aria-hidden="true"></i>
						</div>
						<div class="benefit_content">
							<h6>45 days return</h6>
							<p>Making it Look Like Readable</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 benefit_col">
					<div class="benefit_item d-flex flex-row align-items-center">
						<div class="benefit_icon">
							<i class="fa fa-clock-o" aria-hidden="true"></i>
						</div>
						<div class="benefit_content">
							<h6>opening all week</h6>
							<p>8AM - 09PM</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Newsletter -->

	<div class="newsletter">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div
						class="newsletter_text d-flex flex-column justify-content-center align-items-lg-start align-items-md-center text-center">
						<h4>Newsletter</h4>
						<p>Subscribe to our newsletter and get 20% off your first
							purchase</p>
					</div>
				</div>
				<div class="col-lg-6">
					<div
						class="newsletter_form d-flex flex-md-row flex-column flex-xs-column align-items-center justify-content-lg-end justify-content-center">
						<input id="newsletter_email" type="email" placeholder="Your email"
							required="required" data-error="Valid email is required.">
						<button id="newsletter_submit" type="submit"
							class="newsletter_submit_btn trans_300" value="Submit">subscribe</button>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>

</html>
