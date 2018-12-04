package cho.me.springbootweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestUserController {
    @Autowired
    HttpMessageConverters httpMessageConverters;

    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        return user;
    }

}
