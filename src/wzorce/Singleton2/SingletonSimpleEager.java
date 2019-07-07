package wzorce.Singleton2;

public class SingletonSimpleEager {

    //===================== //chętny ========================

    private static final SingletonSimpleEager instance = new SingletonSimpleEager();

    private SingletonSimpleEager() {
    }

    public static SingletonSimpleEager getInstance() {
        return instance;
    }

    //wywołanie chętny

    SingletonSimpleEager singleton = SingletonSimpleEager.getInstance();
}