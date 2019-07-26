package sweetly

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER'])
class AccountController {

    def index() {}
}
