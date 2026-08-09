public class MinimumElement {

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 90, 34};

        int minimum = arr[0];

        for (int x : arr) {

            if (x < minimum) {
                minimum = x;
            }
        }

        System.out.println("Minimum: " + minimum);
    }
}