package sweetly

import grails.plugin.springsecurity.annotation.Secured
import org.springframework.web.servlet.ModelAndView
@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
class ContactoController {
    static layout = 'home';

    def index() {

        return new ModelAndView("contacto");
    }
}
