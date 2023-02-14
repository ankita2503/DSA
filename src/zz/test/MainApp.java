package zz.test;

public class MainApp {

    public static void main(String[] args) {
        CalculateService service = new CalculateService();
        Ticket ticket = new Ticket();
        ticket.setSource("Guindy");
        ticket.setDestination("Chennai Fort");
        ticket.setNoOfStops(8);
        int totalPrice = service.calculate(10,5,5,3);
        ticket.setTotalPrice(totalPrice);
        System.out.println(ticket.toString());
    }
}
