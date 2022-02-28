#language: es

Característica: Modulo Ayuda PuntoRed

  Antecedentes:
    Cuando se asigna el usuario
    Y se ingresa al portal de puntoRed

  @PortalAyuda
  Esquema del escenario: Ingreso al portal de Ayuda PuntoRed
    Entonces valida el homepage del ambiente con el logo de PuntoRed
    Y el usuario ingresa al portal de ayuda
    Y valida titulo en el portal de Ayuda con el texto <textoTitulo>

    Ejemplos:
      | textoTitulo               |
      | "¿Cómo podemos ayudarte?" |

  @ItemPortalAyuda
  Esquema del escenario: Desplegar informacion de item en portal de Ayuda
    Entonces valida el homepage del ambiente con el logo de PuntoRed
    Y el usuario ingresa al portal de ayuda
    Y valida titulo en el portal de Ayuda con el texto <textoTitulo>
    Y el usuario selecciona el <itemMenuAyuda> requerido
    Y se valida la informacion desplegada versus la <informacionEsperadaItem>

    Ejemplos:
      | textoTitulo               | itemMenuAyuda      | informacionEsperadaItem                                 |
      | "¿Cómo podemos ayudarte?" | "¿Qué es Fintech?" | "Fintech es un concepto que aglutina aquellas empresas" |

  @BuscadorPortalAyuda
  Esquema del escenario: Realizar consulta en el buscador del portal de Ayuda
    Entonces valida el homepage del ambiente con el logo de PuntoRed
    Y el usuario ingresa al portal de ayuda
    Y valida titulo en el portal de Ayuda con el texto <textoTitulo>
    Y el usuario ingresa una <consulta> en el buscador del portal de Ayuda
    Y el usuario selecciona el <itemMenuAyuda> requerido
    Y se valida la informacion desplegada versus la <informacionEsperadaItem>

    Ejemplos:
      | textoTitulo               | consulta          | itemMenuAyuda     | informacionEsperadaItem     |
      | "¿Cómo podemos ayudarte?" | "testear las Api" | "testear las Api" | "https://www.puntored.co/developers/#section_services" |