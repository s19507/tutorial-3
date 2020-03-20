package com.company;

public class car {
    private String color;
    private String brand;
    private int enginecapacity;

    public Car(String color, String brand, int enginecapacity) {
        this.color = color;
        this.brand = brand;
        this.enginecapacity = enginecapacity;
    }

    public String carinfo() {
        String var10000 = this.color;
        return "car color is =" + var10000 + "\ncar brand is = " + this.brand + "\n" + this.getEnginecapacity();
    }

    public int getEnginecapacity() {
        if (this.enginecapacity >= 21) {
            System.out.println("car is high speed");
            return this.enginecapacity;
        } else {
            System.out.println("car is high speed");
            return this.enginecapacity;
        }
    }

    public void setEnginecapacity(int enginecapacity) {
        this.enginecapacity = enginecapacity;
    }
}
}
