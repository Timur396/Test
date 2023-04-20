package com.example.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private String CORRECT_NAME = "3";
    private String LOGIN_EQUALS_EMAIL = "Gogi@pochta.com";
    private String EMPTY_NAME = "";
    private String EMPTY_EMAIL = "";
    private String CORRECT_EMAIL = "Gogi@pochta.com";
    private String INCORRECT_EMAIL = "Gogi.pochta.com";
    private User u  = new User(CORRECT_NAME, CORRECT_EMAIL);

    static User user;

    @BeforeAll
    private static void initParams() {
        System.out.println("Start test");
    }

    @AfterAll
    private static void shouldDoAfterAll() {
        System.out.println("finish testing");
    }

    @Test
    void shouldCheckSetParametersByConstructor() {
        Assertions.assertEquals(CORRECT_NAME,u.getName());
        Assertions.assertEquals(CORRECT_EMAIL,u.getEmail());

    }

    @Test
    void shouldCheckCorrectEmail() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            new User(CORRECT_NAME, INCORRECT_EMAIL);
        });
    }

    @Test
    void shouldCheckEqualsBetweenLoginAndEmail() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            new User(LOGIN_EQUALS_EMAIL, CORRECT_EMAIL);
        });
    }

    @Test
    void shouldCheckSetWithoutParametersByConstructor() {
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            new User(EMPTY_NAME,EMPTY_EMAIL);
        });
    }
}