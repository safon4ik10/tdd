import org.example.PhoneBook;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PhoneBookTest {

    @Test
    public void testAdd(){
        PhoneBook phoneBook = new PhoneBook();
        String name = "Vasya";
        String phone = "+799999999";
        int result = phoneBook.add(name, phone);
        assertTrue(result == 1);
    }

    @Test
    public void testFindByNumber(){
        PhoneBook phoneBook = new PhoneBook();
        String number = "123";
        boolean result = phoneBook.findByNumber(number);
        assertTrue(result == true);
    }
}
