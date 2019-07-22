package helloProcess;

import org.aspectj.lang.JoinPoint;

public class Security {
    public void goSecurity(){
        System.out.println("공통 : 여기는 보안 처리중!!");

    }
    public void sawonCheck()
    {
        System.out.println("공통 : 여기는 사원인지 인증처리!!");
    }
    public void goSecurity2()
    {
        System.out.println("공통 : 여기는 추가 보안처리중!!");
        System.out.println();
    }
    public void goSecurity3(JoinPoint jp1)
    {
        System.out.println("~~~나 3번째 보안~~~~~~");
        System.out.println("공통 : 나는 alja....에 대한 특별 보안처리중~~~~~~~~");
        System.out.println(jp1.getKind());  //어떤 종류?
        System.out.println(jp1.getSignature().getName());   //target 메소드명
        System.out.println(jp1.getSignature().toLongString()); //target 정보
        System.out.println(jp1.getTarget().getClass().getName()); //target 클래스명
        System.out.println("-------------------------------------------------------------------------");
    }
    public void goSecurity1(JoinPoint jp1) //별도 처리없이 메소드에 JoinPoint객체인자가 넘어온다
    {
        System.out.println("~~~나 1번째 보안~~~~~~");
        System.out.println("공통 : 여기는 보안 처리중~~~~~~~~");
        System.out.println(jp1.getKind());  //어떤 종류?
        System.out.println(jp1.getSignature().getName());   //target 메소드명
        System.out.println(jp1.getSignature().toLongString()); //target 정보
        System.out.println(jp1.getTarget().getClass().getName()); //target 클래스명
        System.out.println("-------------------------------------------------------------------------");
    }

    public void goSecurity22(JoinPoint jp1)
    {
        System.out.println("~~~나 2번째 보안~~~~~~");
        System.out.println("공통 : 여기는 추가 보안 처리중~~~~~~~~");
        System.out.println(jp1.getKind());  //어떤 종류?
        System.out.println(jp1.getSignature().getName());   //target 메소드명
        System.out.println(jp1.getSignature().toLongString()); //target 정보
        System.out.println(jp1.getTarget().getClass().getName()); //target 클래스명
        System.out.println("-------------------------------------------------------------------------");
    }
}
