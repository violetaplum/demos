package setter;
import insa.Insa;

public class Setter {
    private Insa insa; //Insa클래스 insa객체
    public Insa getInsa() //반환형이 객체
    {
        return insa;
    }
    public void setInsa(Insa insa)
    {
        this.insa = insa; //insabean 객체가 전달되어 insa필드에 들어간다
    }
    public String kajaHello(String str)
    {
        return insa.helloName(str);
    }
}
