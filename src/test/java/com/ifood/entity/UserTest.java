package com.ifood.entity;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.util.Calendar;

public class UserTest {

    @Test
    public void shouldAnswerWithTrue() {
        User user = new User();
        user.setName("Gabriel");
        user.setEmail("gabriel@example.com");
        user.setGender("M");
        user.setBirthDate(Calendar.getInstance());
        user.setPassword("123");
        assertTrue(user.getName() == "Gabriel");
    }
}
