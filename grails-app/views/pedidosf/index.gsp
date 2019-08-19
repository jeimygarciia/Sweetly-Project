<html>
<h1>Pedidos</h1>
<g:each in="${pedidos}" var="pe">
<div>

    ${pe.fechapedido}
    ${pe.estado_entrega}
    ${pe.idforma_pago}
    ${pe.comentario}

</div>
 </g:each>


</html>