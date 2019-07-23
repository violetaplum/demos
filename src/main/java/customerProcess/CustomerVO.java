package customerProcess;

public class CustomerVO {
    private int cId;
    private String cName;
    private String pName;

    public void setCId(int cid)
    {
        this.cId = cid;
    }
    public void setCName(String cName)
    {
        this.cName=cName;
    }
    public void setPName(String pName)
    {
        this.pName = pName;
    }




    public int getCId()
    {
        return this.cId;
    }
    public String getCName()
    {
        return this.cName;
    }
    public String getPName()
    {
        return this.pName;
    }
}
/*
create table producttbl(cid number(10), cname varchar2(10), pname varchar2(10));

insert into producttbl values(807,'김손님','구두');
insert into producttbl values(808,'장희수','가방');

select* from ProductTBL;*/
