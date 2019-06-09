package sweetly

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ProductosServiceSpec extends Specification {

    ProductosService productosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Productos(...).save(flush: true, failOnError: true)
        //new Productos(...).save(flush: true, failOnError: true)
        //Productos productos = new Productos(...).save(flush: true, failOnError: true)
        //new Productos(...).save(flush: true, failOnError: true)
        //new Productos(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //productos.id
    }

    void "test get"() {
        setupData()

        expect:
        productosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Productos> productosList = productosService.list(max: 2, offset: 2)

        then:
        productosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        productosService.count() == 5
    }

    void "test delete"() {
        Long productosId = setupData()

        expect:
        productosService.count() == 5

        when:
        productosService.delete(productosId)
        sessionFactory.currentSession.flush()

        then:
        productosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Productos productos = new Productos()
        productosService.save(productos)

        then:
        productos.id != null
    }
}
