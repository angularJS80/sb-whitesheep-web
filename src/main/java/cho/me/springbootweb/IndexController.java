package cho.me.springbootweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @Autowired
    HttpMessageConverters httpMessageConverters;
    @GetMapping("/")
    public String get(){

       /* httpMessageConverters.forEach(c->{
            System.out.println(c.getClass());
        });*/
        return "";
        //curl http://localhost:8080/ 기본 리턴 String
    }

    @GetMapping(value = "${hello.path}",produces = MediaType.TEXT_HTML_VALUE)
    public String getFreemaker(Model model, @RequestParam String name){
        model.addAttribute("name",name);
        return "hello";
    }


}
