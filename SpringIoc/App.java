package SpringIoc;

public class App
{
    public static void main( String[] args ){
        try{
            System.out.println( "Hello World!" );
            ApplicationContext context = new ClassPathXmlApplicationContext("src/main/java/Config.xml");
            Student student = (Student) context.getBean("student1");
            System.out.println(student);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

