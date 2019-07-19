package setter3;
import insa3.Insa;
import org.springframework.stereotype.Component;
import sawon3.Sawon;

import javax.annotation.Resource;


public class Setter {

    private insa3.Insa insa;
    private sawon3.Sawon sawon;
    //Setter Injection//////////////////////////////////////////////////

    public Insa getInsa() //반환형이 객체
    {
        return insa;
    }

    public void setInsa(Insa insa)
    {
        this.insa = insa; //insabean 객체가 전달되어 insa필드에 들어간다
    }

   //Constructor Injection///////////////////////////////////////////////
   public Setter(){}

   public Setter(Insa insa)
   {
       this.insa = insa;
   }

   public Setter(sawon3.Sawon sawon)
   {
       this.sawon = sawon;
   }

   public Setter(Insa insa, Sawon sawon)
   {
       this.insa = insa;
       this.sawon = sawon;
   }
   public void start()
   {
       System.out.println("spring start");
       //시작할때 이것이 제일 먼저 가동
   }
   public void end()
   {
       System.out.println("spring end");
       //끝날때 가동
   }

    public String sawonHello(String ss)
    {
        return sawon.toString()+ss;
    }
    public String kajaHello(String str)
    {
        return insa.helloName(str);
    }
}
