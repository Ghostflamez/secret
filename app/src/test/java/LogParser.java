public class LogParser {
    public String getLogLine(String logResult, int movementIndex) {
        String[]logs = logResult.split("\n");
        return logs[movementIndex];
    }
}
