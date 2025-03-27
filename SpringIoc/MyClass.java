package SpringIoc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MyClass {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config2.class);
        HelloWorld singleton1 = context.getBean("singletonBean", HelloWorld.class);
        HelloWorld singleton2 = context.getBean("singletonBean", HelloWorld.class);
        System.out.println("Singleton: " + (singleton1 == singleton2));

        HelloWorld prototype1 = context.getBean("prototypeBean", HelloWorld.class);
        HelloWorld prototype2 = context.getBean("prototypeBean", HelloWorld.class);
        System.out.println("Prototype: " + (prototype1 == prototype2));
    }
}


