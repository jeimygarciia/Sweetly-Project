package sweetly

import grails.plugin.springsecurity.annotation.Secured
import grails.validation.ValidationException

import static org.springframework.http.HttpStatus.*

@Secured(['ROLE_ADMIN'])
class PedidosController {

    PedidosService pedidosService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond pedidosService.list(params), model: [pedidosCount: pedidosService.count()]
    }

    def show(Long id) {
        respond pedidosService.get(id)
    }

    def create() {
        respond new Pedidos(params)
    }

    def save(Pedidos pedidos) {
        if (pedidos == null) {
            notFound()
            return
        }

        try {
            pedidosService.save(pedidos)
        } catch (ValidationException e) {
            respond pedidos.errors, view: 'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'pedidos.label', default: 'Pedidos'), pedidos.id])
                redirect pedidos
            }
            '*' { respond pedidos, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond pedidosService.get(id)
    }

    def update(Pedidos pedidos) {
        if (pedidos == null) {
            notFound()
            return
        }

        try {
            pedidosService.save(pedidos)
        } catch (ValidationException e) {
            respond pedidos.errors, view: 'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'pedidos.label', default: 'Pedidos'), pedidos.id])
                redirect pedidos
            }
            '*' { respond pedidos, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        pedidosService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'pedidos.label', default: 'Pedidos'), id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'pedidos.label', default: 'Pedidos'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
