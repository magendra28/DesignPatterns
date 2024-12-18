package builderdesignTest;

import BuilderDesignPattern.Database;
import BuilderDesignPattern.DatabaseType;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    @Test
    public void databaseTest(){
        Database database = Database.builder()
                .setName("hello")
                .setUsername("root")
                .setPassword("pass")
                .setPort(8080)
                .setCompressed(true)
                .setType(DatabaseType.POSTGRESQL)
                .build();
    }
}
