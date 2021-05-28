package Klassen;

public class Motor {

    private final int MAX_TOERENTAL = 5800;
    private int toerental;

    public void verhoogToerental(int x){
        do {
            toerental+=x;
        } while (toerental < MAX_TOERENTAL);
    }

    public int getToerental(){
        return toerental;
    }

    public void setToerental(int toerental){
        this.toerental=toerental;
    }

}
