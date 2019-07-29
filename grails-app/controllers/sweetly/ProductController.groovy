package sweetly

import grails.plugin.springsecurity.annotation.Secured
import org.springframework.web.servlet.ModelAndView

@Secured(['ROLE_USER'])
class ProductController {

    def index() {

        def product = Productos.getAll();
        return new ModelAndView("product", [product: product])


    }
}


