package com.sha.springbootmicroservice1product.EncoderTest;


import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encode
{
    @Test
    public void generateEncodedPasswords()
    {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println("{bcrypt}" + passwordEncoder.encode("pass"));
    }
}
