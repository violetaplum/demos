package aljahobby2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import sawon3.Sawon;


public class AljaHobbyClass {

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
