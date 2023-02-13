package com.example.gather.account;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class SignUpForm {

    @NotBlank
    @Length(min = 5, max = 15)
    @Pattern(regexp = "^[ㄱ-ㅎ가-힣a-z0-9_-]{5,15}$")
    private String nickname;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Length(min = 6, max = 20)
    private String password;

}