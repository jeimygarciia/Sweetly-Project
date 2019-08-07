package sweetly

import grails.plugin.springsecurity.annotation.Secured

@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
class HomeController {
    static springSecurityService
    static layout = 'home';

    def index() {}

    def pedidos(){
        User usuario=springSecurityService.currentUser
        def user_pedidos=usuario.pedidos
    }
    def detalle_pedido(double id_pedido){
        
    }
}
