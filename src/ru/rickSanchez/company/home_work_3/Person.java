package ru.rickSanchez.company.home_work_3;

import java.util.Set;

public class Person {
    private String lastName;
    private String phone;
    private String e_mail;

    public Person(String lastName, String phone, String e_mail) {
        this.lastName = lastName;
        this.phone = phone;
        this.e_mail = e_mail;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getE_mail() {
        return e_mail;
    }
}
