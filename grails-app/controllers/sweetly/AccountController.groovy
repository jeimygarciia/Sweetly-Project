package sweetly

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER'])
class AccountController {

    def index() {

        if(!isLoggedIn())
        {
            redirect(uri:"/login/auth")
        }
        else
            redirect(uri:"/home")
    }
}
