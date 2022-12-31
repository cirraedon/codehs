import java.util.*;

public class TicketOrganizer
{
    private ArrayList<AirlineTicket> tickets;
    
    private ArrayList<AirlineTicket> bg1 = new ArrayList<>();
    private ArrayList<AirlineTicket> bg2 = new ArrayList<>();
    private ArrayList<AirlineTicket> bg3 = new ArrayList<>();
    private ArrayList<AirlineTicket> bg4 = new ArrayList<>();
    private ArrayList<AirlineTicket> bg5 = new ArrayList<>();
    
    private ArrayList<AirlineTicket> arranged = new ArrayList<>();
    
    public TicketOrganizer(ArrayList<AirlineTicket> tickets) {
        this.tickets = tickets;
    }
    
    public ArrayList<AirlineTicket> getTickets() {
        return this.tickets;
    }
    
    private void arrange() {
        for (AirlineTicket ticket : tickets) {
            int bg = ticket.getBoardingGroup();
            
            switch (bg) {
                case 1: bg1.add(ticket);
                        break;
                case 2: bg2.add(ticket);
                        break;
                case 3: bg3.add(ticket);
                        break;
                case 4: bg4.add(ticket);
                        break;
                case 5: bg5.add(ticket);
                        break;
            }
        }
        
        for (AirlineTicket ticket : bg1) {
            arranged.add(ticket);
        }
        for (AirlineTicket ticket : bg2) {
            arranged.add(ticket);
        }
        for (AirlineTicket ticket : bg3) {
            arranged.add(ticket);
        }
        for (AirlineTicket ticket : bg4) {
            arranged.add(ticket);
        }
        for (AirlineTicket ticket : bg5) {
            arranged.add(ticket);
        }
    }
    
    public void printPassengersByBoardingGroup() {
        this.arrange();
        
        int start = 0;
        for (int i =1; i<=5; i++) {
            System.out.println("Boarding Group " + i + ":");
            for (int j =start; j < arranged.size(); j++) {
                if (arranged.get(j).getBoardingGroup() != i) {
                    start = j;
                    break;
                }
                System.out.println("Passenger " + (tickets.indexOf(arranged.get(j))+1));
            }
        }
    }
    
    public void canBoardTogether() {
        boolean b = true;
        for (int i = 1; i < tickets.size(); i++) {
            if (tickets.get(i).getBoardingGroup() == tickets.get(i-1).getBoardingGroup() && tickets.get(i).getRow() == tickets.get(i-1).getRow()) {
                System.out.println("Passenger "+(i)+" can board with Passenger " + (i+1));
                b = false;
            }
        }
        
        if (b) {
            System.out.println("There are no passengers with the same row and boarding group.");
        }
    }
    
}
