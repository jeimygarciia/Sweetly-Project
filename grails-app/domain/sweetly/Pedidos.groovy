package sweetly

class   Pedidos {

    int idpedido
   // int iduser
    static belongsTo = [usuario:User]
    static hasMany = [informaciones:Informacionpedido]
    String comentario
    Date fechapedido
    String estado_entrega
    int idforma_pago


}
