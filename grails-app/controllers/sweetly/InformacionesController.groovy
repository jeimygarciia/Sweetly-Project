package sweetly

import grails.plugin.springsecurity.annotation.Secured
import org.springframework.web.servlet.ModelAndView
@Secured(['ROLE_USER'])
class InformacionesController {
    static layout = 'home';
    def index() {
 def informaciones = Informacionpedido.getAll()
       // System.out.println(Informacionpedido)


        return new ModelAndView("informaciones",[info:info])
    }
}
