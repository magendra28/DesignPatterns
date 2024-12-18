package singletonTest;

import org.junit.jupiter.api.Test;
import singletonDesignPattern.ConnectionPool;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class singletondesigntestfile {

    @Test
    public void testGetInstance(){
        ConnectionPool connectionPool1 = ConnectionPool.getInstance();
        ConnectionPool connectionPool2 = ConnectionPool.getInstance();

        assertEquals(connectionPool1,connectionPool2,"connectionPool should  be the same");
//        assertNotEquals(connectionPool1, connectionPool2, "connectionPool should not be the same");
    }
}
