package mainpkg;

import bookProcess.BookDAO;
import bookProcess.BookVO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Iterator;

public class BookMain1 {
    public static void main(String[] args)
    {
        ApplicationContext ac1 = new ClassPathXmlApplicationContext("spring/bookContext.xml");
        BookDAO cd1 = (BookDAO)ac1.getBean("bookDAOBean");
        ArrayList<Object> alist1 = cd1.selectAll();
        Iterator<Object> it = alist1.iterator();


        while(it.hasNext())
        {
            BookVO cv1 = (BookVO)it.next();
            System.out.print(cv1.getBoodId()+"\t"+cv1.getBookName()+"\t"+cv1.getBookAuthor()+"\t"+cv1.getBookCnt());
            System.out.println();
        }
    }
}
