package setterpkg;
import insapkg.Insa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import sawonpkg.Sawon;

import javax.annotation.Resource;

@Component("setterCom")
public class Setter {

    //@Autowired
    //@Qualifier("insaQual")
    @Resource(name="insaCom")
    private Insa insa; //Insa클래스 insa객체
    //@Autowired
    //@Qualifier("sawonQual")
    @Resource(name="sawonCom")
    private Sawon sawon;


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

   public Setter(Sawon sawon)
   {
       this.sawon = sawon;
   }

   public Setter(Insa insa, Sawon sawon)
   {
       this.insa = insa;
       this.sawon = sawon;
   }

    public String sawonHello(String ss)
    {
        return sawon.toString();
    }
    public String kajaHello(String str)
    {
        return insa.helloName(str);
    }
}
