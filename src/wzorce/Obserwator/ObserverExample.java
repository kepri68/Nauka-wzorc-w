package wzorce.Obserwator;

import java.util.Observable;
import java.util.Observer;

public class ObserverExample implements Observer {
    private ObservableDemo weatherUpdate;

    @Override
    public void update(Observable observable, Object arg) {
        weatherUpdate = (ObservableDemo) observable;
        System.out.println("Weather Report Live. Its " + weatherUpdate.getWeather());
    }

    public static void main(String[] args) {
        ObservableDemo observable = new ObservableDemo(null);
        ObserverExample observer = new ObserverExample();
        observable.addObserver(observer);
        observable.setWeather("Bright and sunny...Let's play cricket!! ");
        observable.setWeather("Raining Heavily!...Let's have hot Pakodas!!");

    }
}

