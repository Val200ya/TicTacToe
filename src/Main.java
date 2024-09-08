import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameProcess gameProcess = new GameProcess();
        System.out.println("Выберите, чем будете играть: X или O (по-английски)");
        String player = scanner.nextLine();

        if (player.equals("X") || player.equals("O")) {
            System.out.println("Выберите сложность: easy или hard");
            String difficulty = scanner.nextLine();
            if (difficulty.equals("easy") || difficulty.equals("hard")) {
                gameProcess.game(player, difficulty);
            } else {
                System.out.println("Такой сложности нет. Попробуйте ещё раз.");
            }
        } else {
            System.out.println("Неверный символ. Попробуйте ещё раз");
        }
    }
}