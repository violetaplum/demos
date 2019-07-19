package mainpkg;

import insapkg.Insa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sawonpkg.Sawon;
import setterpkg.Setter;

public class Main7 {
    public static void main(String[] args)
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/appContext6.xml");
        Insa insa1 = ac.getBean("insaBean", Insa.class);
        System.out.println(insa1.helloName("안녕하십니까.."));
        Setter setter = ac.getBean("setterBean", Setter.class);
        System.out.println(setter.sawonHello("sawonhello()..."));

    }
}
