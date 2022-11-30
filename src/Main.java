import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int count1 = 0;
        System.out.print("-----<<< Start Game >>>-----\n" +
                "Predicate amount of points (2 ... 12)" + "\n" + "Write here: ");
        for (int i = 0; i < 3; i++) {
            int a = scanner.nextInt();
            int g = random.nextInt(1, 6);
            int h = random.nextInt(1, 6);
            dice(g);
            dice(h);


            int bot = random.nextInt(2, 12);
            System.out.print("now turn Boot " + "\n" + "number Boot: " + bot + "\n");
            int y = random.nextInt(1, 6);
            int v = random.nextInt(1, 6);
            dice(y);
            dice(v);
            int sum = g + h;
            int subt = (a - sum) * 2;
            int sum2 = y + v;
            int subt2 = (bot - sum2) * 2;
            System.out.println("------Current score------");
            if (subt < 0) {
                System.out.println("| User: " + String.valueOf(subt).substring(1));
            } else {
                System.out.println("| User: " + subt);
            }
            if (subt2 < 0) {
                System.out.println("| bot: " + String.valueOf(subt2).substring(1));
            } else {
                System.out.println("| bot: " + subt2);
            }

            if (subt < subt2) {
                count1++;

                int s = subt2 - subt;
                System.out.println("| Boot is ahead by " + s + " points!");
            } else if (subt2 < subt) {
                int t = subt - subt2;
                count++;
                System.out.println("| User is ahead by " + t + " points!");
            } else {
                System.out.println("|it's equal");
            }
        }
        if (count < count1) {
            System.out.println("bot is winner");
        } else {
            System.out.println("user is winner");
        }
    }

    public static void dice(int a) {

        switch (a) {
            case 1:
                System.out.println("+-------+\n|       |\n|   #   |\n|       |\n+-------+");
                break;
            case 2:
                System.out.println("+-------+\n| #     |\n|       |\n|     # |\n+-------+");
                break;
            case 3:
                System.out.println("+-------+\n|     # |\n|   #   |\n| #     |\n+-------+");
                break;
            case 4:
                System.out.println("+-------+\n| # #   |\n| # #   |\n|       |\n+-------+");
                break;
            case 5:
                System.out.println("+-------+\n| #   # |\n|   #   |\n| #   # |\n+-------+");
                break;
            case 6:
                System.out.println("+-------+\n| #   # |\n| #   # |\n| #   # |\n+-------+");
                break;
        }
    }
}