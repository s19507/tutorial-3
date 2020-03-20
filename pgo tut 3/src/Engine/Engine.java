package Engine;

public class Engine {
    private int Power;
    private int Production;
    public int getPower() {
        if (Power > 20000){
            System.out.println("ecological");
            return Power;
        } else {
            System.out.println("not ecological");

            return Power;
        }
    }
    public void setPower(int power) {
        Power = power;
    }

    public int getProduction() {
        if (Production > 2000) {
            System.out.println("proper production");
            return Production;
        } else {
            System.out.println(" not proper");
            return Production;
        }
    }
    public void setProduction(int production) {
        Production = production;
    }
}
