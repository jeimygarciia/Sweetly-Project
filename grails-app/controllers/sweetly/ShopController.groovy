package sweetly

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER'])
class ShopController {

    def index() {}
}
