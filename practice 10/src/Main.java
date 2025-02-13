import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("1", "NNN");
        names.put("2", "KKK");
        names.put("3", "MMM");
        names.put("4", "SSS");
        //System.out.println(names.get("1"));
        //names.remove("3");
        //System.out.print(names);
        //System.out.println(names.keySet());
        //System.out.println(names.values());
        //names.clear();
        //System.out.println(names);
        //System.out.println(names.isEmpty());
        HashMap<String, String> otherNames = new HashMap<>();
        names.put("5", "AAA");
        names.put("6", "BBB");
        names.put("7", "CCC");
        names.put("8", "ZZZ");
        names.putAll(otherNames);
        System.out.print(names);
    }
}