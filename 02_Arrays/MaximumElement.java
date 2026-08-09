public class MaximumElement {

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 90, 34};

        int maximum = arr[0];

        for (int x : arr) {

            if (x > maximum) {
                maximum = x;
            }
        }

        System.out.println("Maximum: " + maximum);
    }
}