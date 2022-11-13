import org.example.PhoneBook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PhoneBookTest {


    @Test
    public void testAdd(){
        PhoneBook phoneBook = new PhoneBook();
        String name = "Vasya";
        String phone = "+799999999";
        int result = phoneBook.add(name, phone);
        assertEquals(1, result);
    }

    @Test
    public void testFindByNumber(){
        PhoneBook phoneBook = new PhoneBook();
        String number = "123";
        String result = phoneBook.findByNumber(number);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testFindByName(){
        PhoneBook phoneBook = new PhoneBook();
        String name = "Vasya";
        String result = phoneBook.findByName(name);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testPrintAllNames(){
        PrintStream original = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream tps = new PrintStream(baos);
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vasya", "123");
        System.setOut(tps);
        phoneBook.printAllNames();
        System.setOut(original);
        tps.flush();
        assertEquals("Vasya", baos.toString().trim());
    }
}
