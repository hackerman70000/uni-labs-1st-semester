import java.util.Scanner;
public class factory {

    public static void production(int x, int y, int[] productionSpeed) {
        int day = 1, total = 0, produced = 0;

        System.out.println("Day Produced Total");

        while (x > 0) {
            produced = 0;

            for (int i = 0; i < productionSpeed.length; i++) {

                if (day % productionSpeed[i] == 0) {
                    total++;
                    produced++;
                    x -= produced;
                }
            }

            System.out.print(day + "      " + produced + "       " + total);
            System.out.println("");
            day++;
        }
    }

    public static void main(String[] args) {
        int x, y;
        Scanner scan = new Scanner(System.in);


        System.out.print("Podaj ilosc towaru : ");
        x = scan.nextInt();

        System.out.print("Podaj ilosc maszyn : ");
        y = scan.nextInt();

        int[] productionSpeed = new int[y];

        System.out.print("Podaj wydajność maszyn ");

        for (int i = 0; i < y; i++) {
            System.out.print(i + 1 + ". :  ");
            productionSpeed[i] = scan.nextInt();
        }

        production(x, y, productionSpeed);
    }
}