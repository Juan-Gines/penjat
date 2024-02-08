public class Pantalla {

  // Método para dibujar el ahorcado según el número de intentos restantes
  public static void dibujarAhorcado(int intentos) {
    switch (intentos) {
      case 6:
        System.out.println(Constants.ANSI_GREEN + "  +---+");
        System.out.println("  |   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========" + Constants.ANSI_RESET);
        break;
      case 5:
        System.out.println(Constants.ANSI_GREEN + "  +---+");
        System.out.println("  |   |");
        System.out.println("  O   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========" + Constants.ANSI_RESET);
        break;
      case 4:
        System.out.println(Constants.ANSI_CYAN + "  +---+");
        System.out.println("  |   |");
        System.out.println("  O   |");
        System.out.println("  |   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========" + Constants.ANSI_RESET);
        break;
      case 3:
        System.out.println(Constants.ANSI_CYAN + "  +---+");
        System.out.println("  |   |");
        System.out.println("  O   |");
        System.out.println(" /|   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========" + Constants.ANSI_RESET);
        break;
      case 2:
        System.out.println(Constants.ANSI_YELLOW + "  +---+");
        System.out.println("  |   |");
        System.out.println("  O   |");
        System.out.println(" /|\\  |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========" + Constants.ANSI_RESET);
        break;
      case 1:
        System.out.println(Constants.ANSI_YELLOW + "  +---+");
        System.out.println("  |   |");
        System.out.println("  O   |");
        System.out.println(" /|\\  |");
        System.out.println(" /    |");
        System.out.println("      |");
        System.out.println("=========" + Constants.ANSI_RESET);
        break;
      case 0:
        System.out.println(Constants.ANSI_RED + "  +---+");
        System.out.println("  |   |");
        System.out.println("  O   |");
        System.out.println(" /|\\  |");
        System.out.println(" / \\  |");
        System.out.println("      |");
        System.out.println("=========" + Constants.ANSI_RESET);
        break;
      default:
        break;
    }
  }
}
