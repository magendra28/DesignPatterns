package singletonDesignPattern;

public class ConnectionPool {
//    step3: create a local variable
//    And this is Lazy Initialization ,if someone calls the method then only you create the object or else no
    private static ConnectionPool INSTANCE;
//    we can do eager initialization also no need to create any sync block while creating the objects that is
//    private static ConnectionPool INSTANCE = new ConnectionPool();
//    eager initialization is simple, but it is not possible to pass dynamic values,like if you want to pass anything (any variable to the constructor then it is not possible)
//    step1: Make the constructor as private also Constructor Hiding
    private ConnectionPool(){}

//    step2: Global Access Pointer create a static Method

    // version v2 code with synchronized
//   if we  make whole function as synchronized then it lock the function ait is too slow , so instead of making the function as synchronized make the condition as synchronized
//    public synchronized static ConnectionPool getInstance(){
    public static ConnectionPool getInstance(){
    // Version v1 without synchronized
//    public static ConnectionPool getInstance(){
//        step4: if Instance is not null then return it
//        step5: else create the instance store it and return it
//        version 1 and 2 code
//        if(INSTANCE == null){
//            INSTANCE = new ConnectionPool();
//        }
//        version 3 code ,making this as synchronized
        if(INSTANCE == null) {
            synchronized (ConnectionPool.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ConnectionPool();
                }
            }
        }
//        this version of code is not thread safe because if two threads call this piece of code then there going to two objects will be created
//        so if two objects are created then it is not a singleton and this if condition is also called CRITICAL Section
//        and if we want to make this func as thread safe then make that function as Synchronize
        return INSTANCE;
    }
}
