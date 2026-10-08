public class num {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 23};

        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}