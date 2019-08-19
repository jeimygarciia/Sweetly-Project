package sweetly

import grails.plugin.springsecurity.annotation.Secured
import org.springframework.web.servlet.ModelAndView

import java.util.function.BiConsumer

@Secured(['ROLE_USER'])
class PersonalizadoController {
    static layout = 'home';
    def index() {

        return new ModelAndView("personalizado")

    }

    def create() {
        def personalizados = new Personalizado(params)
        personalizados.save()
        respond personalizados
    }

    def processOrder() {

        def personalizados = Personalizado.getAll()
       // Personalizado.saveAll()

        return new ModelAndView('listapersonalizado', [personalizados:personalizados])

//        params.forEach(new BiConsumer() {
//            @Override
//            void accept(Object key, Object value) {
//                println "Key: " + key + " value: " + value
//            }
//        })
    }
}
