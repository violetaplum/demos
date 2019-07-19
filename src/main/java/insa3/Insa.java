package insa3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import sawon3.Sawon;
import javax.annotation.Resource;


public class Insa {

    private String name;
    private int age;
   /* public void setName(String name)
    {
        this.name=name; //나중에 인자가 객체로 넘어올 수 있다..//setter injection
    }*/

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
