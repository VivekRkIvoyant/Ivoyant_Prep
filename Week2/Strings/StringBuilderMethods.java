package Week2.Strings;

public class StringBuilderMethods {

    public static void main(String[] args) {
        StringBuilder strBuilder = new StringBuilder();
        System.out.println(strBuilder.capacity());

        StringBuffer strBuffer =new StringBuffer("Hello");
        System.out.println(strBuffer.indexOf("llo"));
        System.out.println(strBuffer.capacity());
    }
}
