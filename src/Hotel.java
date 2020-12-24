import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel {
    private String name;
    private HashMap<Integer, Room> listRoom = new HashMap<>();
    private List listCustomers = new ArrayList<Customers>();
    private int totalRoom = 0;

    public Hotel(String name) {
        this.name = name;
    }

    // Getters


    public String getStatusRoom() {
        String stringRoom = "";
        for (int key: listRoom.keySet()) {
            stringRoom += listRoom.get(key).toString();
        }
        return stringRoom;
    }


    public String getName() {
        return name;
    }

    public int getTotalRoom() {
        return totalRoom;
    }

    // Setters


    public void setName(String name) {
        this.name = name;
    }

    // Methods

    public void addRoom (Room room){
        this.listRoom.put(room.getRoomID(), room);
        this.totalRoom++;
    }

    public void deleteRoom (Room room) {
        if (this.listRoom.containsValue(room)){
            this.listRoom.remove(room.getRoomID());
        } else {
            System.out.println("There is not this room, check and do it again");
        }
    }

    public void checkIn(int roomID, Customers customer) {
        listRoom.get(roomID).checkIn(customer);
        this.listCustomers.add(customer);
        customer.setRoomID(roomID);
    }

    public Double checkOut(int room) {
        double amount = this.listRoom.get(room).getPrice() * this.listRoom.get(room).getDay();
        this.listRoom.get(room).checkOut();
        this.listCustomers.remove(this.listRoom.get(room).getListCustomer()[0]);
        this.listCustomers.remove(this.listRoom.get(room).getListCustomer()[1]);
        this.listCustomers.remove(this.listRoom.get(room).getListCustomer()[2]);
        return amount;
    }

    public String getListCustomerToString() {
        String listString = "";
        for (int i = 0; i < this.listCustomers.size(); i++) {
            listString += this.listCustomers.get(i).toString();
        }
        return listString;
    }
}
