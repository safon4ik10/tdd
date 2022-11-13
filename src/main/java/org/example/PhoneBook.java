package org.example;

import java.util.*;
import java.util.stream.Collectors;

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

    public String findByNumber(String number){
        return phoneBook.stream()
                .filter(pb -> pb.getNumber().equals(number))
                .map(PhoneBook::getName)
                .collect(Collectors.joining());
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
