<!DOCTYPE html>
<html lang="en-US" itemscope="itemscope" itemtype="http://schema.org/WebPage">

<body class="woocommerce-checkout">

    <div id="content" class="site-content" tabindex="-1" >
        <div class="col-full">
            <div class="pizzaro-breadcrumb">
                <nav class="woocommerce-breadcrumb" ><a href="index.html">Home</a>
                    <span class="delimiter"><i class="po po-arrow-right-slider"></i></span>Checkout
                </nav>
            </div>
            <!-- .woocommerce-breadcrumb -->
            <div id="primary" class="content-area">
                <main id="main" class="site-main" >
                    <div class="pizzaro-order-steps">
                        <ul>
                            <li class="cart">
                                <span class="step">1</span>Shopping Cart
                            </li>
                            <li class="checkout">
                                <span class="step">2</span>Checkout
                            </li>
                            <li class="complete">
                                <span class="step">3</span>Order Complete
                            </li>
                        </ul>
                    </div>
                    <div id="post-9" class="post-9 page type-page status-publish hentry">
                        <div class="entry-content">
                            <div class="woocommerce">
                                <form name="checkout"  class="checkout woocommerce-checkout" action="#" enctype="multipart/form-data">
                                    <div class="col2-set" id="customer_details">
                                        <div class="col-1">
                                            <div class="woocommerce-billing-fields">
                                                <h3>Billing Details</h3>
                                                <p class="form-row form-row form-row-first validate-required" id="billing_first_name_field">
                                                    <label for="billing_first_name" class="">First Name </label>
                                                    <input type="text" class="input-text " name="billing_first_name" id="billing_first_name" placeholder=""  autocomplete="given-name" value=""  />
                                                </p>
                                                <p class="form-row form-row form-row-last validate-required" id="billing_last_name_field">
                                                    <label for="billing_last_name" class="">Last Name </label>
                                                    <input type="text" class="input-text " name="billing_last_name" id="billing_last_name" placeholder=""  autocomplete="family-name" value=""  />
                                                </p>

                                                <p class="form-row form-row form-row-first validate-required validate-email" id="billing_email_field">
                                                    <label for="billing_email" class="">Email Address </label>
                                                    <input type="email" class="input-text " name="billing_email" id="billing_email" placeholder=""  autocomplete="email" value=""  />
                                                </p>
                                                <p class="form-row form-row form-row-last validate-required validate-phone" id="billing_phone_field">
                                                    <label for="billing_phone" class="">Phone </label>
                                                    <input type="tel" class="input-text " name="billing_phone" id="billing_phone" placeholder=""  autocomplete="tel" value=""  />
                                                </p>

                                                <div class="clear"></div>
                                                <p class="form-row form-row form-row-wide address-field validate-required" id="billing_address_1_field">
                                                    <label for="billing_address_1" class="">Address </label>
                                                    <input type="text" class="input-text " name="billing_address_1" id="billing_address_1" placeholder="Street address"  autocomplete="address-line1" value=""  />
                                                </p>
                                                <p class="form-row form-row form-row-wide address-field" id="billing_address_2_field">
                                                    <input type="text" class="input-text " name="billing_address_2" id="billing_address_2" placeholder="Apartment, suite, unit etc. (optional)"  autocomplete="address-line2" value=""  />
                                                </p>
                                                <p class="form-row form-row form-row-wide address-field validate-required" id="billing_city_field">
                                                    <label for="billing_city" class="">Town / City </label>
                                                    <input type="text" class="input-text " name="billing_city" id="billing_city" placeholder=""  autocomplete="address-level2" value=""  />
                                                </p>
                                                <p class="form-row form-row form-row-first address-field validate-required validate-state" id="billing_state_field">
                                                    <label for="billing_state" class="">State / County </label>
                                                    <input type="text" value="" placeholder="" id="billing_state" name="billing_phone" class="input-text ">
                                                </p>
                                                <p class="form-row form-row form-row-last address-field validate-required validate-postcode" id="billing_postcode_field">
                                                    <label for="billing_postcode" class="">Postcode / ZIP </label>
                                                    <input type="text" class="input-text " name="billing_postcode" id="billing_postcode" placeholder=""  autocomplete="postal-code" value="DFSAF@GMAIL.COM"  />
                                                </p>
                                                <div class="clear"></div>
                                                <p class="form-row form-row-wide create-account">
                                                </p>
                                                <div class="create-account">
                                                    <p class="form-row form-row validate-required" id="account_password_field">
                                                    </p>
                                                    <div class="clear"></div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-2">
                                            <div class="woocommerce-shipping-fields">
                                                <h3>Additional Information</h3>
                                                <p class="form-row form-row notes" id="order_comments_field">
                                                    <label for="order_comments" class="">Order Notes</label>
                                                    <textarea name="order_comments" class="input-text " id="order_comments" placeholder="Notes about your order, e.g. special notes for delivery."    rows="2" cols="5"></textarea>
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                    <h3 id="order_review_heading">Your order</h3>
                                    <div id="order_review" class="woocommerce-checkout-review-order">
                                        <table class="shop_table woocommerce-checkout-review-order-table">
                                            <thead>
                                            <tr>
                                                <th class="product-name">Product</th>
                                                <th class="product-total">Total</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr class="cart_item">
                                                <td class="product-name">
                                                    <strong class="product-quantity">&times; </strong>
                                                    <dl class="variation">
                                                        <dt class="variation-Baseprice">Base price:</dt>
                                                        <dd class="variation-Baseprice">
                                                            <p><span class="woocommerce-Price-amount amount"><span class="woocommerce-Price-currencySymbol">&#036;</span>0.00</span></p>
                                                        </dd>
                                                        <dt class="variation-PickSizespanclasswoocommerce-Price-amountamountspanclasswoocommerce-Price-currencySymbol36span2590span">Pick Size ( <span class="woocommerce-Price-amount amount"><span class="woocommerce-Price-currencySymbol">&#036;</span>00.00</span> ):
                                                        </dt>
                                                        <dd class="variation-PickSizespanclasswoocommerce-Price-amountamountspanclasswoocommerce-Price-currencySymbol36span2590span">
                                                            <p></p>
                                                        </dd>
                                                    </dl>
                                                </td>
                                                <td class="product-total">
                                                    <span class="woocommerce-Price-amount amount">
                                                        <span class="woocommerce-Price-currencySymbol">&#36;</span>00.00</span>
                                                </td>
                                            </tr>
                                            <tr class="cart_item">
                                                <td class="product-name">
                                                    <strong class="product-quantity">&times; </strong>
                                                    <dl class="variation">
                                                        <dt class="variation-Baseprice">Base price:</dt>
                                                        <dd class="variation-Baseprice">
                                                            <p><span class="woocommerce-Price-amount amount"><span class="woocommerce-Price-currencySymbol">&#036;</span>0.00</span></p>
                                                        </dd>
                                                        <dt class="variation-PickSizespanclasswoocommerce-Price-amountamountspanclasswoocommerce-Price-currencySymbol36span2590span">Pick Size ( <span class="woocommerce-Price-amount amount"><span class="woocommerce-Price-currencySymbol">&#036;</span>00.00</span> ):</dt>
                                                        <dd class="variation-PickSizespanclasswoocommerce-Price-amountamountspanclasswoocommerce-Price-currencySymbol36span2590span">
                                                            <p></p>
                                                        </dd>
                                                    </dl>
                                                </td>
                                                <td class="product-total">
                                                    <span class="woocommerce-Price-amount amount">
                                                        <span class="woocommerce-Price-currencySymbol">&#36;</span>00.00</span>
                                                </td>
                                            </tr>
                                            </tbody>
                                            <tfoot>
                                            <tr class="cart-subtotal">
                                                <th>Subtotal</th>
                                                <td>
                                                    <span class="woocommerce-Price-amount amount">
                                                        <span class="woocommerce-Price-currencySymbol">&#36;</span>00.80</span>
                                                </td>
                                            </tr>
                                            <tr class="order-total">
                                                <th>Total</th>
                                                <td>
                                                    <strong><span class="woocommerce-Price-amount amount"><span class="woocommerce-Price-currencySymbol">&#36;</span>00.80</span></strong>
                                                </td>
                                            </tr>
                                            </tfoot>
                                        </table>
                                        <div id="payment" class="woocommerce-checkout-payment">

                                            <p class="form-row terms wc-terms-and-conditions">
                                                <input type="checkbox" class="input-checkbox" name="terms"  id="terms" />
                                                <label for="terms" class="checkbox">I&rsquo;ve read and accept the <a href="terms-and-conditions.html" target="_blank">terms &amp; conditions</a> <span class="required">*</span></label>
                                                <input type="hidden" name="terms-field" value="1" />
                                            </p>
                                            <a class="button alt" href="order-received.html" style="text-align: center;">Place order</a>
                                        </div>
                                    </div>
                            </div>
                        </form>
                        </div>
                    </div>
                    <!-- .entry-content -->
            </div>
            <!-- #post-## -->
        </main>
            <!-- #main -->
        </div>
        <!-- #primary -->
    </div>
    <!-- .col-full -->
</div>
</body>
</html>
