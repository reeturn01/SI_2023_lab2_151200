import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SILab2Test {

    @Test
    void every_branch_test(){
        User user = null;
        Throwable exception = Assertions.assertThrows(RuntimeException.class, () -> SILab2.function(null, null));
        Assertions.assertEquals("Mandatory information missing!", exception.getMessage());

        user = new User(null, "test.test@mail.com", "test.test@mail.com");
        List<User> allUsers = new ArrayList<>();
        allUsers.add(new User("test.test@mail.com", "sdfjfsd", "test.test@mail.com"));
        allUsers.add(new User("a", "a", "a.@mail.com"));
        Assertions.assertFalse(SILab2.function(user, allUsers));

        user = new User("hello", "1!3456789", "test@mail.com");
        allUsers = new ArrayList<>();
        Assertions.assertTrue(SILab2.function(user, allUsers));

        user = new User("hello", "1!3456789", "test@mail.com");
        allUsers = new ArrayList<>();
        Assertions.assertTrue(SILab2.function(user, allUsers));

        user = new User("hello", "1 3456789", "test@mail.com");
        allUsers = new ArrayList<>();
        Assertions.assertFalse(SILab2.function(user, allUsers));

    }

    @Test
    void multiple_conditions_test(){
        final User user = null;
        Throwable exception = Assertions.assertThrows(RuntimeException.class, ()->SILab2.function(user, null));
        Assertions.assertEquals("Mandatory information missing!", exception.getMessage());

        final User user1 = new User("", null, null);
        exception = Assertions.assertThrows(RuntimeException.class, () -> SILab2.function(user1, null));
        Assertions.assertEquals("Mandatory information missing!", exception.getMessage());

        final User user2 = new User("", "123", null);
        exception = Assertions.assertThrows(RuntimeException.class, () -> SILab2.function(user2, null));
        Assertions.assertEquals("Mandatory information missing!", exception.getMessage());

        final User user3 = new User("", "123", "test@mail.com");
        Assertions.assertDoesNotThrow(() -> SILab2.function(user3, new ArrayList<>()));
    }
}
