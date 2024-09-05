package DesignPattern.ObserverDP;

public class NotifyViaEmail implements IObserver{
    StockObservable stockObservable;
    public NotifyViaEmail(StockObservable stockObservable)
    {
        this.stockObservable=stockObservable;
    }
    @Override
    public void notifys() {
        System.out.println("NotifyViaEmail");
    }
    
}
