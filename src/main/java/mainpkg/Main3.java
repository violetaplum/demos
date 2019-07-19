package mainpkg;

import insa.Insa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sawon.Sawon;
import setter.Setter;

public class Main3 {
    public static void main(String[] args)
    {
       /* ApplicationContext ac1 = new ClassPathXmlApplicationContext("spring/appContext3.xml");
       System.out.println( ac1.getBean("sawon1",Setter.class).sawonHello("Asety 43"));
*/
       /*String[] conBae = {"spring/appContext3.xml","spring/appContext4.xml"};
        GenericApplicationContext g1 = new GenericXmlApplicationContext(conBae);*/
       ApplicationContext g1 = new ClassPathXmlApplicationContext("spring/appContext3.xml");


       Insa insa1 = g1.getBean("insaBean",Insa.class);
        Setter set1 = g1.getBean("setterBean",Setter.class);
        Sawon sa2 = g1.getBean("sawonBean",Sawon.class);
        System.out.println(sa2.toString());
        System.out.println(set1.kajaHello("adf"));
        System.out.println(insa1.helloName("hello!!!!!!"));
        /*g1.close();*/
    }

}
