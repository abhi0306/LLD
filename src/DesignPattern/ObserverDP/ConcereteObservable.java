package DesignPattern.ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class ConcereteObservable implements StockObservable{
    List<IObserver> iObservers = new ArrayList<>();
    int data;
    @Override
    public void add(IObserver observers) {
        iObservers.add(observers);
    }

    @Override
    public void remove(IObserver observers) {
       iObservers.remove(observers);
    }

    @Override
    public void setData(int value) {
       this.data=value;
       notifys();
    }

    @Override
    public int getData() {
       return data;
    }

    @Override
    public void notifys() {
        for(IObserver iObserver:iObservers)
       iObserver.notifys();
    }
    
}
