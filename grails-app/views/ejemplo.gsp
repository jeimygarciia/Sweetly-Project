<html>
<body>
<div>

    <ul>
    <g:each in="${Productos}" var="pro">
        <li>
        ${pro.nombre}
        ${pro.detalle}
        ${pro.precio}
        <br>
        </li>
    </g:each>
    </ul>
</div>

</body>
</html>