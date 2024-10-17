package homewrok_26.firma.dao;


import homewrok_26.firma.model.Detail;

public interface Stock {

    boolean addDetail(Detail detail);

    Detail findDetail (long barCode);

    Detail updateDetail (Detail detail);

    boolean removeDetail (Detail detail);

    double totalWeight ();

    double middleWeight ();

    Detail[] findTotalWeightOfDetails (double weight);


}
