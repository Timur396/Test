package com.example.demo;

import java.util.regex.Pattern;

public class User {
    //    Создайте проект и добавьте в него библиотеку JUnit.
//    Создайте класс UserTest и класс User с полями логин и email. Класс «User» нужно будет тестировать.
//    В классе UserTest пропишите следующие тесты:
//    Создайте тест, который выполнит тестирование создания объекта User с передачей в него двух параметров. Такая функция лишь должна проверять устанавливаются ли данные при создании объекта;
//    Создайте аналогичный тест, который выполнит тестирование по созданию объекта без передачи в него параметров;
//    Создайте тест, который протестирует установлен ли корректный Email адрес в поле email в классе User. Некорректным будет считаться тот email, в котором нет знака @ или же знака точки.
//    Создайте тест, который определяет, равны ли login и email (Они не должны быть равны).
    private String name;
    private String email;

    public User() {
    }

    public User(String name, String email) {
        this.name = createName(name);
        this.email = createEmail(email);
    }

    public String createName(String name) {
        if ((name != null && !name.isEmpty() && !name.isBlank() && Pattern.matches("[a-z A-Z 0-9]", name))) {
            return this.name = name;
        } else {

            return "Неккоректно введено имя";
        }
    }

    public String createEmail(String email) {
        if ((email != null && !email.isEmpty() && !email.isBlank() && Pattern.matches("[a-z A-Z0-9@.]", email))) {
            return this.email = email;
        } else
            return "Неккоректно введена почта";
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}