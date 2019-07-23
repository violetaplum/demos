package mainpkg;

import helloProcess2.HelloProcess; //import 하는 패키지에 주의한다!
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sawon.SawonProcess;


public class AopMain2 {
    public static void main(String[] args)
    {

        System.out.println("hello!!!!!");
        ApplicationContext ac1 = new ClassPathXmlApplicationContext("spring/aopContext3.xml");

        HelloProcess hp1 = (HelloProcess)ac1.getBean("helloProcessBean"); //aopContext.xml에 있는 bean이름
        SawonProcess sa1 = (SawonProcess)ac1.getBean("sawonProcessBean");

        hp1.kajaDrive();
        hp1.kajaDrive();
        hp1.kajaDrive();

        System.out.println("----------------------------------------------------------------------------------");

        String str = "010-4915-2532";

        sa1.sawonTrip();
        sa1.sawonIncomProcess();
        sa1.sawonDataProcess();

        System.out.println("----------------------------------------------------------------------------------");

        sa1.sawonTel(str);

        ((AbstractApplicationContext)ac1).close();
    }
}
