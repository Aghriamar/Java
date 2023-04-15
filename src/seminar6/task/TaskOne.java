package seminar6.task;

import java.util.*;

/*
 * Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:

 * 1 - бренд
 * 2 - цвет

 * Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 * СПОЙЛЕР:
 * 1) создаете класс ноутбук (equals, hashCode)
 * 2) создаете сет ноутбукоа
 * 3) создаете и заполняете Map<Integer, Laptop>
 * 4) запрашиваете через сканнер у пользователя критерий фильтрации
 * 5) циклом проходите по Map.Entry<Integer, Laptop> entry: entries
 * 6) В результирующий Set<Laptop> складываете ноутбуки entry.getValue() у которых
 * равны критерию пользователя
 */

public class TaskOne {


    private static Map<Integer, String> filterValues = new HashMap<>();
    private static final Set<Notebook> notebooks = new HashSet<>();
    private static  Set<Notebook> filteredNotebooks = new HashSet<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static final int LAPTOP_COUNT = 10;
    private static final String[] brands = {"HP", "ASUS", "Lenovo", "ZenBook", "Xiaomi"};
    private static final String[] colors = {"White", "Black", "Blue", "Yellow", "Green", "Red", "Grey"};
    private static final String[] models = {"M6500QC-L1088", "K3502ZA-MA173", "G513IH-HN014", "X1502ZA-BQ820", "FX506HE-HN012"};
    private static final String[] prices = {"800", "900", "1200", "1500", "2000"};

    private static void createLaptop() {
        for (int i = 0; i < LAPTOP_COUNT; i++) {
            notebooks.add(new Notebook(brands[random.nextInt(brands.length)], models[random.nextInt(models.length)], colors[random.nextInt(colors.length)], prices[random.nextInt(prices.length)]));
        }
    }

    public static void laptop() {
        createLaptop();
        for (Notebook notebook : notebooks) {
            System.out.println(notebook.toString());
        }
        filterValues = new HashMap<>();
        System.out.println("Enter the number that matches the required criteria: ");
        System.out.println("1 - Brand");
        System.out.println("2 - Model");
        System.out.println("3 - Color");
        System.out.println("4 - Price");
        int filterChoice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a value for the selected criterion: ");
        String filterValue = scanner.nextLine();
        filterValues.put(filterChoice, filterValue);
        filteredNotebooks = filterNotebooks(notebooks, filterValues);
        System.out.println("\nSearching results: ");
        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook);
        }
    }

    public static Set<Notebook> filterNotebooks(Set<Notebook> notebooks, Map<Integer, String> filters) {
        filteredNotebooks = new HashSet<>();
        for (Notebook notebook : notebooks) {
            boolean matches = true;
            for (Map.Entry<Integer, String> entry : filters.entrySet()) {
                int fieldIndex = entry.getKey();
                String fieldValue = entry.getValue();
                if (!notebook.getFieldValue(fieldIndex).equals(fieldValue)) {
                    matches = false;
                    break;
                }
            }
            if (matches) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }
}
