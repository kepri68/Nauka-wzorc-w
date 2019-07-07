package wzorce.Singleton;

public class SingletonTest {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.name = "Janek";
        s2.name = "Loaf";

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}

