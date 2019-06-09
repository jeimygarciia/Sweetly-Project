package sweetly

import grails.gorm.services.Service

@Service(Productos)
interface ProductosService {

    Productos get(Serializable id)

    List<Productos> list(Map args)

    Long count()

    void delete(Serializable id)

    Productos save(Productos productos)

}