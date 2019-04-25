package br.com.emiron.userclient.client;

import br.com.emiron.userclient.domain.User;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class UserServiceFallBackImpl implements UserService {
    @Override
    public List<User> findAll() {
        System.out.println("Circuit breaker");
        return Collections.emptyList();
    }
}
