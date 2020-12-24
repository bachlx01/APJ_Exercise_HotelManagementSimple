public class Customers extends People{
    private int roomID;
    private int day =1;

    public Customers() {
    }

    public Customers(String name, int ID, int roomID) {
        super(name, ID);
        this.roomID = roomID;
    }

    //Getters


    public int getRoomID() {
        return roomID;
    }

    public int getDay() {
        return day;
    }

    // Setters

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "; ID: " + this.getID() + "; Room: " + this.roomID + "; Day: " + this.day + "\n";
    }
}
