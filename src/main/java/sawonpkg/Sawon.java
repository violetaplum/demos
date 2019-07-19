package sawonpkg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sawonCom")
public class Sawon {
    @Value("13")
    private int id;
    @Value("장희수")
    private String name;

    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public Sawon(){}
    public Sawon(String name)
    {
        this.name=name;
    }
    public Sawon(int id)
    {
        this.id=id;
    }
    public Sawon(String name, int id)
    {
        this.name=name;
        this.id=id;
    }

    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }

    @Override
    public String toString()
    {
        return "My name is : "+getName()+"     and my ID is : "+getId();
    }

}
