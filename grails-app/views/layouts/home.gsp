<html>
<head>

    <title>
        <g:layoutTitle default="Sweetly"/>
    </title>
    <g:layoutHead/>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <asset:stylesheet src="style.css"/>
    <asset:stylesheet src="font-awesome.min.css"/>
    <asset:stylesheet src="animate.min.css"/>
    <asset:stylesheet src="font-pizzaro.css"/>
    <asset:stylesheet src="colors/red.css"/>
    <asset:stylesheet src="jquery.mCustomScrollbar.min.css"/>
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800%7CYanone+Kaffeesatz:200,300,400,700"
          rel="stylesheet">
    <link rel="shortcut icon" href="assets/images/fav-icon.png">
    <asset:link rel="icon" href="sweetly-favicon.png" type="image"/>
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800%7CYanone+Kaffeesatz:200,300,400,700"
          rel="stylesheet"/>



</head>

<body class="page-template-template-homepage-v1 home-v1">
<div id="page" class="hfeed site">
    <header id="masthead" class="site-header header-v1" style="background-image: none; ">
        <div class="col-full">
            <a class="skip-link screen-reader-text" href="#site-navigation">Skip to navigation</a>
            <a class="skip-link screen-reader-text" href="#content">Skip to content</a>

            <div class="header-wrap">
                <div class="site-branding">
                    <a href="/home" class="custom-logo-link " rel="home">
                        <asset:image src="Sweetly.png" alt="SweetlyLogo"> </asset:image>
                    </a>
                </div>
                <nav id="site-navigation" class="main-navigation" aria-label="Primary Navigation">
                    <button class="menu-toggle" aria-controls="site-navigation" aria-expanded="false"><span
                            class="close-icon"><i class="po po-close-delete"></i></span><span class="menu-icon"><i
                            class="po po-menu-icon"></i></span><span class=" screen-reader-text">Menu</span></button>

                    <div class="primary-navigation">
                        <ul id="menu-main-menu" class="menu nav-menu" aria-expanded="false">
                            <li class="menu-item"><a href="/home/index">Home</a></li>
                            <li class="yamm-fw menu-item menu-item-has-children">
                                <a href="/account/login_registro">Account</a>
                                <ul class="sub-menu">
                                    <li class="menu-item">

                                        <div class="kc-elm kc-css-4169277 kc_row">
                                            <div class="kc-row-container  kc-container">
                                                <div class="kc-wrap-columns">
                                                    <div class="col-sm-3 col-xs-12 col-md-3 col-lg-3">
                                                        <div class="kc-col-container">
                                                            <div class="widget widget_nav_menu kc-elm kc-css-1908114">
                                                                <div class="menu-pages-menu-1-container">

                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <div class="col-sm-3 col-xs-12 col-md-3 col-lg-3">
                                                        <div class="kc-col-container">
                                                            <div class="widget widget_nav_menu kc-elm kc-css-2420681">
                                                                <div class="menu-pages-menu-2-container">

                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <div class="col-sm-3 col-xs-12 col-md-3 col-lg-3">
                                                        <div class="kc-col-container">
                                                            <div class="widget widget_nav_menu kc-elm kc-css-3102392">
                                                                <div class="menu-pages-menu-3-container">

                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <div class="col-sm-3 col-xs-12 col-md-3 col-lg-3">
                                                        <div class="kc-col-container">
                                                            <div class="widget widget_nav_menu kc-elm kc-css-3447423">
                                                                <div class="menu-pages-menu-4-container">

                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                    </li>
                                </ul>
                            </li>
                            <li class="menu-item"><a href="/shoplisting/index">Shop Listing</a></li>
                            <li class="menu-item"><a href="/contacto/index">Contact</a></li>
                        </ul>
                    </div>

                    <div class="handheld-navigation">
                        <span class="phm-close">Close</span>
                        <ul class="menu">
                            <li class="menu-item"><a href="/product"><i
                                    class="fas fa-birthday-cake"></i>Cakes</a></li>
                            <li class="menu-item"><a href="/product"><i
                                    class="fas fa-cheese"></i>Cheesecakes</a></li>
                            <li class="menu-item"><a href="/product"><i class="fas fa-cookie"></i>Cookies
                            </a></li>
                        </ul>
                    </div>
                </nav>
                <!-- #site-navigation -->
                <div class="header-info-wrapper">
                    <div class="header-phone-numbers">
                        <span class="intro-text">Call and Order in</span>
                        <select class="select-city-phone-numbers" name="city-phone-numbers" id="city-phone-numbers">
                            <option value="54 548 779 654">London</option>
                            <option value="33 398 621 710">Paris</option>
                            <option value="718 54 674 021">New York</option>
                        </select>
                        <span id="city-phone-number-label" class="phone-number">54 548 779 654</span>
                    </div>
                    <ul class="site-header-cart-v2 menu">
                        <li class="cart-content ">
                            <a href="cart.html" title="View your shopping cart">
                                <i class="fas fa-cart-plus"></i>
                                <span>Go to Your Cart</span>
                            </a>
                            <ul class="sub-menu">
                                <li>
                                    <a href="cart.html" title="View your shopping cart">
                                        <span class="count">2 items</span> <span class="amount">$50.00</span>
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>

            <div class="pizzaro-secondary-navigation">
                <nav class="secondary-navigation" aria-label="Secondary Navigation">
                    <ul class="menu">
                        <li class="menu-item"><a href="/product"><i
                                class="fas fa-birthday-cake"></i>Cakes</a></li>
                        <li class="menu-item"><a href="/product"><i class="fas fa-cheese"></i>Cheesecakes
                        </a></li>
                        <li class="menu-item"><a href="/product"><i class="fas fa-cookie"></i>Cookies</a>
                        </li>

                    </ul>
                </nav>
                <!-- #secondary-navigation -->
            </div>
        </div>
    </header>
    <g:layoutBody/>

    <footer id="colophon" class="site-footer footer-v1">
        <div class="col-full">
            <div class="footer-social-icons">
                <span class="social-icon-text">Follow us</span>
                <ul class="social-icons list-unstyled">
                    <li><a class="fab fa-facebook-f" href="#"></a></li>
                    <li><a class="fab fa-instagram" href="#"></a></li>
                </ul>
            </div>

            <div class="footer-logo">
                <a href="/home" class="custom-logo-link"  rel="home">
                    <asset:image src="Sweetly.png" alt="SweetlyLogo"> </asset:image>
                </a>
            </div>

            <div class="site-address">
                <ul class="address">
                    <li>Sweetly Bakery</li>
                    <li>901-947 South Drive, Houston, TX 77057, USA</li>
                    <li>Telephone: +1 555 1234</li>
                    <li>Fax: +1 555 4444</li>
                </ul>
            </div>

            <div class="site-info">
                <p class="copyright">Copyright &copy; 2019 Sweetly Template. All rights reserved.</p>
            </div>

            <div class="pizzaro-handheld-footer-bar">
                <ul class="columns-3">
                    <li class="my-account">
                        <a href="login-and-register.html">My Account</a>
                    </li>
                    <li class="search">
                        <a href="">Search</a>

                        <div class="site-search">
                            <div class="widget woocommerce widget_product_search">
                                <form role="search" method="get" class="woocommerce-product-search">
                                    <label class="screen-reader-text"
                                           for="woocommerce-product-search-field">Search for:</label>
                                    <input type="search" id="woocommerce-product-search-field" class="search-field"
                                           placeholder="Search Products&hellip;" value="" name="s" title="Search for:"/>
                                    <input type="submit" value="Search"/>
                                    <input type="hidden" name="post_type" value="product"/>
                                </form>
                            </div>
                        </div>
                    </li>
                    <li class="cart">
                        <a class="footer-cart-contents" href="cart.html" title="View your shopping cart">
                            <span class="count">2</span>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <!-- .col-full -->
    </footer>
    <!-- #colophon -->
</div>
<script src="https://kit.fontawesome.com/c6b4448aaa.js"></script>

<asset:javascript src="https://kit.fontawesome.com/c6b4448aaa.js"/>
<asset:javascript src="jquery.min.js"/>
<asset:javascript src="tether.min.js"/>
<asset:javascript src="bootstrap.min.js"/>
<asset:javascript src="owl.carousel.min.js"/>
<asset:javascript src="social.share.min.js"/>
<asset:javascript src="jquery.mCustomScrollbar.concat.min.js"/>
<asset:javascript src="scripts.min.js"/>

</body>
</html>
