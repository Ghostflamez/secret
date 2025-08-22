package minemaze;
import java.util.Properties;

public class Driver {
    public static final String DEFAULT_PROPERTIES_PATH = "properties/game1.properties";

    public static void main(String[] args) {
        String propertiesPath = DEFAULT_PROPERTIES_PATH;
        if (args.length > 0) {
            propertiesPath = args[0];
        }
        final Properties properties = PropertiesLoader.loadPropertiesFile(propertiesPath);

        MapGrid grid = new MapGrid();

        MineMaze game = new MineMaze(properties, grid);
        String logResult = game.runApp(true);
        System.out.println("logResult = " + logResult);
        System.out.println("\nGame completed");
    }
}