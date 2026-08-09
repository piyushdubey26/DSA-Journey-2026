public class ArraySum {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int total = 0;

        for (int x : arr) {

            total += x;
        }

        System.out.println("Sum: " + total);
    }
}