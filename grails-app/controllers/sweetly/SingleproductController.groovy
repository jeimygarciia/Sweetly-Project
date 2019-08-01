package sweetly

import grails.plugin.springsecurity.annotation.Secured
import org.springframework.web.servlet.ModelAndView

@Secured(['ROLE_USER'])
class SingleproductController {
    static layout = 'home'
    def index() {
        return new ModelAndView('sigleproduct')
    }
}
