package seminar5.task;

import java.util.*;

public class TaskOne {
    private static HashMap<String, ArrayList> pb = new HashMap<String, ArrayList>();
    private static ArrayList list = new ArrayList();
    private static Scanner scanner = new Scanner(System.in);
    private static String phone = "";
    private static String name = "";
    private static String stop = "";
    public static void phoneBook() {
        while (!stop.equals("exit")) {
            System.out.println(Arrays.toString(pb.entrySet().toArray()));
            System.out.println("\nEnter first name: ");
            name = scanner.next();
            stop = name;
            System.out.println("\nEnter last name: ");
            name += " " + scanner.next();
            add(name);
        }
    }

    private static void add(String name) {
        while (!existPhone()){
        }
        pb.put(name, list);
    }

    private static boolean existPhone() {
        System.out.println("\nEnter phone: ");
        phone = scanner.next();
        if(equals(name, phone)){
            System.out.println("This number is exists!");
            return false;
        }
        else {
            list.add(phone);
            return true;
        }
    }
    private static boolean equals(String name, String phone){
        list = new ArrayList<>();
        for (Map.Entry<String, ArrayList> entry : pb.entrySet()) {
            if(entry.getKey().equals(name)) {
                if(!entry.getValue().contains(phone)) {
                    ListIterator iterator = entry.getValue().listIterator();
                    while (iterator.hasNext()) {
                        var item = iterator.next();
                        list.add(item);
                    }
                }
                else
                    return true;
            }
        }
        return false;
    }
}
