package aljahobby;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sawonpkg.Sawon;

@Component("aljaCom") //이름 안줘도 클래스 소문자가 default이다.
public class AljaHobbyClass {

    @Autowired
    @Qualifier("sawonQual")
    //@Inject
    //@Named("sawon")
    private Sawon sawon;

    public AljaHobbyClass(){}
    public AljaHobbyClass(Sawon sawon)
    {
        this.sawon = sawon;
    }
    public Sawon getSawon(){
        return sawon;
    }
    public void setSawon(Sawon sawon)
    {
        this.sawon=sawon;
    }

    @Override
    public String toString()
    {
        return "Alja + Sawon"+sawon.toString();
    }

    public void hobby(){
        System.out.println("My hobby is Gamming...");
    }
}
