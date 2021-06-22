package lad2BT.ex2;

public class Temperature {
    private double ctemp;

    public Temperature(double ctemp){
        this.ctemp = 25;
    }
    public Temperature(){
    }
    public double getCtemp(){
        return ctemp;
    }
    public void setCtemp(double ctemp){
        this.ctemp = ctemp;
    }

    private double fahrenheit;
    private double kenvil;

    public double getFahrenheit(){
        return (ctemp + 273);
    }
    public double getKenvil(){
        return (ctemp * 18 / 10+32);
    }
}
