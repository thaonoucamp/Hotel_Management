package myPackage;

import java.util.ArrayList;

public class Room {
    private int roomType;
    private int price;
    ArrayList<Customer> listCustomer = new ArrayList<Customer>();

    public Room(int price, int roomType) {
        this.price = price;
        this.roomType = roomType;
    }

    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
