package mainpkg;

import aljahobby.AljaHobbyClass;
import insapkg.Insa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sawonpkg.Sawon;
import setterpkg.Setter;

public class Main8 {
    public static void main(String[] args)
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/appContext7.xml");
        System.out.println(ac.getBean("sawonBean", Sawon.class).toString());
        System.out.println(ac.getBean("setterBean", Setter.class).kajaHello("kajahello!!"));
        System.out.println( ac.getBean("aljaCom", AljaHobbyClass.class).toString());
        ac.getBean("aljaCom", AljaHobbyClass.class).hobby();


    }
}
