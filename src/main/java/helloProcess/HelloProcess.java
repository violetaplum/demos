package helloProcess;

public class HelloProcess {
    //spring은 method만 된다.. 필드 등등 안됨
    //이 메소드에 공통기능들이 다 붙는것임
    //그것이 aop:before의 method="goSecurity"메소드가 된다..
    public void kajaDrive() //핵심 로직 메소드
    {
        //주요 핵심 로직메소드
        System.out.println("멋지게 드라이브하자!!!");
    }
    public String aljaTelNum(String tel) //핵심 로직 메소드
    {
        return "장희수님의 전화번호는 "+tel+" 입니다.";
    }

}
