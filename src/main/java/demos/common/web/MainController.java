package demos.common.web;

import org.apache.log4j.Logger;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


/**

 * Created by palao on 2016-07-14.

 */

@Controller

public class MainController {

    protected Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping(value="/",method= RequestMethod.GET)  // /로 시작되는것을 찾아오는것.. 그래서 web.xml에 /가 있었던것!!
    public String Index(Model model) throws Exception {

        logger.info("index.....");
        /*Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,(int)date.getTime());
                String formattedDate = dateFormat.formate(date);*/

        System.out.println("index");
        //model.addAttribute("serverTime",formattedDate); //serverTime을 추가해주라는 의미.. 이 정보는 formattedDate가 가지고있음

        return "index"; //home이라는 이름을 가진 home.jsp를 찾아가라는 것. 이것이 바로 view를 지시하는 것
        //뒤에 알아서 .jsp가 붙게된다
        //dispatcher-servlet.xml에서 prefix의 경로와 끝의 .jsp때문!!

    }

    @RequestMapping("/main.do")

    public String Main(Model model) throws Exception {

        logger.info("main.....");

        System.out.println("main");

        return "home";

    }

}


