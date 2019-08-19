<h1>Pedidos Personalizados</h1>


<g:each in="${personalizados}" var="perso">
<div>
    Ocasions: ${perso.ocasions}
    Libras: ${perso.sizee}
    Fillings: ${perso.fillings}
    Decorations:  ${perso.decorations}
    </div>
    </g:each>