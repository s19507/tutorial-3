package com.company;

public class run {
    public run() {
    }
    public static void main(String[] args) {
        Telephone a1 = new Telephone("samsung", 21747009l, " 30 inch size");
        System.out.println(a1.telephoneinfo());
        System.out.println(a1.sendmessage());
        car b1 = new car("red", "BMW", 782);
        System.out.println(b1.carinfo());
        b1.setEnginecapacity(100);
    }
}
