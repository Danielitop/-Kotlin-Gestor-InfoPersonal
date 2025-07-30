 -Kotlin-Gestor-InfoPersonal Gestor de Información Personal en Kotlin

  Descripción del programa

Este proyecto es una **aplicación de consola desarrollada en Kotlin** que permite registrar, validar y analizar información personal de varios usuarios. Fue diseñado como ejercicio educativo para practicar los conceptos básicos del lenguaje Kotlin, incluyendo:

- Variables y tipos de datos  
- Validaciones con operadores lógicos  
- Manipulación de cadenas  
- Cálculos con expresiones aritméticas  
- Entrada/salida por consola  
- Uso de `data class` y funciones



Consola en ejecucion

=== GESTOR DE INFORMACIÓN PERSONAL EN KOTLIN ===

Registro de Usuario 1
Nombre completo: Andrea Ruiz
Edad: 22
Altura (en metros): 1.65
Peso (en kilogramos): 60.5
Email: andrea.ruiz@example.com
Ciudad de residencia: Bogotá

Registro de Usuario 2
Nombre completo: Carlos Mejía
Edad: 17
Altura (en metros): 1.70
Peso (en kilogramos): 72.3
Email: carlosmj@gmail.com
Ciudad de residencia: Medellín

Registro de Usuario 3
Nombre completo: Luisa Torres
Edad: 30
Altura (en metros): 1.58
Peso (en kilogramos): 54
Email: ltorres@correo.co
Ciudad de residencia: Cali
 Funcionalidades implementadas

- Registro de múltiples usuarios por consola
- Validación de:
  - Edad (> 0)
  - Altura y peso (> 0)
  - Email válido (contiene `@` y `.`)
- Cálculo del IMC (Índice de Masa Corporal)
- Detección de mayoría de edad
- Manipulación de cadenas:
  - Conversión a mayúsculas y minúsculas
  - Extracción del dominio del email
- Generación de resumen completo usando string templates y `trimIndent()`
- Salida limpia y formateada en consola
