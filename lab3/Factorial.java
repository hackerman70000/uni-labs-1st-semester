public class Factorial {
    public static void main(String[] args) {
        short N = 4;
        int result = 1;
        int num = 1;

        while(N != 0)
        {
          result *= num;
          num ++;
          N--;
        }
        System.out.println(result);
    }
}