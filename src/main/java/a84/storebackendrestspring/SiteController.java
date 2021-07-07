package a84.storebackendrestspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class SiteController {


    @RequestMapping("/")
    String index(Principal p, Model m) {
        m.addAttribute("principal", p);
        return "index";
    }


}
