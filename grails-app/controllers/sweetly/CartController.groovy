package sweetly

import grails.plugin.springsecurity.annotation.Secured
import org.springframework.web.servlet.ModelAndView

@Secured(['ROLE_USER'])
class CartController {

    def index() {
        return new ModelAndView("cart")
    }
}
