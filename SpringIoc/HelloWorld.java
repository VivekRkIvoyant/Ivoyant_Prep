package SpringIoc;


import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    public void init(){

    }

    public void sayHello(){
        System.out.println("Say Hello Function");
    }

}

