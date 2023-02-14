package zz.test;

import java.util.LinkedHashMap;

public class PrintTicketService implements PrintTicket{

    static LinkedHashMap<String, Integer> stations = new LinkedHashMap<>();

    public PrintTicketService() {
        stations.put("Chennai Beach", 1);
        stations.put("Chennai Fort", 2);
        stations.put("Chennai Park", 3);
        stations.put("Chennai Egmore", 4);
        stations.put("Chetpet", 5);
        stations.put("Nugmabakkam", 6);
        stations.put("Mambalam", 7);
        stations.put("Saidapet", 8);
        stations.put("Guidy", 9);
        stations.put("St. Thomas Mount", 10);
        stations.put("Pazhavanthangal", 11);
        stations.put("Meenambakkam", 12);
        stations.put("Trisulam", 13);
        stations.put("Pallavram", 14);
        stations.put("Chromepet", 15);
        stations.put("Tambaram Sanatorium", 16);
        stations.put("Tambaram", 17);
    }


    @Override
    public String print(Ticket ticket) {

        return ticket.toString();
    }
}
