package sweetly

import grails.gorm.services.Service

@Service(Pedidos)
interface PedidosService {

    Pedidos get(Serializable id)

    List<Pedidos> list(Map args)

    Long count()

    void delete(Serializable id)

    Pedidos save(Pedidos pedidos)

}