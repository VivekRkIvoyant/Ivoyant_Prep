package Week2.Strings;

public class Immutable {
    public static void main(String[] args) {
        String str = "Ivoyant";
        appendIntoString(str);
        System.out.println(str);
    }

    public static void appendIntoString(String s){
        s = s + "Systems";
    }
}
