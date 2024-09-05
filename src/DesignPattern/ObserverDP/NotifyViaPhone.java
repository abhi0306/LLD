package DesignPattern.ObserverDP;

public class NotifyViaPhone implements IObserver {
    StockObservable stockObservable;
    public NotifyViaPhone(StockObservable stockObservable)
    {
        this.stockObservable=stockObservable;
    }
    @Override
    public void notifys() {
        System.out.println("NotifyViaPhone");
    }
}
