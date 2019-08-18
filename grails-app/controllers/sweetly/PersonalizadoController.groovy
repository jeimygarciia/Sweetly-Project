package sweetly

import grails.plugin.springsecurity.annotation.Secured
import org.springframework.web.servlet.ModelAndView

import java.util.function.BiConsumer

@Secured(['ROLE_USER'])
class PersonalizadoController {
    static layout = 'home';
    def index() {
//        val exmple = params.ywapo_checkbox_5

        return new ModelAndView("personalizado")

       // if(!paeams.MyCheckBox)
    }

    def processOrder() {
        params.forEach(new BiConsumer() {
            @Override
            void accept(Object key, Object value) {
                println "Key: " + key + " value: " + value
            }
        })
    }
}
