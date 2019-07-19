package mainpkg;

import insa.Insa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sawon.Sawon;
import setter.Setter;

public class Main5 {
    public static void main(String[] args)
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/appContext5.xml");
        ac.getBean("sawonBean", Sawon.class);
        ac.getBean("insaBean", Insa.class);
        ac.getBean("setterBean", Setter.class);

    }
}
