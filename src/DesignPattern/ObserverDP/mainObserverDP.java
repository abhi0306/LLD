package DesignPattern.ObserverDP;

public class mainObserverDP {
    public static void main(String[] args) {
        StockObservable observable = new ConcereteObservable();
        IObserver o1 = new NotifyViaEmail(observable);
        IObserver o2 = new NotifyViaPhone(observable);
        observable.add(o1);
        observable.add(o2);
        observable.setData(5);
    }
}
