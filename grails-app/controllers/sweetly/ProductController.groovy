package sweetly

import grails.plugin.springsecurity.annotation.Secured
import org.springframework.web.servlet.ModelAndView

@Secured(['ROLE_USER'])
class ProductController {
    static layout = 'home';
    def index() {

        def product = Productos.getAll();
        return new ModelAndView("index", [product: product])


    }
}


