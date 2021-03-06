package setter;
import insa.Insa;
import org.springframework.stereotype.Component;
import sawon.Sawon;

@Component  //<context:component-scan base-package="setter"/>
//그러니까 Setter클래스를 applicationcontext에 bean으로 등록시켜
//이 클래스가 spring bean이라고 알려준다.
public class Setter {
    private Insa insa; //Insa클래스 insa객체
    private Sawon sawon;


    //Setter Injection//////////////////////////////////////////////////
   /* public Insa getInsa() //반환형이 객체
    {
        return insa;
    }
    public void setInsa(Insa insa)
    {
        this.insa = insa; //insabean 객체가 전달되어 insa필드에 들어간다
    }
*/
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
   public Setter(Insa insa,Sawon sawon)
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
