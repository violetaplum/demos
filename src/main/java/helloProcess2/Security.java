package helloProcess2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect //여기가 xml의 <aop:aspect>부분   //@Component는 저쪽에서 만들어놓은 객체 쓰겠다는 의미가 된다.
public class Security {

    //Single Pointcut with multiple packages............................ use '||'
    @Pointcut("execution(* helloProcess2..*()) || execution(* sawon..*())")//helloProcess2아래의 인자가 없는 모든 메소드들 //스프링은 pointcut적용시 메소드 only!!!!

    //joinpoint : 공통내용을 적용할 메소드 전체
    //pointcut : 그 중에서 before/after써주는 정확한 메소드
    //예) kajaDrive()등등..이 될수 있겠다.
    private void mukja(){ //아무 메소드나 만든다.
        System.out.println("actual mukja() method............");
    }

    @Before("mukja()")//상위의 mukja()가 무엇인지 알려줌 ----> before
    // @Before("within(helloProcess.HelloProcess)") 한 후 상위의 mukja()를 생략해도 된다.
    @Order(0)
    public void goSecurity(){
        System.out.println("공통 : 여기는 보안 처리중!!   사실은 Before  mukja()!!!!  goSecurity()");
    }
    @After("mukja()")
    @Order(1)
    public void goSecurity2()
    {
        System.out.println("공통 : 여기는 보안 처리중!!   사실은 After   mukja()!!!!!!!!!  goSecurity2()");
    }
    @After("mukja()")
    //@After("execution(public * helloProcess..*Process.al*(..))") 으로 써도 가능!!
    @Order(2)
    public void goSecurity3(JoinPoint jp1)
    {
        System.out.println("공통 : 여기는 보안 처리중!!   사실은 After   mukja()!!!!!!!!!  goSecurity3()");
        System.out.println(jp1.getKind());  //어떤 종류?
        System.out.println(jp1.getSignature().getName());   //target 메소드명
        System.out.println(jp1.getSignature().toLongString()); //target 정보
        System.out.println(jp1.getTarget().getClass().getName()); //target 클래스명
        System.out.println("-------------------------------------------------------------------------");
    }



    //주요 메소드 에 before를 적용, 공통 로직은 goSecurity()가 됨
    /*
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
    }*/
}
