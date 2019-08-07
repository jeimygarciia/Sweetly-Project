package sweetly
import grails.plugin.springsecurity.annotation.Secured
import org.springframework.web.servlet.ModelAndView
@Secured(['ROLE_USER'])
class CheckoutController {
    static layout = 'home';
    def index() {

        return  new ModelAndView('checkout')
    }
}
