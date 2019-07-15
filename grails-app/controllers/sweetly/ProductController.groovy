package sweetly

import org.springframework.web.servlet.ModelAndView

class ProductController {

    def index() {

                def product = product.getAll()
                return new ModelAndView("ejemplo", [product: product])
            }
  }


