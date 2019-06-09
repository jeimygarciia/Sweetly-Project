package sweetly

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class InformacionpedidoController {

    InformacionpedidoService informacionpedidoService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond informacionpedidoService.list(params), model:[informacionpedidoCount: informacionpedidoService.count()]
    }

    def show(Long id) {
        respond informacionpedidoService.get(id)
    }

    def create() {
        respond new Informacionpedido(params)
    }

    def save(Informacionpedido informacionpedido) {
        if (informacionpedido == null) {
            notFound()
            return
        }

        try {
            informacionpedidoService.save(informacionpedido)
        } catch (ValidationException e) {
            respond informacionpedido.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'informacionpedido.label', default: 'Informacionpedido'), informacionpedido.id])
                redirect informacionpedido
            }
            '*' { respond informacionpedido, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond informacionpedidoService.get(id)
    }

    def update(Informacionpedido informacionpedido) {
        if (informacionpedido == null) {
            notFound()
            return
        }

        try {
            informacionpedidoService.save(informacionpedido)
        } catch (ValidationException e) {
            respond informacionpedido.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'informacionpedido.label', default: 'Informacionpedido'), informacionpedido.id])
                redirect informacionpedido
            }
            '*'{ respond informacionpedido, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        informacionpedidoService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'informacionpedido.label', default: 'Informacionpedido'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'informacionpedido.label', default: 'Informacionpedido'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
