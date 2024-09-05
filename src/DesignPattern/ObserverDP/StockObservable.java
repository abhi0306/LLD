package DesignPattern.ObserverDP;

public interface StockObservable {
    public void add(IObserver observers);
    public void remove(IObserver observers);
    public void setData(int value);
    public int getData();
    public void notifys();

}
