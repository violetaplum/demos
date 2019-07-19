package mainpkg;

import aljahobby.AljaHobbyClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
      /*  ApplicationContext ac = new ClassPathXmlApplicationContext("/spring/applicationContext.xml");
*/
        /*GenericApplicationContext gxac1 = new GenericXmlApplicationContext("/spring/applicationContext.xml");
        Generic을 써도 무상관!!

        마지막엔
        gxac1.close();

        * */
/*

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
*/

      /*  ApplicationContext ac2 = new ClassPathXmlApplicationContext("spring/applicationContext2.xml");

        Sawon s3 = (Sawon)ac2.getBean("sawon1");
        Sawon s4 = (Sawon)ac2.getBean("sawon2");

        System.out.println(s3.toString());
        System.out.println(s4.toString());

*/

      /*  String str1 = "hello, spring";
        GenericXmlApplicationContext gxac1 = new GenericXmlApplicationContext("applicationContext.xml");
        ApplicationContext ac2 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Insa insa = gxac1.getBean("insaBean3",Insa.class);
        System.out.println(insa.helloName(str1));
        Setter setter1 = gxac1.getBean("setterBean", Setter.class);
        System.out.println(setter1.kajaHello(str1));
        gxac1.close();*/


      ApplicationContext ac3 = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

      AljaHobbyClass al1 = (AljaHobbyClass)ac3.getBean("al1",AljaHobbyClass.class);

        System.out.println(al1.toString());
        al1.hobby();
        //al1.getSawon().hobby()로 할수도 있음


/*
setter1.kajaHello(str1)은 이제 드디어 드라마틱하게
            public String kajaHello(String str1)
        {
            return insa.helloName(str1);
        }
        의 insa.helloName(str1)을 가동시키는데
            보니까 insa에 Insa클래스 insaBean객체가 들어있고 helloName은 Insa클래스 안에 있으니 결국 Insa클래스의 helloName이 가동됨*/



    }
}
