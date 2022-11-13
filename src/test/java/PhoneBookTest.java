import org.example.PhoneBook;
import org.junit.Test;

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
        boolean result = phoneBook.findByName(name);
        assertTrue(result == true);
    }
}
