package cho.me.springbootweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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

}
