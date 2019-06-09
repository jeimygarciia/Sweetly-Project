package sweetly

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class InformacionpedidoServiceSpec extends Specification {

    InformacionpedidoService informacionpedidoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Informacionpedido(...).save(flush: true, failOnError: true)
        //new Informacionpedido(...).save(flush: true, failOnError: true)
        //Informacionpedido informacionpedido = new Informacionpedido(...).save(flush: true, failOnError: true)
        //new Informacionpedido(...).save(flush: true, failOnError: true)
        //new Informacionpedido(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //informacionpedido.id
    }

    void "test get"() {
        setupData()

        expect:
        informacionpedidoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Informacionpedido> informacionpedidoList = informacionpedidoService.list(max: 2, offset: 2)

        then:
        informacionpedidoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        informacionpedidoService.count() == 5
    }

    void "test delete"() {
        Long informacionpedidoId = setupData()

        expect:
        informacionpedidoService.count() == 5

        when:
        informacionpedidoService.delete(informacionpedidoId)
        sessionFactory.currentSession.flush()

        then:
        informacionpedidoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Informacionpedido informacionpedido = new Informacionpedido()
        informacionpedidoService.save(informacionpedido)

        then:
        informacionpedido.id != null
    }
}
