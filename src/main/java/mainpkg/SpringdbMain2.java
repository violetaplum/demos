package mainpkg;


import customerProcess.CustomerDAO;
import customerProcess.CustomerVO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Iterator;

public class SpringdbMain2 {
   public static void main(String[] args)
   {
       ApplicationContext ac1 = new ClassPathXmlApplicationContext("spring/customerContext.xml");
       CustomerDAO cd1 = (CustomerDAO)ac1.getBean("customerDAOBean");
       ArrayList<Object> alist1 = cd1.selectAll();
       Iterator<Object> it = alist1.iterator();


       while(it.hasNext())
       {
           CustomerVO cv1 = (CustomerVO)it.next();
           System.out.print(cv1.getCId()+"\t"+cv1.getCName()+"\t"+cv1.getPName());
           System.out.println();
       }
   }

}
