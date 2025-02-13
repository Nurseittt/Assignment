import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("name", "Nurseit");
        names.put("surname", "Kosdavletov");

        System.out.print(names);
        HashMap<String, String> otherNames = new HashMap<>();
        names.put("namee", "Zhanbolat");
        names.put("surnamee", "Akhmetov");
        names.clear();
        otherNames.clear();
        System.out.println(otherNames);
        System.out.print(names.isEmpty());
        System.out.print(otherNames.isEmpty());
    }
}