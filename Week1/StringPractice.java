package Week1;

public class StringPractice {
    public static void main(String[] args) {
        System.out.println(checkString("vivek","VIVEK"));
    }

    public static boolean checkString(String s1,String s2){
        for(int i=0;i<s1.length();i++){
            if(Character.toLowerCase(s1.charAt(i))!=Character.toLowerCase(s2.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
