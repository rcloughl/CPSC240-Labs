public class LoggerExample {
    public static void main(String args[]) {
        Logger log = Logger.getInstance();

        // turn off info and warning messages
        log.setInfo(null);
        log.setWarning(null);

        // test out some messages
        log.log(Logger.INFO, "this is a test");
        log.log(Logger.WARNING, "this might be a problem");
        log.log(Logger.ERROR, "error detected!");
    }
}
