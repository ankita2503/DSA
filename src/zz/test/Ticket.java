package zz.test;

public class Ticket {

    String source;
    String destination;
    int NoOfStops;
    int totalPrice;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNoOfStops() {
        return NoOfStops;
    }

    public void setNoOfStops(int noOfStops) {
        NoOfStops = noOfStops;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", NoOfStops=" + NoOfStops +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
