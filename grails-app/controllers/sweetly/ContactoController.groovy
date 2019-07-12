package sweetly

import org.springframework.web.servlet.ModelAndView

class ContactoController {
    static layout='home';

    def index() {

        return new ModelAndView ("contacto");
    }
}
