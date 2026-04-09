import java.util.Scanner;

public class MultipleCatch {
    
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];

        String[] input = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int index = Integer.parseInt(sc.nextLine());
        int divisor = Integer.parseInt(sc.nextLine());

        try {
            int result = arr[index] / divisor;
            System.out.print(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Invalid Index");
        } catch (ArithmeticException e) {
            System.out.print("Divide by zero error");
        }
    }
}