package com.ecommerce.EcommerceBackend.Dto;

import com.ecommerce.EcommerceBackend.Enums.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String firstName;
    private String lastName;
    private String email;
    private Role role;
    private String password;
}
