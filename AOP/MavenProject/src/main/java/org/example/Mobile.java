package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

    @Autowired
    @Qualifier("airtel")
    private Sim sim;

    public void useSim(){
        sim.calling();
        sim.data();
    }
//
//    @Autowired
//    private Sim sim;
//
//    public void useSim(){
//        sim.calling();
//        sim.data();
//    }

    public static void main(String[] args) {

//        Tight coupling approach
//        Sim sim = new Jio();
//        sim.calling();
//        sim.data();
//
//        Sim sim1 = new Airtel();
//        sim1.calling();
//        sim1.data();


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:Config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
        Mobile mobile = ctxt.getBean(Mobile.class);
        mobile.useSim();


        Sim simSim =   context.getBean("sim",Sim.class);
        simSim.calling();
        simSim.data();


        Sim sim2 = applicationContext.getBean("sim2", Sim.class);
        sim2.calling();
        sim2.data();

        //        Changing my sim from airtel to docomo
        Sim sim3 = applicationContext.getBean("sim3", Sim.class);
        sim3.calling();
        sim3.data();

    }
}
