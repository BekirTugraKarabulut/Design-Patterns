package com.tugra.controller;

import com.tugra.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @GetMapping(path = "/user")
    public Users getUser() {

        return new Users.UserBuilder()
                .firstName("Tuğra")
                .lastName("Karabulut")
                .email("tugra@gmail.com")
                .age(22)
                .build();
    }

    //Çok sayıda parametreye sahip nesnelerde constructor veya setter karmaşasını önlemek
    //
    //Nesne oluştururken parametrelerin sırasına takılmadan alanları doldurabilmek
    //
    //Alanları kolayca bırakabilmek
    //
    //Kodun okunabilirliğini artırmak

}
