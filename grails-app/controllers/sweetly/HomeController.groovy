package sweetly

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])
class HomeController {
    static layout = 'home';

    def index() {}
}
