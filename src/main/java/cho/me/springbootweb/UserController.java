package cho.me.springbootweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    HttpMessageConverters httpMessageConverters;
    @RequestMapping("/")
    public String get(){
        httpMessageConverters.forEach(c->{
            System.out.println(c.getClass());
        });
        return "";
    }

}
