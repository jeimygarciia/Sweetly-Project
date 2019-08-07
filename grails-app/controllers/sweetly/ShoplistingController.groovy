package sweetly

import grails.plugin.springsecurity.annotation.Secured
import org.springframework.web.servlet.ModelAndView

@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
class ShoplistingController {
    static layout = 'home'
    def index() {

        return new ModelAndView('shoplisting')
    }
}
