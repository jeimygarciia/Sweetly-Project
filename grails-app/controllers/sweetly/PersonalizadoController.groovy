package sweetly

import grails.plugin.springsecurity.annotation.Secured
import org.springframework.web.servlet.ModelAndView

@Secured(['ROLE_USER'])
class PersonalizadoController {
    static layout = 'home'

    def index() {
        return new ModelAndView("personalizado")
    }

    /**
     * Aqui yo lo que hago es salvar el pedido que me enviaron.
     * y redirigir la peticion a otro servicio y vista
     * @return
     */
    def processOrder() {
        def personalizado = new Personalizado(params)
        personalizado.save(flush: true, failOnError: true) // Forma correcta de salvar en grails
        redirect(controller: "ListaPersonalizado")
    }
}
