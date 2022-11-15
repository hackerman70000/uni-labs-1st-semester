import java.util.Scanner;

public class factory {
    public int maxCapacity;
    public int index = 1;

    public factory(int y) {
        maxCapacity = y;
    }

    public int[] productionSpeed = new int[maxCapacity];

    public void addMachine(int x) {
        if (index >= maxCapacity) {
            productionSpeed[index - 1] = x;
            index++;
        }
    }

    public void show() {
        for(int i = 0; i < index - 1; i++)
        {
            System.out.println(i+" "+productionSpeed[i]);
        }
    }

    public int production(int x) {
        int day = 1, total = 0;

        while (x > 0) {

            for (int i = 0; i < index; i++) {

                if (day % productionSpeed[i] == 0) {
                    total++;
                }
            }
            day++;
        }
        return day;
    }

}
