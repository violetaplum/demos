package mainpkg;

import aljahobby.AljaHobbyClass;
import insa.Insa;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args)
    {

        System.out.println("hello!!");
        String str="hello, spring..";

        //ApplicationContext ac = new ClassPathXmlApplicationContext("spring/appContext3.xml");
        //항상 xml의 위치에 주의하여 참고하도록 한다.
        System.out.println(new ClassPathXmlApplicationContext("spring/appContext3.xml").getBean("insaBean",Insa.class).helloName(str));
        System.out.println(new ClassPathXmlApplicationContext("spring/appContext3.xml").getBean("aljaBean", AljaHobbyClass.class).toString());
    }
}
