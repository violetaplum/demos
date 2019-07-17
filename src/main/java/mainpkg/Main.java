package mainpkg;

import insa.Insa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import sawon.Sawon;
import sun.net.www.content.text.Generic;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/spring/applicationContext.xml");

        /*GenericApplicationContext gxac1 = new GenericXmlApplicationContext("/spring/applicationContext.xml");
        Generic을 써도 무상관!!

        마지막엔
        gxac1.close();

        * */

        String str = "How's the wheather today?";

        Sawon s1 = (Sawon)ac.getBean("sawon1");
        Sawon s2 = (Sawon)ac.getBean("sawon2"); //xml에서 만든 Bean객체
        s1.setId("1");//Sawon클래스의 setter가동  //applicationContext.xml 에서 bean객체 생성하면서 name값을 지정해줬음..
        s2.setId("2");
        System.out.println(s1.toString());
        System.out.println(s2.toString());

        Insa in1 = (Insa)ac.getBean("insaBean");
        System.out.println(in1.insaGo(str));


        Insa in2 = (Insa)ac.getBean("insaBean2");
        System.out.println(in2.helloYou(" Hello!!!!"));

        ApplicationContext ac2 = new ClassPathXmlApplicationContext("spring/applicationContext2.xml");

        Sawon s3 = (Sawon)ac2.getBean("sawon1");
        Sawon s4 = (Sawon)ac2.getBean("sawon2");

        System.out.println(s3.toString());
        System.out.println(s4.toString());
    }
}
