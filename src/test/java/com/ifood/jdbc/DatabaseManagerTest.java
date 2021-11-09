package com.ifood.jdbc;

import java.sql.Connection;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DatabaseManagerTest {

    @Test
    public void shouldAnswerWithTrue() {
        Connection connection = DatabaseManager.getConnection();
        assertTrue(connection != null);

        System.out.println(connection);
    }
}
