import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Race {
    public static void main (String[] arguments) {
        String[] names = {
                "Jan", "Piotr", "Michal", "Pawel", "Jakub", 
                "Stefan", "Robert", "Mariusz", "Tadeusz", "Konrad"
        };

        int[] times = {
                56, 60, 51, 44, 66, 50, 49, 62, 43, 70
        };

        int tempTime;
        String tempName;

        while (true) {
            try {
                System.out.println(
                    "Choose an option: 1 - calculate; 2 - exit program");
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(System.in));
                int option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        for (int i = 0; i < names.length; i++)
                            for(int j = 0; j < names.length -i -1; j++)
                                if (times[j] > times[j + 1]) {
                                    tempTime= times[j];
                                    times[j] = times[j + 1];
                                    times[j + 1] = tempTime;

                                    tempName= names[j];
                                    names[j] = names[j + 1];
                                    names[j + 1] = tempName;
                        }
                        System.out.println("Miejsce 1. "+ names[0]+" "+times[0]);
                        System.out.println("Miejsce 1.  "+ names[1]+" "+times[1]);
                        System.out.println("Miejsce 3. "+ names[2]+" "+times[2]);


                        break;
                    case 2:
                        return;
                    default:
                        System.out.println("Wrong option choose once again");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("You should write a number!");
            }
        }
    }
}