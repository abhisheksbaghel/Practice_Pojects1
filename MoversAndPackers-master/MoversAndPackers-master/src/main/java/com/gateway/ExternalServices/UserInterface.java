package com.gateway.ExternalServices;


import com.gateway.Model.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="USER-SERVICE")
public interface UserInterface {

    @GetMapping("/getuserbyid/{email}")
    Users getById(@PathVariable String email);
}
