package insapkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import sawonpkg.Sawon;

import javax.annotation.Resource;

//초기치 인자로 이름,나이를 넣는데p:를 사용해봅시다.
@Component("insaCom")//or @Component(value="insa10")
public class Insa {
    //@Autowired @Value("길라임")  //property값
    //property.....value=값  에 대한 annotation

    //<bean id="insaBean" class="insa.Insa">
    //    <property name="name" class="길라임"/>
    //</bean>
    @Autowired
    @Qualifier("sawonCom")
    private Sawon sawon;
    private String name;
    private int age;
   /* public void setName(String name)
    {
        this.name=name; //나중에 인자가 객체로 넘어올 수 있다..//setter injection
    }*/

   public Insa(Sawon sawon)
   {
       this.name = sawon.getName();
   }
   public Insa(String name)
   {
       //super();
       this.name=name;
   }
   public Insa(int age)
   {
       this.age=age;
   }
   public Insa(){}
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String name){this.name=name;}

    public String helloYou(String str) //출력전문메소드
    {
        return this.name+" 님\n"+str+"\n나이는"+this.age+"이시군요";
    }
    public String helloName(String str1)
    {
        return this.name+" 님\n"+str1;
    }

    public String insaGo(String str)
    {
        return this.name+" 님\n"+str;
    }
}
