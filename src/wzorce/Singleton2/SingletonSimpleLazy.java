package wzorce.Singleton2;

public class SingletonSimpleLazy {

    //=================== leniwy ===========================

    private static SingletonSimpleLazy instance;

    private SingletonSimpleLazy() {
    }

    public static SingletonSimpleLazy getInstance() {
        if (instance == null) {
            instance = new SingletonSimpleLazy();
        }
        return instance;
    }

}
