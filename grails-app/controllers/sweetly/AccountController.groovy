package sweetly

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])
class AccountController {

    def index() {}
}
