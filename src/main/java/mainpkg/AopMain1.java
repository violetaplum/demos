package mainpkg;

import helloProcess.HelloProcess;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sawon.SawonProcess;

public class AopMain1 {
    public static void main(String[] args)
    {
        System.out.println("hello!!!!!");
        ApplicationContext ac1 = new ClassPathXmlApplicationContext("spring/aopContext.xml");
        HelloProcess hp1 = (HelloProcess)ac1.getBean("helloProcessBean"); //aopContext.xml에 있는 bean이름
        SawonProcess sa1 = (SawonProcess)ac1.getBean("sawonBean");
        /*핵심 : kajadrive(), 공통 : gosecurity()*/
        /*aop:before이기때문에  goSecurity()가 kajaDrive()전에 달라붙어서 실행된다!!!!!*/
        /*aop:after이면 kajaDrive()후에 달라붙어서 goSecurity()가 실행된다*/
        hp1.kajaDrive();
        hp1.kajaDrive();
        hp1.kajaDrive();



        System.out.println("----------------------------------------------------------------------------------------");


        sa1.sawonDataProcess();
        sa1.sawonIncomProcess();
        sa1.sawonTrip();



        String tel = "010-4915-2532";
        ApplicationContext ac2 = new ClassPathXmlApplicationContext("spring/aopContext2.xml");
        HelloProcess hp2 = (HelloProcess)ac2.getBean("helloProcessBean");
        System.out.println(hp2.aljaTelNum(tel));



        ((AbstractApplicationContext)ac1).close();
        ((AbstractApplicationContext)ac2).close();
    }
}
