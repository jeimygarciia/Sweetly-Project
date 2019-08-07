package sweetly

class Informacionpedido {

    //int idinformacionpedido
    //int idpedido
    static belongsTo=[pedido:Pedidos]
    //int idproducto
    Productos producto
    int cantidad
    Date fechaentrega
    String estado_entrega

    String forma_pago

}
