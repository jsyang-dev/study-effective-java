package item01;

public class Settings {

    private static final Settings SETTINGS = new Settings();

    private boolean autoSteering;
    private boolean abs;

    private Settings() {
    }

    public static Settings getInstance() {
        return SETTINGS;
    }
}
