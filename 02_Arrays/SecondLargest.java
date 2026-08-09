public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 90, 34};

        int maximum = Integer.MIN_VALUE;
        int secondMaximum = Integer.MIN_VALUE;

        for (int x : arr) {

            if (x > maximum) {

                secondMaximum = maximum;
                maximum = x;

            } else if (x > secondMaximum && x != maximum) {

                secondMaximum = x;
            }
        }

        System.out.println("Second Largest: " + secondMaximum);
    }
}