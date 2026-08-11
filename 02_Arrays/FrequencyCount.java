import java.util.HashMap;

public class FrequencyCount {

    public static void main(String[] args) {

        int[] arr = {5, 5, 2, 3, 2, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {

            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }

        System.out.println(map);
    }
}