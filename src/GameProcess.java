import java.util.Scanner;
import java.util.Random;
public class GameProcess {
    String[][] table = new String[3][3];
    String emptySpace = "-";
    String x = "X";
    String o = "O";
    public void createTable() {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                table[row][column] = emptySpace;
            }
        }
    }
    public void printTable() {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(table[row][column] + " ");
            }
            System.out.println("");
        }
    }
    public void playerTurn(String player) {
        int rowNum;
        int columnNum;
        System.out.println("Введите номер строчки и столбца");
        do {
            Scanner scanner = new Scanner(System.in);
            rowNum = scanner.nextInt() - 1;
            columnNum = scanner.nextInt() - 1;
        } while (!isCellValid(rowNum, columnNum));
        table[rowNum][columnNum] = player;
    }
    public void cpuTurnEasy(String cpu) {
        int rowNum;
        int columnNum;
        do {
            Random random = new Random();
            rowNum = random.nextInt(3);
            columnNum = random.nextInt(3);
        } while (!isCellValid(rowNum, columnNum));
        table[rowNum][columnNum] = cpu;
    }
    public void cpuTurnHard(String cpu, String player) {
        if (((table[0][0].equals(cpu) && table[0][1].equals(cpu)) && !table[0][2].equals(player)) ||
                ((table[0][0].equals(player) && table[0][1].equals(player)) && !table[0][2].equals(cpu))) {
            table[0][2] = cpu;
        }
        else if (((table[0][0].equals(cpu) && table[0][2].equals(cpu)) && !table[0][1].equals(player)) ||
                ((table[0][0].equals(player) && table[0][2].equals(player)) && !table[0][1].equals(cpu))) {
            table[0][1] = cpu;
        }
        else if (((table[0][1].equals(cpu) && table[0][2].equals(cpu)) && !table[0][0].equals(player)) ||
                ((table[0][1].equals(player) && table[0][2].equals(player)) && !table[0][0].equals(cpu))) {
            table[0][0] = cpu;
        }
        else if (((table[1][0].equals(cpu) && table[1][1].equals(cpu)) && !table[1][2].equals(player)) ||
                ((table[1][0].equals(player) && table[1][1].equals(player)) && !table[1][2].equals(cpu))) {
            table[1][2] = cpu;
        }
        else if (((table[1][1].equals(cpu) && table[1][2].equals(cpu)) && !table[1][0].equals(player)) ||
                ((table[1][1].equals(player) && table[1][2].equals(player)) && !table[1][0].equals(cpu))) {
            table[1][0] = cpu;
        }
        else if (((table[1][2].equals(cpu) && table[1][0].equals(cpu)) && !table[1][1].equals(player)) ||
                ((table[1][2].equals(player) && table[1][0].equals(player)) && !table[1][1].equals(cpu))) {
            table[1][1] = cpu;
        }
        else if (((table[2][0].equals(cpu) && table[2][1].equals(cpu)) && !table[2][2].equals(player)) ||
                ((table[2][0].equals(player) && table[2][1].equals(player)) && !table[2][2].equals(cpu))) {
            table[2][2] = cpu;
        }
        else if (((table[2][1].equals(cpu) && table[2][2].equals(cpu)) && !table[2][0].equals(player)) ||
                ((table[2][1].equals(player) && table[2][2].equals(player)) && !table[2][0].equals(cpu))) {
            table[2][0] = cpu;
        }
        else if (((table[2][2].equals(cpu) && table[2][0].equals(cpu)) && !table[2][1].equals(player)) ||
                ((table[2][2].equals(player) && table[2][0].equals(player)) && !table[2][1].equals(cpu))) {
            table[2][1] = cpu;
        }
        else if (((table[0][0].equals(cpu) && table[1][1].equals(cpu)) && !table[2][2].equals(player)) ||
                ((table[0][0].equals(player) && table[1][1].equals(player)) && !table[2][2].equals(cpu))) {
            table[2][2] = cpu;
        }
        else if (((table[1][1].equals(cpu) && table[2][2].equals(cpu)) && !table[0][0].equals(player)) ||
                ((table[1][1].equals(player) && table[2][2].equals(player)) && !table[0][0].equals(cpu))) {
            table[0][0] = cpu;
        }
        else if (((table[0][0].equals(cpu) && table[2][2].equals(cpu)) && !table[1][1].equals(player)) ||
                ((table[0][0].equals(player) && table[2][2].equals(player)) && !table[1][1].equals(cpu))) {
            table[1][1] = cpu;
        }
        else if (((table[0][2].equals(cpu) && table[1][1].equals(cpu)) && !table[2][0].equals(player)) ||
                ((table[0][2].equals(player) && table[1][1].equals(player)) && !table[2][0].equals(cpu))) {
            table[2][0] = cpu;
        }
        else if (((table[1][1].equals(cpu) && table[2][0].equals(cpu)) && !table[0][2].equals(player)) ||
                ((table[1][1].equals(player) && table[2][0].equals(player)) && !table[0][2].equals(cpu))) {
            table[0][2] = cpu;
        }
        else if (((table[2][0].equals(cpu) && table[0][2].equals(cpu)) && !table[1][1].equals(player)) ||
                ((table[2][0].equals(player) && table[0][2].equals(player)) && !table[1][1].equals(cpu))) {
            table[1][1] = cpu;
        }
        else if (((table[0][0].equals(cpu) && table[1][0].equals(cpu)) && !table[2][0].equals(player)) ||
                ((table[0][0].equals(player) && table[1][0].equals(player)) && !table[2][0].equals(cpu))) {
            table[2][0] = cpu;
        }
        else if (((table[1][0].equals(cpu) && table[2][0].equals(cpu)) && !table[0][0].equals(player)) ||
                ((table[1][0].equals(player) && table[2][0].equals(player)) && !table[0][0].equals(cpu))) {
            table[0][0] = cpu;
        }
        else if (((table[2][0].equals(cpu) && table[0][0].equals(cpu)) && !table[1][0].equals(player)) ||
                ((table[2][0].equals(player) && table[0][0].equals(player)) && !table[1][0].equals(cpu))) {
            table[1][0] = cpu;
        }
        else if (((table[0][1].equals(cpu) && table[1][1].equals(cpu)) && !table[2][1].equals(player)) ||
                ((table[0][1].equals(player) && table[1][1].equals(player)) && !table[2][1].equals(cpu))) {
            table[2][1] = cpu;
        }
        else if (((table[1][1].equals(cpu) && table[2][1].equals(cpu)) && !table[0][1].equals(player)) ||
                ((table[1][1].equals(player) && table[2][1].equals(player)) && !table[0][1].equals(cpu))) {
            table[0][1] = cpu;
        }
        else if (((table[2][1].equals(cpu) && table[0][1].equals(cpu)) && !table[1][1].equals(player)) ||
                ((table[2][1].equals(player) && table[0][1].equals(player)) && !table[1][1].equals(cpu))) {
            table[1][1] = cpu;
        }
        else if (((table[0][2].equals(cpu) && table[1][2].equals(cpu)) && !table[2][2].equals(player)) ||
                ((table[0][2].equals(player) && table[1][2].equals(player)) && !table[2][2].equals(cpu))) {
            table[2][2] = cpu;
        }
        else if (((table[1][2].equals(cpu) && table[2][2].equals(cpu)) && !table[0][2].equals(player)) ||
                ((table[1][2].equals(player) && table[2][2].equals(player)) && !table[0][2].equals(cpu))) {
            table[0][2] = cpu;
        }
        else if (((table[2][2].equals(cpu) && table[0][2].equals(cpu)) && !table[1][2].equals(player)) ||
                ((table[2][2].equals(player) && table[0][2].equals(player)) && !table[1][2].equals(cpu))) {
            table[1][2] = cpu;
        } else {
            cpuTurnEasy(cpu);
        }
    }
    public boolean isCellValid(int row, int column) {
        if (row < 0 || column < 0 || row >= 3 || column >= 3) {
            return false;
        }
        return table[row][column].equals(emptySpace);
    }
    public void game(String player, String difficulty) {
        createTable();
        if (difficulty.equals("easy")) {
            if (player.equals(x)) {
                while (true) {
                    playerTurn(player);
                    if (isTheWinner(x)) {
                        System.out.println("Вы выиграли!");
                        break;
                    }
                    if (checkTableFullness()) {
                        System.out.println("Ничья.");
                        break;
                    }
                    cpuTurnEasy(o);
                    printTable();
                    if (isTheWinner(o)) {
                        System.out.println("Вы проиграли!");
                        break;
                    }
                    if (checkTableFullness()) {
                        System.out.println("Ничья.");
                        break;
                    }
                }
                printTable();
            }
            if (player.equals(o)) {
                while (true) {
                    cpuTurnEasy(x);
                    if (isTheWinner(x)) {
                        System.out.println("Вы проиграли!");
                        break;
                    }
                    if (checkTableFullness()) {
                        System.out.println("Ничья.");
                        break;
                    }
                    printTable();
                    playerTurn(player);
                    if (isTheWinner(player)) {
                        System.out.println("Вы выиграли!");
                        break;
                    }
                    if (checkTableFullness()) {
                        System.out.println("Ничья.");
                        break;
                    }
                }
                printTable();
            }
        }
        if (difficulty.equals("hard")) {
            if (player.equals(x)) {
                while (true) {
                    playerTurn(player);
                    if (isTheWinner(x)) {
                        System.out.println("Вы выиграли!");
                        break;
                    }
                    if (checkTableFullness()) {
                        System.out.println("Ничья.");
                        break;
                    }
                    cpuTurnHard(o, player);
                    printTable();
                    if (isTheWinner(o)) {
                        System.out.println("Вы проиграли!");
                        break;
                    }
                    if (checkTableFullness()) {
                        System.out.println("Ничья.");
                        break;
                    }
                }
                printTable();
            }
            if (player.equals(o)) {
                while (true) {
                    cpuTurnHard(x, player);
                    if (isTheWinner(x)) {
                        System.out.println("Вы проиграли!");
                        break;
                    }
                    if (checkTableFullness()) {
                        System.out.println("Ничья.");
                        break;
                    }
                    printTable();
                    playerTurn(player);
                    if (isTheWinner(player)) {
                        System.out.println("Вы выиграли!");
                        break;
                    }
                    if (checkTableFullness()) {
                        System.out.println("Ничья.");
                        break;
                    }
                }
                printTable();
            }
        }
    }
    public boolean isTheWinner(String symbol) {
        if ((table[0][0].equals(symbol) && table[1][1].equals(symbol) && table[2][2].equals(symbol))
        || (table[0][2].equals(symbol) && table[1][1].equals(symbol) && table[2][0].equals(symbol))) {
            return true;
        }
        for (int i = 0; i < 3; i++) {
            if ((table[i][0].equals(symbol) && table[i][1].equals(symbol) && table[i][2].equals(symbol)) ||
                    (table[0][i].equals(symbol) && table[1][i].equals(symbol) && table[2][i].equals(symbol))) {
                return true;
            }
        }
        return false;
    }
    public boolean checkTableFullness() {
        for (int rowNum = 0; rowNum < 3; rowNum++) {
            for (int columnNum = 0; columnNum < 3; columnNum++) {
                if (table[rowNum][columnNum].equals(emptySpace)) {
                    return false;
                }
            }
        }
        return true;
    }
}
