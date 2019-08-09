package sweetly

import grails.plugin.springsecurity.annotation.Secured
import org.springframework.web.servlet.ModelAndView
@Secured(['ROLE_USER'])
class InformacionesController {
    static layout = 'home';
    def index() {
 def informaciones = informaciones.pedidos
        System.out.println(informaciones.pedidos)

        return new ModelAndView("informaciones",[pedinfo:pedinfo])
    }
}
