import com.google.gson.Gson

var gson = Gson()

fun main() {
    val ej5 = Ejercicio5()
    ej5.personajes.obtenerTodos().forEach { println(it) }
    println(ej5.personajes.obtenerPersonajesConImagen().size)
}
