import java.util.HashMap;

public class FrequencyCount {

    public static void main(String[] args) {

        int[] arr = {5, 5, 2, 3, 2, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        System.out.println(map);
    }
}