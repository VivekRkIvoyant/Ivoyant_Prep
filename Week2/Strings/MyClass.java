package Week2.Strings;

public class MyClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        ThreadsString threadsString1 = new ThreadsString(sb);
        ThreadsString threadsString2 = new ThreadsString(sb);
        threadsString1.start();
        threadsString2.start();

        StringBuilder strBuilder = new StringBuilder("Hello World");

        System.out.println("String Builder");

        StringBuilderThread str1 = new StringBuilderThread(strBuilder);
        StringBuilderThread str2 = new StringBuilderThread(strBuilder);
        str2.start();
        str1.start();

    }
}
