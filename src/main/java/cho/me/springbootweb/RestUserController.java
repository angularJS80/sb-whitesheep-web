package cho.me.springbootweb;

import cho.me.springbootweb.config.AllControllerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

@RestController
public class RestUserController {
    @Autowired
    HttpMessageConverters httpMessageConverters;

    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        return user;
    }

    @GetMapping("/converterBindCheck/{name}")
    public User getUser(@PathVariable("name") User user){
        return user;
    }

    @GetMapping("/exceptionCheck/{name}")
    public User exceptionCheck(@PathVariable("name") User user) throws Exception{
        throw new AllControllerException("restful error");
    }

}
