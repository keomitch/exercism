public class LogLevels {
    
    public static String message(String logLine) {
        int endOfLevel = logLine.indexOf("]");
        String sliced = logLine.substring(endOfLevel + 2); // after the ":" of the LEVEL
        return sliced.trim();
    }

    public static String logLevel(String logLine) {
        int endOfLevel = logLine.indexOf("]");
        String sliced = logLine.substring(1, endOfLevel);
        return sliced.toLowerCase().trim();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
