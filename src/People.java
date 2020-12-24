public class People {
    private String name;
    private int age;
    private boolean isMan;
    private int ID;

    public People() {
    }

    public People(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    // getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMan() {
        return isMan;
    }

    public int getID() {
        return ID;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMan(boolean man) {
        isMan = man;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "; ID: " + this.ID;
    }
}
