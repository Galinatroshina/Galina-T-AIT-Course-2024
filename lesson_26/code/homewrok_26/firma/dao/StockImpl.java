package homewrok_26.firma.dao;


import homewrok_26.firma.model.Detail;


public class StockImpl implements Stock {

    private Detail[] details;
    //capacity
    public StockImpl(int capacity){
        this.details = new Detail[capacity];

    }


    @Override
    public boolean addDetail(Detail detail) {
        return false;
    }

    @Override
    public Detail findDetail(long barCode) {
        return null;
    }

    @Override
    public Detail updateDetail(Detail detail) {
        return null;
    }

    @Override
    public boolean removeDetail(Detail detail) {
        return true;
    }

    @Override
    public double totalWeight() {
        return 0;
    }

    @Override
    public double middleWeight() {
        return 0;
    }

    @Override
    public Detail[] findTotalWeightOfDetails(double weight) {
        return new Detail[0];
    }
}
