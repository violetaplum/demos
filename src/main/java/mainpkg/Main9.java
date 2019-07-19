package mainpkg;

import insapkg.Insa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import setterpkg.Setter;

public class Main9 {
    public static void main(String[] args)
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/appContext8.xml");

        System.out.println(ac.getBean("setterBean", Setter.class).kajaHello("kaja hello.."));
        System.out.println(ac.getBean("setterBean", Setter.class).sawonHello("sawon hello"));
        ac.getBean("setterBean", Setter.class).getInsa();


    }
}
