import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class ManageHotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hotel VIP = new Hotel("VIP");
        int choose = 0;

        while (choose !=9) {
            System.out.println("1. Add room to VIP Hotel");
            System.out.println("2. Check-in");
            System.out.println("3. Check-out");
            System.out.println("4. Check list of Customer");
            System.out.println("5. Check Status room");
            System.out.println("9. Exit");
            System.out.print("Enter your choose: ");
            choose = input.nextInt();

            switch (choose){
                case 1:
                    int flag = 1;
                    do {
                        System.out.print("Enter number of new room: ");
                        Room room = new Room(input.nextInt());
                        VIP.addRoom(room);
                        System.out.println("Do you want to continue? (1=Yes; 0 = No):  ");
                        flag = input.nextInt();
                    } while (flag == 1);
                    break;
                case 2:
                    Customers customer = createCustomer();
                    System.out.print("Enter ID of room: ");
                    int roomID = input.nextInt();
                    VIP.checkIn(roomID, customer);
                    break;
                case 3:
                    System.out.print("Enter the room to check out: ");
                    int checkOutRoom = input.nextInt();
                    System.out.println(VIP.checkOut(checkOutRoom));

                    break;
                case 4:
                    System.out.println(VIP.getListCustomerToString());;
                    break;
                case 5:
                    System.out.println(VIP.getStatusRoom());
                    break;
                case 9:
                    System.exit(0);
            }
        }

    }
    public static Customers createCustomer() {
        Scanner input = new Scanner(System.in);
        Customers customer = new Customers();
        System.out.print("Enter name of customer: ");
        customer.setName(input.next());
        System.out.print("Enter ID of customer: ");
        customer.setID(input.nextInt());
        return customer;
    }
}
