package main;
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Logging from logger1");
        logger2.log("Logging from logger2");

        if (logger1 == logger2) {
            System.out.println("Singleton works: Only one Logger instance.");
        }
    }
}
