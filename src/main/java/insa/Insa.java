package insa;
//초기치 인자로 이름,나이를 넣는데p:를 사용해봅시다.
public class Insa {
    private String name;
    private int age;
    public void setName(String name)
    {
        this.name=name; //나중에 인자가 객체로 넘어올 수 있다..//setter injection
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String helloYou(String str) //출력전문메소드
    {
        return this.name+" 님\n"+str+"\n나이는"+this.age+"이시군요";
    }
    public String insaGo(String str)
    {
        return this.name+" 님\n"+str;
    }
}
