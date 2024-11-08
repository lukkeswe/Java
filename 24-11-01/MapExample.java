import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("first name", "Lukas");
        map.put("last name", "Norlund");
        map.put("address", "恵庭市恵み野里美１丁目１−１９");
        map.put("tel", "070-2314-2840");

        System.out.println(map.entrySet());
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.get("first name"));
        System.out.println(map.get("last name"));
        System.out.println(map.get("address"));
        System.out.println(map.get("tel"));
        System.out.println(map.get("e-mail"));
    }
}
