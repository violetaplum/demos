package helloProcess3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.sql.Date;


public class SawonVO {

    private String name;
    private String tel;
    private String id;
    private Date d;

    public Date getDate()
    {
        return this.d;
    }
    public void setDate(Date d)
    {
        this.d = d;
    }

    public String getId()
    {
        return this.id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getTel()
    {
        return this.tel;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setTel(String tel)
    {
        this.tel =tel;
    }
}
