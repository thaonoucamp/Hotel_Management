package myPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    Scanner sc = new Scanner(System.in);

    static Room[] rooms = new Room[3];

    static {
        rooms[0] = new Room(1, 1000);
        rooms[1] = new Room(2, 2000);
        rooms[2] = new Room(3, 3000);
    }

    public void choiceRoom() {
        System.out.println("Moi chon phong: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hay nhan chia khoa phong 1 !");
                break;
            case 2:
                System.out.println("Hay nhan chia khoa phong 2 !");
                break;
            case 3:
                System.out.println("Hay nhan chia khoa phong 3 !");
                break;
        }
    }


    public void addCustomer() {
        System.out.println("Nhap ten khach hang: ");
        String name = sc.nextLine();

        System.out.println("Nhap id: ");
        int id = Integer.parseInt(sc.nextLine());

        Customer customer = new Customer(name, id);

        Room room = selectRoom();
        room.listCustomer.add(customer);
    }

    public void showCustomer() {
        System.out.println("Name: ");
    }

    public void deleteCustomer() {

    }

    public void editCustomer() {

    }

    public double totalPrice() {
        return totalPrice();
    }

    public Room selectRoom() {
        try {
            System.out.println("Chon loai phong: ");
            System.out.println("1. Binh dan - 1000");
            System.out.println("2. VIP - 2000");
            System.out.println("3. Luxury - 3000");

            int roomType = Integer.parseInt(sc.nextLine());
            switch (roomType) {
                case 1:
                    return rooms[0];
                case 2:
                    return rooms[1];
                case 3:
                    return rooms[2];
            }
        } catch (Exception e) {
            System.out.println("Chon lai :");
            selectRoom();
        }
        return null;
    }

    public void printRooms() {
        System.out.println("Room list");
        for (Room room : rooms) {
            System.out.println("-----");
            System.out.println("Room: " + room.getRoomType());

            for (Customer customer : room.listCustomer) {
                System.out.println("Name: " + customer.getName());
                System.out.println("ID: " + customer.getId());
                System.out.println("-----");
            }
        }
    }

}
