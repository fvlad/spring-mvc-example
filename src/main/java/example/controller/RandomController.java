package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Vlad Fefelov
 */
@Controller
@RequestMapping("path")
public class RandomController {

    @RequestMapping("/*")
    @ResponseBody
    public String handle() {
        return "success";
    }
}
