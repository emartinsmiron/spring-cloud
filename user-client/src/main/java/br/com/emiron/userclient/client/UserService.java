package br.com.emiron.userclient.client;

import br.com.emiron.userclient.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="CONFIGSERVICE", fallback = UserServiceFallBackImpl.class)
public interface UserService {

    @GetMapping(value = "/users")
    List<User> findAll();

}
