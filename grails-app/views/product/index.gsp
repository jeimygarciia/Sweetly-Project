<!DOCTYPE html>
<html lang="en-US" itemscope="itemscope" itemtype="http://schema.org/WebPage">

<body class="full-width list-view columns-1 archive woocommerce-page">
<div id="page" class="hfeed site">

    <div id="content" class="site-content" tabindex="-1">
        <div class="col-full">
            <div class="pizzaro-sorting">
                <div class="food-type-filter">
                    <div class="clear-food-type-filter chosen"><a href="#">Show All</a>
                    </div>
                    <div class="widget woocommerce widget_layered_nav">
                        <ul>
                            <li class="wc-layered-nav-term "><a href="#">Cakes</a> <span class="food-type-icon"><i class="fas fa-birthday-cake"></i></span></li>
                            <li class="wc-layered-nav-term "><a href="#">Cheesecakes</a> <span class="food-type-icon"><i class="fas fa-cheese"></i></span></li>
                            <li class="wc-layered-nav-term "><a href="#">Cookies</a> <span class="food-type-icon"><i class="fas fa-cookie"></i></span></li>
                        </ul>
                    </div>
                    <div class="create-your-own"><a href="single-product-v3.html">Create your own</a></div>
                </div>
            </div>
          <g:each in="${product}" var="pro">
              <div id="primary" class="content-area">
                <main id="main" class="site-main" >
                    <ul class="products">
                        <li class="post-82 product type-product status-publish has-post-thumbnail product_cat-pizza instock shipping-taxable purchasable product-type-simple addon-product">
                            <div class="product-outer">
                                <div class="product-inner">
                                    <div class="product-image-wrapper">
                                    ${pro.imagen}
                                        <a href="single-product-v2.html" class="woocommerce-LoopProduct-link"><img width="600" height="280" src="assets/images/products/9.jpg" class="attachment-pizzaro-product-list-fw-col-1 size-pizzaro-product-list-fw-col-1" alt="84" title="84"></a>
                                    </div>
                                    <div class="product-content-wrapper">
                                        <a href="single-product-v2.html" class="woocommerce-LoopProduct-link">
                                            <h3>${pro.nombre}</h3>
                                            <div itemprop="description">
                                                ${pro.detalle}
                                            </div>
                                            <div class="yith_wapo_groups_container">
                                                <div class="ywapo_group_container ywapo_group_container_radio form-row form-row-wide " data-requested="1" data-type="radio" data-id="1" data-condition="">
                                                    <h3><span>Pick Size</span></h3>
                                                    <div class="ywapo_input_container ywapo_input_container_radio">

                                                        <span class="ywapo_label_tag_position_after"><span class="ywapo_option_label ywapo_label_position_after">1 libra</span></span>
                                                        <span class="ywapo_label_price">
                                                            <span class="woocommerce-Price-amount amount"><span class="woocommerce-Price-currencySymbol">$</span>${pro.precio}</span>
                                                        </span>
                                                    </div>
                                                    <div class="ywapo_input_container ywapo_input_container_radio">

                                                        <span class="ywapo_label_tag_position_after"><span class="ywapo_option_label ywapo_label_position_after">2 libras</span></span>
                                                        <span class="ywapo_label_price">
                                                            <span class="woocommerce-Price-amount amount"><span class="woocommerce-Price-currencySymbol">$</span>3.000</span>
                                                        </span>
                                                    </div>
                                                </div>
                                            </div>
                                        </a>
                                        <div class="hover-area"><a rel="nofollow" href="single-product-v2.html" data-quantity="1" data-product_id="82" data-product_sku="" class="button product_type_simple add_to_cart_button ajax_add_to_cart">Select Options</a></div>
                                    </div>
                                </div>
                                <!-- /.product-inner -->
                            </div>
                            <!-- /.product-outer -->
                        </li>

                    </ul>
          </g:each>
                    <nav class="woocommerce-pagination">
                        <ul class="page-numbers">
                            <li><span class="page-numbers current">1</span></li>
                            <li><a class="page-numbers" href="#">2</a></li>
                            <li><a class="page-numbers" href="#">3</a></li>
                            <li><a class="next page-numbers" href="#">Next Page &nbsp;&nbsp;&nbsp;→</a></li>
                        </ul>
                    </nav>
                </main>
                <!-- #main -->
            </div>
            <!-- #primary -->
        </div>
        <!-- .col-full -->
    </div>

</body>
</html>