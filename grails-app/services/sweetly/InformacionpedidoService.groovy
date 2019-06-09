package sweetly

import grails.gorm.services.Service

@Service(Informacionpedido)
interface InformacionpedidoService {

    Informacionpedido get(Serializable id)

    List<Informacionpedido> list(Map args)

    Long count()

    void delete(Serializable id)

    Informacionpedido save(Informacionpedido informacionpedido)

}