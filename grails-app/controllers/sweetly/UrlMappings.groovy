package sweetly

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
            }
        }
//        "/"(view: "/index")
        "/" {
            controller = "home"
        }
        "/process/order" {
            controller = "Personalizado"
            action = "processOrder"
        }
//        "/"(view: "/grails-index")
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
