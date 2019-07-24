package sweetly

import grails.plugin.springsecurity.annotation.Secured
import grails.validation.ValidationException

import static org.springframework.http.HttpStatus.*

@Secured(['ROLE_ADMIN'])
class ProductosController {

    ProductosService productosService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond productosService.list(params), model: [productosCount: productosService.count()]
    }

    def show(Long id) {
        respond productosService.get(id)
    }

    def create() {
        def producto = new Productos(params)
        producto.save()
        respond producto
    }

    def save(Productos productos) {
        if (productos == null) {
            notFound()
            return
        }

        try {
            productosService.save(productos)
        } catch (ValidationException e) {
            respond productos.errors, view: 'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'productos.label', default: 'Productos'), productos.id])
                redirect productos
            }
            '*' { respond productos, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond productosService.get(id)
    }

    def update(Productos productos) {
        if (productos == null) {
            notFound()
            return
        }

        try {
            productosService.save(productos)
        } catch (ValidationException e) {
            respond productos.errors, view: 'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'productos.label', default: 'Productos'), productos.id])
                redirect productos
            }
            '*' { respond productos, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        productosService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'productos.label', default: 'Productos'), id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'productos.label', default: 'Productos'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
