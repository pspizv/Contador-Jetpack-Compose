<h2>El estado en Jetpack Compose</h2>

Fuente: https://developer.android.com/develop/ui/compose/state?hl=es-419

El estado de una app es cualquier valor que puede cambiar con el paso del tiempo.

Jetpack Compose te ayuda a definir explícitamente el lugar y la manera en que almacenas y usas el estado en una app para Android.

Compose es declarativo y, por lo tanto, la única manera de actualizarlo es llamar al mismo elemento que admite composición con argumentos nuevos.
Estos argumentos son representaciones del estado de la IU. Cada vez que se actualiza un estado, se produce una recomposición.
Las funciones de componibilidad pueden usar la API de remember para almacenar un objeto en la memoria.

Un valor calculado por <mark><strong>remember</strong></mark> se almacena en la composición durante la composición inicial, y el valor almacenado se muestra durante la recomposición.
Se puede usar remember para almacenar tanto objetos mutables como inmutables.

mutableStateOf crea un MutableState<T> observable, que es un tipo observable integrado en el entorno de ejecución de Compose.

<pre>
interface MutableState<T> : State<T> {
    override var value: T
}
</pre>
  
Cualquier cambio en value programa la recomposición de las funciones que admiten composición que lean value.

Existen tres maneras de declarar un objeto MutableState en un elemento que admite composición:

<pre>
val mutableState = remember { mutableStateOf(default) }

var value by remember { mutableStateOf(default) }

val (value, setValue) = remember { mutableStateOf(default) }
</pre>

Puedes usar el valor recordado como un parámetro para otros elementos que admiten composición o incluso como lógica en declaraciones para cambiar los elementos que se muestran.

Aunque remember te ayuda a retener el estado entre recomposiciones, el estado no se retiene entre cambios de configuración.
Para ello, debes usar rememberSaveable. rememberSaveable almacena automáticamente cada valor que se puede guardar en un Bundle.
