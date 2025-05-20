# Proyecto Final Módulo 1: Cifrado César en Java

Este proyecto es una aplicación de consola en Java que implementa el **Cifrado César**, un método clásico de cifrado por sustitución que desplaza las letras del texto original una cantidad fija de posiciones en el alfabeto.


---

## 🔧 ¿Cómo funciona?

### Main.java

La clase `Main` gestiona la interacción con el usuario mediante consola:

- Muestra un **menú** con tres opciones:
  1. Cifrar un texto
  2. Descifrar un texto
  3. Salir

- Pide al usuario:
  - Un texto o palabra
  - Una clave de desplazamiento (número entre 1 y 25)

- Llama a los métodos de la clase `Cesar` para cifrar o descifrar el texto según la opción seleccionada.

### Cesar.java

La clase `Cesar` contiene dos métodos:

#### `cifrar(String texto, int clave)`
- Recorre cada carácter del texto.
- Si es una letra:
  - Calcula su nueva posición aplicando la clave de desplazamiento.
  - Mantiene la distinción entre mayúsculas y minúsculas.
- Si no es una letra (como espacio o signo), se conserva tal cual.

#### `descifrar(String texto, int clave)`
- Llama internamente a `cifrar` usando la **clave inversa** (`26 - clave`) para revertir el cifrado.

---

## 📌 Ejemplo de uso

Supón que eliges la opción 1 y escribes:

- Texto: `Hola Mundo`
- Clave: `3`

El resultado cifrado será: `elix jrkal`

Si luego eliges la opción 2 con el texto `elix jrkal` y la misma clave `3`, obtendrás el texto original `Hola Mundo`.

---

## ✅ Requisitos

- JDK (Java Development Kit) instalado
- Un IDE como IntelliJ IDEA, Eclipse, o usar la terminal

---

## 🚀 Cómo ejecutar

1. Compila los archivos:
   ```bash
   javac ProyectoFinalModulo1/*.java
   ```



