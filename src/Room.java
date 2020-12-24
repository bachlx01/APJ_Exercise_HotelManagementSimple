public class Room {
    private int roomID;
    private String type = "normal";
    private double price = 500000.0;
    private boolean isEmpty = true;
    private Customers[] listCustomer = new Customers[3];
    private int day = 0;


    public Room(int roomID) {
        this.roomID = roomID;
    }

    // Getters

    public int getRoomID() {
        return roomID;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public Customers[] getListCustomer() {
        return listCustomer;
    }

    public int getDay() {
        return day;
    }

    // Setters

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Methods

    public void checkIn(Customers customer) {
        for (Customers e :
                listCustomer) {
            if (e == null) {
                e = customer;
            }
        }
        this.isEmpty = false;
        this.day = 1;
    }

    public void checkOut(){
        this.listCustomer = new Customers[3];
        this.isEmpty = true;
        this.day = 0;
    }

    @Override
    public String toString() {
        return "ID: " + this.roomID + "; Status: " + (this.isEmpty?"Empty":"Full") + "\n";
    }
}
