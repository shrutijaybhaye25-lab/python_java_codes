 import java.util.Scanner;

class Marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of subjects:");

        float m1 = sc.nextFloat();
        float m2 = sc.nextFloat();
        float m3 = sc.nextFloat();
        float m4 = sc.nextFloat();

        float total = m1 + m2 + m3 + m4;

        float percentage = (total / 400) * 100;

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage);

        if (percentage > 75) {
            System.out.println("A");
        }
        else if (percentage > 50) {
            System.out.println("B");
        }
        else {
            System.out.println("C");
        }

        sc.close();
    }
}
    

