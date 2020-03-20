public class Airplane {
    int Numberofseats;
    int Power;
    int ProductionYear;
    String brand;

    // Production and Power are in different package
    public int getNumberofseats() {
        if (Numberofseats > 2000)
            return Numberofseats;
        return 0;
    }

    public void setNumberofseats(int numberofseats) {
        this.Numberofseats = numberofseats;
    }
    public String getBrand() {
        return brand;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }

    public int getProductionYear() {
        return ProductionYear;
    }

    public void setProductionYear(int productionYear) {
        ProductionYear = productionYear;
    }
}