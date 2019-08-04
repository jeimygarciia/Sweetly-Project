package sweetly

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
            }
        }
//        "/"(view: "/index")
        "/"(view: "/grails-index")
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
