import java.util.ArrayList;
public class Ex2 {
    private ArrayList<Integer> values;
    public Ex2(String[] args) {
        values = new ArrayList<>();
        parseArgs(args);
    }
    private void parseArgs(String[] args) {
        for(int i = 0; i < args.length; ++i) {
            values.add(Integer.parseInt(args[i]));

        }
    }
    // klasa służąca do obliczania średniej
    public double calculateAverage() {
        float sum = 0;
        for (Integer value : values) {
            sum += value;
        }
        return sum / values.size();
    }
    public static void main(String[] args) {
        Ex2 ex2 = new Ex2(args);
        System.out.println(ex2.calculateAverage());
    }
}