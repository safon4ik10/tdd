package org.example;

import java.util.*;

public class PhoneBook {
    private static final Set<PhoneBook> phoneBook = new TreeSet<>(Comparator.comparing(PhoneBook::getName));

    private String name;
    private String number;

    public PhoneBook() {
    }

    public PhoneBook(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public int add(String name, String number){
        phoneBook.add(new PhoneBook(name, number));
        return phoneBook.size();
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
