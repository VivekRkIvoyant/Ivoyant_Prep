package Week2.Strings;

public class StringBuffersPractice {

    public static void main(String[] args) {
        deleteString();
        deleteAtIndex(6);
        insertIntoString();
        replaceString();
        reverseString();
    }

    public static String insertIntoStringBuffers(){
        StringBuffer sb= new StringBuffer();
        sb.append("v");
        sb.append("i");
        sb.append("v");
        sb.append("e");
        sb.append("k");
        String res = sb.toString();
        return res;
    }

    public static int getStringLength(String str){
        int res = str.length();
        return res;
    }

    public static void deleteString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Intern@Ivoyant");
        System.out.println(sb.delete(2,4));
    }

    public static void deleteAtIndex(int index){
        StringBuffer sb = new StringBuffer();
        sb.append("InternIvoyant");
        System.out.println(sb.deleteCharAt(index));
    }

    public static void insertIntoString(){
        StringBuffer sb = new StringBuffer();
        sb.append("vivek");
        sb.insert(1,"v");
        String s = sb.toString();
        System.out.println(s);
    }

    public static void replaceString(){
        StringBuffer sb = new StringBuffer("Ivoyant");
        sb.replace(1,3,"vivek");
        String s = sb.toString();
        System.out.println(s);
    }

    public static void reverseString(){
        StringBuffer sb = new StringBuffer("Ivoyant");
        sb.reverse();
        System.out.println(sb);
    }
}
