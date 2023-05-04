    import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        String str = "hope happy best good better good well happy";
        String arr[] = str.split(" ");
        HashSet<String> H = new HashSet<String>();
        for (String a : arr) {
            H.add(a);
        }
        System.out.println(H);
    }
}

