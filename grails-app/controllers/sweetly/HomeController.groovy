package sweetly

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER'])
class HomeController {

    static layout = 'home';

    def index() {}
}
