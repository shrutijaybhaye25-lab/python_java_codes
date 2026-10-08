import java.util.Scanner;
public class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  number");
        int number=sc.nextInt();

        int i = number;
        do {
            System.out.println(i);
            i--;
        } while (i >= 1);

        sc.close();
    }
}