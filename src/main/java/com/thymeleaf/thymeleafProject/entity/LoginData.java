package com.thymeleaf.thymeleafProject.entity;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class LoginData {
    @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
    private String emailAddress;
    @Pattern(regexp =  "^(?=.*[0-9]).{8,15}$",message = "Password Must Be Strong")
    @NotBlank(message = "Password can not be Blank")
    @Size(min = 5,max = 30,message = "Password must be between 5-30 character")
    private String password;
    @AssertTrue(message = "Must Be Agree T&C")
    @NotNull(message =  "Must Be Agree T&C")
    private Boolean agreement;
}
