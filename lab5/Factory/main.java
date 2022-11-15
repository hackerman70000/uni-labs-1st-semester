import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int x, y;
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj ilosc towaru : ");
        x = scan.nextInt();

        System.out.print("Podaj ilosc maszyn : ");
        y = scan.nextInt();

        factory fabryka = new factory(y);

        for (int i = 0; i < y; i++)
        {
            System.out.print("Podaj wydajnosc maszyny : ");
            int z = scan.nextInt();
            fabryka.addMachine(z);
        }

        fabryka.show();
    }
}
