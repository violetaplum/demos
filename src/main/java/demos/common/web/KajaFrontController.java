package demos.common.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class KajaFrontController {
    @RequestMapping(value="/moyamoya",method=RequestMethod.GET)
    public String kaja(Model model, HttpServletRequest req)
    {
        String name = req.getParameter("name");
        model.addAttribute("mname",name);
        return "kaja";

    }

    @RequestMapping(value="/naya",method=RequestMethod.GET)
    public String kaja22(Model model,HttpServletRequest req)
    {
        Date d1 = new Date();
        model.addAttribute("md1",d1);
        return "kaja22";
    }
}
