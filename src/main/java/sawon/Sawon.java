package sawon;

public class Sawon {
    private String id;
    private String name;

    public void setId(String id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getId()
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
