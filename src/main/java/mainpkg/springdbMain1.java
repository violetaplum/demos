package mainpkg;

import helloProcess3.SawonDAO;
import helloProcess3.SawonVO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class springdbMain1 {
    static SawonDAO sd1;
    static SawonVO sv1;
    public static void kaja()
    {
        ArrayList<Object> alist1 = sd1.selectAll();
        Iterator<Object> it1 = alist1.iterator();
        while(it1.hasNext())
        {
            SawonVO sv1 = (SawonVO)it1.next();
            System.out.print(sv1.getName()+"\t"+sv1.getTel());
            System.out.println();
        }

    }
    public static void main(String[] args) throws ParseException {
        ApplicationContext ac1 = new GenericXmlApplicationContext("spring/jdbctemplatexml.xml");
        sd1 = (SawonDAO)ac1.getBean("sawonDAOBean");
        sv1 = (SawonVO)ac1.getBean("sawonVOBean");

        SawonVO sv2 = new SawonVO();
        sv2.setName("jang");
        sv2.setTel("010-8888-9999");
        sd1.update1(sv2);

        SawonVO svd = new SawonVO();
        svd.setName("mimi");

        kaja();
        SawonVO svi = new SawonVO();
        svi.setTel("010-2834-2948");
        svi.setName("mimi");
        svi.setId("11");
        svi.setDate(new Date(2019/9/27));
        sd1.insert1(svi);
        kaja();

        kaja();
        sd1.update1(sv2);
        kaja();
        sd1.delete1(svd);
        kaja();

        sd1.update1();
       kaja();
       sd1.update1("jang","010-4915-2532");
        System.out.println("after  update1 !!!!------------------------------------------------------");
       kaja();

       sd1.insert1("3","back","010-4444-3343",new Date(2019/07/23));
        System.out.println("after  insert1 !!!!------------------------------------------------------");
       kaja();



       sd1.delete1("back");
        System.out.println("after  delete1 !!!!!-----------------------------------------------------");
       kaja();

        Scanner sc = new Scanner(System.in);


       while(true) {
           System.out.println("1. 사원 모두 출력\n2. 사원 추가\n3. 사원삭제\n4. 사원 수정");
           int num;
           num = sc.nextInt();
           if(num==1)
           {
               System.out.println("모든 사원을 출력합니다 >>");
               kaja();
           }
           else if(num==2)
           {
               System.out.println("id > name > tel > date 순으로 입력해 주세요 >>");

               System.out.print("id를 입력해주세요 >>");
               String id=sc.nextLine();

               System.out.print("name을 입력해주세요 >>");
               String name=sc.nextLine();

               System.out.print("tel을 입력해주세요 >>");
               String tel=sc.nextLine();

             /*  DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
               java.util.Date utilDate = (Date)formatter.parse(new java.util.Date());
               java.sql.Date d = new java.sql.Date(utilDate.getTime());
               */



              /* sd1.insert1(id,name,tel,d);*/
           }
           else if(num==3)
           {

               System.out.println("삭제할 사원을 입력하세요>> ");
               String name=sc.nextLine();

               sd1.delete1(name);
           }
           else if(num==4)
           {
               System.out.println("수정할 사원 이름을 입력하세요 >> ");
               String name=sc.nextLine();
               System.out.println(name+" 사원의 변견된 번호를 입력 해 주세요 >>");
               String tel=sc.nextLine();
               sd1.update1(name,tel);
           }
           else if(num==0)
           {
               System.out.println("프로그램을 종료합니다....");
               break;
           }
       }





    }
}
