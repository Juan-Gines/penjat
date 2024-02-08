public class App {
    public static void main(String[] args) throws Exception {
        int intentos = 6; // Número máximo de intentos antes de perder el juego

        // Bucle principal del juego
        while (intentos > 0) {
            Pantalla.dibujarAhorcado(intentos);
            // Aquí iría la lógica del juego, como solicitar una letra al usuario y
            // verificar si está en la palabra
            // Por simplicidad, omitimos la lógica del juego en este ejemplo

            // Reducción de intentos para probar el dibujo del ahorcado
            intentos--;
        }

        // Si el jugador se queda sin intentos, muestra el ahorcado completo
        Pantalla.dibujarAhorcado(intentos);
        System.out.println("¡Has perdido!");
    }

}
