package com.company;

import java.util.Scanner;

public class Telephone {
    private String brand;
    private long phonenumber;
    private String screensize;
    Scanner in;

    public Telephone(String brand, long phonenumber, String screensize) {
        this.in = new Scanner(System.in);
        this.brand = brand;
        this.phonenumber = phonenumber;
        this.screensize = screensize;
    }

    public String telephoneinfo() {
        return "phone brand = " + this.brand + "\nphone number is = " + this.phonenumber + "\nscrenn size is =" + this.screensize;
    }

    public String sendmessage() {
        System.out.println(" enter phone number");
        long j = this.in.nextLong();
        System.out.println(" enter message");
        String text = this.in.nextLine();
        System.out.println("sending message " + text + " to " + j);
        return "thank you";
    }
}
}
