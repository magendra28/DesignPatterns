package BuilderDesignPattern;

public class Database {
    private String name;
    private String username;
    private String password;
    private Integer port;
    private DatabaseType type;
    private Boolean isCompressed;

    private Database(){}

//    Trick 1: Builder Method
    public static Builder builder(){
        return new Builder();
    }

//    step1: Create an inner static class

    public static class Builder{
//        step2: copy all the fields from the outer class
        private String name;
        private String username;
        private String password;
        private Integer port;
        private DatabaseType type;
        private Boolean isCompressed;

//        step3: create setter for the builder class
//        Fluent Interface : instead of creating the setters , create setters a type Builder

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = port;
            return this;
        }

        public Builder setType(DatabaseType type) {
            this.type = type;
            return this;
        }

        public Builder setCompressed(Boolean compressed) {
            isCompressed = compressed;
            return this;
        }

//        step4: return a Database Object to outer class
        public Database build(){
            Database database = new Database();
            database.name = name;
            database.username = username;
            database.password = password;
            database.port = port;
            database.type = type;
            database.isCompressed = isCompressed;
            return database;
        }


//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public void setUsername(String username) {
//            this.username = username;
//        }
//
//        public void setPassword(String password) {
//            this.password = password;
//        }
//
//        public void setPort(Integer port) {
//            this.port = port;
//        }
//
//        public void setType(DatabaseType type) {
//            this.type = type;
//        }
//
//        public void setCompressed(Boolean compressed) {
//            isCompressed = compressed;
//        }
    }

}
