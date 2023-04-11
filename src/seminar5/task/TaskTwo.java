package seminar5.task;

import java.util.*;

public class TaskTwo {

    private static List<String> addName() {
        List<String> list = new ArrayList<String>();
        list.add("Иван Иванов"); list.add("Светлана Петрова"); list.add("Кристина Белова"); list.add("Анна Мусина"); list.add("Анна Крутова");
        list.add("Иван Юрин"); list.add("Петр Лыков"); list.add("Павел Чернов"); list.add("Иван Иванов"); list.add("Петр Чернышов");
        list.add("Мария Федорова"); list.add("Марина Светлова"); list.add("Мария Савина"); list.add("Иван Иванов"); list.add("Мария Рыкова");
        list.add("Анна Крутова"); list.add("Марина Лугова"); list.add("Анна Владимирова"); list.add("Петр Лыков"); list.add("Иван Мечников");
        list.add("Петр Петин"); list.add("Петр Лыков"); list.add("Иван Ежов");
        return list;
    }
    public static void sortInRepeat() {
        List<String> list = addName();
        HashMap<String, Integer> map = new HashMap<>();
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            var item = iterator.next();
            /*
             * Можно укоротить код этими строками, остальное после него убрать
             * Integer coincidence = map.get(item.split(" ")[0]);
             * map.put(item.split(" ")[0], coincidence == null ? 1 : coincidence + 1);
             */
            int count = 1;
            if(!map.isEmpty()){
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    if(entry.getKey().split(" ")[0].equals(item.split(" ")[0])){
                        count = entry.getValue();
                        count++;
                        entry.setValue(count);
                    }
                }
                map.put(item.split(" ")[0], count);
            }
            else {
                map.put(item.split(" ")[0], count);
            }
        }
        System.out.println(Arrays.toString(map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).toArray()));
    }
}
