package sweetly

import grails.plugin.springsecurity.annotation.Secured
import org.springframework.web.servlet.ModelAndView
@Secured(['ROLE_USER'])
class PedidosfController {

def springSecurityService
    def index() {
        User usuario = springSecurityService.currentUser
        def pedidos = usuario.pedidos


        return new ModelAndView("index",[pedidos:pedidos])
    }
}
