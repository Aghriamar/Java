package seminar2.task;

public class TaskTwo {
    private static String xml = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
    public static void studentGrade(){
        StringBuilder builder = new StringBuilder();
        String[] name = xml.split(",");
        for (int i = 0; i < name.length; i++) {
            String[] test = name[i].split(":")[0].trim().replaceAll("[\"\\{\\}\\[\\]]", "").split("\"");
            if(name[i].split(":")[0].trim().replaceAll("[\"\\{\\}\\[\\]]", "").equals("фамилия")) {
                builder.append("Студент " + name[i].replaceAll("[\"\\{\\}\\[\\]]", "").split(":")[1]);
            }
            if(name[i].split(":")[0].replaceAll("[\"\\{\\}\\[\\]]", "").equals("оценка")){
                builder.append(" получил " + name[i].split(":")[1].replaceAll("[\"\\{\\}\\[\\]]", ""));
            }
            if(name[i].split(":")[0].replaceAll("[\"\\{\\}\\[\\]]", "").equals("предмет")){
                builder.append(" по предмету " + name[i].split(":")[1].replaceAll("[\"\\{\\}\\[\\]]", "") + ".\n");
            }
        }
        System.out.println(builder.toString());
    }
}
