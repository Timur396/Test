package com.example.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private String CORRECT_NAME = "Gogi";
    private String INCORRECT_NAME = "4";
    private String LOGIN_EQUALS_EMAIL = "Gogi@pochta.com";
    private String EMPTY_NAME = "";
    private String EMPTY_EMAIL = "";
    private String CORRECT_EMAIL = "Gogi@pochta.com";
    private String INCORRECT_EMAIL = "Gogi.pochta.com";
    private User u = new User(CORRECT_NAME, CORRECT_EMAIL);

    @BeforeAll
    private static void initParams() {
        System.out.println("Start test");
    }

    @AfterAll
    private static void shouldDoAfterAll() {
        System.out.println("finish testing");
    }

    @Test
    void shouldGenerateCorrectUser() {
        User user = new User(CORRECT_NAME, CORRECT_EMAIL);
        assertFalse(user.getName().isEmpty());
        assertFalse(user.getEmail().isEmpty());
    }

    @Test
    void checkingEmail() {
        User incorrectUserEmail = new User(CORRECT_NAME, INCORRECT_EMAIL);
        assertFalse(incorrectUserEmail.getEmail().matches("\\w+@\\w+\\.\\w+"));
    }

    @Test
    void shouldGenerateIncorrectUser() {
        User user = new User(CORRECT_NAME, INCORRECT_EMAIL);
        assertFalse(user.getEmail().isEmpty());
    }

}

