package mainpkg;

import helloProcess3.SawonDAO;
import helloProcess3.SawonVO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.ArrayList;
import java.util.Iterator;

/*
create table book(bookid number(10),bookname varchar2(20),bookauthor varchar2(20),bookcnt number(10));

        insert into book values(1,'전생슬','일본인',3);



        제약조건 : pk

        drop table teltable2;

        create table teltable2(name varchar2(30) constraints tel_name_pk primary key, tel varchar2(20));


        제약조건 : constraints tel_name_pk primary key
        제약조건	제약조건명	 값에 중복x null x

        insert into teltable2 values('장희수','010-2222-2222');
        insert into teltable2 values('희수씨','010-3333-3333');

*/

public class TelTable2Main1 {
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
    public static void main(String[] args) throws Exception {

        ApplicationContext ac1 = new GenericXmlApplicationContext("spring/jdbctemplatexml.xml");
        sd1 = (SawonDAO)ac1.getBean("sawonDAOBean");
        sv1 = (SawonVO)ac1.getBean("sawonVOBean");

        kaja();


        /*sd1.insert1();*/
        sd1.update1();
        System.out.println("after update......");
        kaja();



    }
}
