<html>
<h1>Informacion de pedidos</h1>
<g:each in="info" var="info">

    ${info.producto}
     ${info.cantidad}
      ${info.fechaentrega}
       ${info.estado_entrega}
        ${info.forma_pago}

</g:each>
</html>