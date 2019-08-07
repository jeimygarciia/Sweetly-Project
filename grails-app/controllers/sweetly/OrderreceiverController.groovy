package sweetly

import grails.plugin.springsecurity.annotation.Secured
import org.springframework.web.servlet.ModelAndView

@Secured(['ROLE_USER'])
class OrderreceiverController {

    def index() {

        return new ModelAndView('orderreceiver')
    }
}
