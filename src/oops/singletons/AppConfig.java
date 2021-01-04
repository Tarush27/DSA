package oops.singletons;

public class AppConfig {

    private AppConfig(){

    }

    private static AppConfig obj = new AppConfig();

    public static  AppConfig getInstance()
    {
        return obj;
    }
}
