package ProyectoFinalModulo1;

public class Cesar {
    public String cifrar(String texto, int clave) {
        StringBuilder textoCifrado = new StringBuilder();
        for (char caracter : texto.toCharArray()) {
            if (Character.isLetter(caracter)) {
                char base = Character.isUpperCase(caracter) ? 'A' : 'a';
                int posicion = caracter - base;
                int nuevaPosicion = (posicion + clave) % 26;
                char nuevoCaracter = (char) (base + nuevaPosicion);
                textoCifrado.append(nuevoCaracter);
            } else {
                textoCifrado.append(caracter);
            }
        }
        return textoCifrado.toString();

    }

    public String descifrar(String textoCifrado, int clave) {
        return this.cifrar(textoCifrado, 26 - clave); // El descifrado es el cifrado con la clave inversa
    }
}
