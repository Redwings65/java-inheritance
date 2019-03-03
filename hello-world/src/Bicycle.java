public class Bicycle {

    public int gear;
    public int speed;

    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement){
        speed -=decrement;
    }

    public void speedUp(int increase){
        speed +=increase;
    }

    public String toString(){
        return "the current gear we are in is "+gear+" " +
                "and the current speed is "+speed;
    }
}
