package Klassen;

public class Auto {

    private String merknaam;
    private String nummerplaat;
    Motor motor1 = new Motor();


    public Auto (String merknaam, String nummerplaat){
    this.merknaam=merknaam;
    this.nummerplaat=nummerplaat;
    }

    public Auto (String merknaam){
        this.merknaam=merknaam;
    }

    public Auto (Auto auto){
        this(auto.merknaam, auto.nummerplaat);
    }

    public void geefGas(){

        motor1.setToerental(motor1.getToerental()+200);
    }

    public void geefGas(int x){
        motor1.setToerental(motor1.getToerental()+x);
    }

    public void rem(){
        motor1.setToerental(0);
    }

    public void toonToerental(){
        System.out.println(motor1.getToerental());
    }

    public String toString(Auto auto){
        return auto.merknaam + " met nummerplaat " + auto.nummerplaat;
    }
}
