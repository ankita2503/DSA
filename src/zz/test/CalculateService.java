package zz.test;

public class CalculateService implements CalculatePrice {

    @Override
    public int calculate(int basePrice, int extraPrice, int maxStationsInOne, int NoOfStationsCovered) {
        if((NoOfStationsCovered % maxStationsInOne)>0 && (NoOfStationsCovered / maxStationsInOne)>0){
            return basePrice*(NoOfStationsCovered / maxStationsInOne) + (extraPrice * 1);
        } else if((NoOfStationsCovered % maxStationsInOne)>0 && (NoOfStationsCovered / maxStationsInOne)==0){
            return basePrice;
        } else {
            return basePrice*(NoOfStationsCovered / maxStationsInOne);
        }

    }
}
