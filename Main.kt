fun main() {
    println("=== GESTOR DE INFORMACIÓN PERSONAL EN KOTLIN ===\n")

    // Lista para almacenar usuarios
    val usuarios = mutableListOf<Usuario>()

    // Registrar al menos 3 usuarios
    repeat(3) {
        println("Registro de Usuario ${it + 1}")
        print("Nombre completo: ")
        val nombre = readln()

        var edad: Int
        do {
            print("Edad: ")
            edad = readln().toIntOrNull() ?: -1
        } while (edad <= 0)

        var altura: Double
        do {
            print("Altura (en metros): ")
            altura = readln().toDoubleOrNull() ?: -1.0
        } while (altura <= 0)

        var peso: Double
        do {
            print("Peso (en kilogramos): ")
            peso = readln().toDoubleOrNull() ?: -1.0
        } while (peso <= 0)

        var email: String
        do {
            print("Email: ")
            email = readln()
        } while (!validarEmail(email))

        print("Ciudad de residencia: ")
        val ciudad = readln()

        // Crear objeto usuario
        val usuario = Usuario(nombre, edad, altura, peso, email, ciudad)
        usuarios.add(usuario)
        println()
    }

    println("=== INFORMACIÓN DE USUARIOS REGISTRADOS ===\n")

    // Mostrar información de cada usuario
    for ((i, usuario) in usuarios.withIndex()) {
        println("USUARIO ${i + 1}")
        println(usuario.resumen())
        println("=========================================\n")
    }
}

// Función para validar email
fun validarEmail(email: String): Boolean {
    return email.contains("@") && email.contains(".")
}

// Clase Usuario
data class Usuario(
    val nombre: String,
    val edad: Int,
    val altura: Double,
    val peso: Double,
    val email: String,
    val ciudad: String
) {
    // Cálculo del IMC
    fun calcularIMC(): Double {
        return peso / (altura * altura)
    }

    // Verifica si es mayor de edad
    fun esMayorDeEdad(): Boolean {
        return edad >= 18
    }

    // Extraer dominio del email
    fun dominioEmail(): String {
        return email.substringAfter("@")
    }

    // Resumen con string template y formateo de cadenas
    fun resumen(): String {
        val nombreMayus = nombre.uppercase()
        val nombreMinus = nombre.lowercase()
        val imc = String.format("%.2f", calcularIMC())

        return """
            Nombre (Mayúsculas): $nombreMayus
            Nombre (Minúsculas): $nombreMinus
            Edad: $edad años (${if (esMayorDeEdad()) "Mayor de edad" else "Menor de edad"})
            Altura: $altura m
            Peso: $peso kg
            IMC: $imc
            Email: $email
            Dominio del email: ${dominioEmail()}
            Ciudad: $ciudad
        """.trimIndent()
    }
}
