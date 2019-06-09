package sweetly

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PedidosServiceSpec extends Specification {

    PedidosService pedidosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Pedidos(...).save(flush: true, failOnError: true)
        //new Pedidos(...).save(flush: true, failOnError: true)
        //Pedidos pedidos = new Pedidos(...).save(flush: true, failOnError: true)
        //new Pedidos(...).save(flush: true, failOnError: true)
        //new Pedidos(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //pedidos.id
    }

    void "test get"() {
        setupData()

        expect:
        pedidosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Pedidos> pedidosList = pedidosService.list(max: 2, offset: 2)

        then:
        pedidosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        pedidosService.count() == 5
    }

    void "test delete"() {
        Long pedidosId = setupData()

        expect:
        pedidosService.count() == 5

        when:
        pedidosService.delete(pedidosId)
        sessionFactory.currentSession.flush()

        then:
        pedidosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Pedidos pedidos = new Pedidos()
        pedidosService.save(pedidos)

        then:
        pedidos.id != null
    }
}
