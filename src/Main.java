import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        Set<String> set = new HashSet<>(list);
        HashMap<String, Integer> map = new HashMap<>();
        for (var sets : set) {
            int count = 0;
            for (String s : list) {
                if (sets.equals(s)){
                    count++;
                }
            }
            map.put(sets, count);
        }
        System.out.println(map);
    }
}