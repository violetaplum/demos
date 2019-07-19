package mainpkg;

import aljahobby2.AljaHobbyClass;
import configurationbean.ConfigurationBean;
import insa3.Insa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import setter3.Setter;

public class confBeanMain {
    public static void main(String[] args)
    {
        ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigurationBean.class);
        //xml 설정 없이 ConfigurationBean이 .xml역할
        //이때 자바에노테이션에서는
        //AnnotatinConfigApplicationContext사용


        Setter bean = ac.getBean(setter3.Setter.class);
        AljaHobbyClass bean2 = ac.getBean(aljahobby2.AljaHobbyClass.class);
        System.out.println(bean.getInsa().insaGo("insaGo"));
        System.out.println(bean.kajaHello("kajaHello"));
        System.out.println(bean.sawonHello("sawonHello"));
        System.out.println(bean2.toString());
        System.out.println(bean2.toString());
        bean2.hobby();
        ((AbstractApplicationContext)ac).close(); //spring end 가 출력되는 이유..

    }
}
