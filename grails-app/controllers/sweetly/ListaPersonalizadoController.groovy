package sweetly

import grails.plugin.springsecurity.annotation.Secured
import org.springframework.web.servlet.ModelAndView

@Secured(['ROLE_USER'])
class ListaPersonalizadoController {
    static layout = 'home'

    // En este servicio listo lo que deseo

    def index() {
        def personalizados = Personalizado.getAll()
        return new ModelAndView('listapersonalizado', [personalizados: personalizados]) // No me toma la vista y no se la razon.
    }
}
