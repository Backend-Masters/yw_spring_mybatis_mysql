package master.backend.YwSpringMybatisMysql.web_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebControllerTest {

    @RequestMapping(value = "/webController.do")
    public String helloWorld(ModelMap modelMap) {
        modelMap.addAttribute("author", "kywpcm");
        return "index";
    }

    @RequestMapping(value = "/2/webController.do")
    public String helloWorld2(ModelMap modelMap) {
        modelMap.addAttribute("author", "2");
        return "index";
    }

    @RequestMapping(value = "/3/webController.do")
    public String helloWorld3(@RequestParam("test") String test) {
        System.out.println("test = [" + test + "]");
        return "index";
    }

}
