package Week2.Strings;

public class Concat {
    public static void main(String[] args) {
        System.out.println(conactString());
        System.out.println(conactTwoStrings("hi","world"));
        subString(3);
        System.out.println(convertToLowerCase("VIVEKrk"));
    }

    public static String conactString(){
        String name = "vivek";
        name = name.concat("rk");
        return name;
    }

    public static String conactTwoStrings(String str1,String str2){
        return str1.concat(str2);
    }

    public static void subString(int i){
        String str = "VivekRk";
        System.out.println(str.substring(i));
    }

    public static String convertToLowerCase(String str){
        String s = str.toLowerCase();
        return s;
    }
}

