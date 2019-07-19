package mainpkg;

import aljahobby.AljaHobbyClass;
import insapkg.Insa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sawon.Sawon;

public class Main6 {
    public static void main(String[] args)
    {
        System.out.println("hello..");
        String str1 = "hello, Spring";
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/appContext6.xml");
        Insa insa = (Insa)ac.getBean("insa",Insa.class); //이때 value를 getBean에서 주는것과 같다
        //앞의 이름에서 클래스이름의 대문자를 소문자로 바꾼것이 default이기 때문에 Component에 안넣어도된다!!
        //Insa insa = (Insa)ac.getBean("helloInsa"); //이렇게 사용도 가능! @component에서 value를 정해줬기 때문
        System.out.println(insa.helloName("who are you??"));
        /*Sawon sawon = (Sawon)ac.getBean("sawon11",Sawon.class);*/
        System.out.println(ac.getBean("sawon",Sawon.class).toString());
        ac.getBean("alja11", AljaHobbyClass.class).hobby();
    }
}
