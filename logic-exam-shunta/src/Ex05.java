import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {
    public static void main(String[] args) {
        String[] sports = { "soccer", "baseball", "jogging", "jogging", "soccer", "surfing", "surfing", "soccer",
                "surfing",
                "baseball", "boxing", "surfing", "soccer", "surfing", "jogging", "boxing", "jogging", "baseball",
                "soccer",
                "soccer" };
        Map<String, Integer> map = new HashMap<>();

        // Integer count = 1;
        // map.put("soccer", count);

        Integer count = 1;
        for (String sport : sports) {

            if (map.get(sport) == null) {
                map.put(sport, count);
            } else if (map.get(sport) >= 1) {
                count = map.get(sport) + 1;
                map.put(sport, count);
            }
        }

        Set<String> setList = map.keySet();

        // int total = 0;
        int max = 0;
        for (String sport : setList) {
            int i = map.get(sport);
            // System.out.println(i + sport);
            if (i > max) {
                max = i;
                System.out.println("最も出現回数の多いスポーツは" +sport+"で、"+"出現回数は"+max+"回です" );
            }
        }

    }

}
