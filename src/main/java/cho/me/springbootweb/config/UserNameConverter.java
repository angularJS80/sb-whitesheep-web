package cho.me.springbootweb.config;

import cho.me.springbootweb.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class UserNameConverter implements Converter<String,User> {

    @Nullable
    @Override
    public User convert(String name) {
        User user = new User();
        user.setName(name);
        return user;
    }
}
