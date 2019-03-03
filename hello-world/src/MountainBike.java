public class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }
    public String setHeight(int newHeight){
        seatHeight = newHeight;
        return "jkfldkjsalk";
    }

    public String toString(){
        return super.toString()+" and the seat height is "+seatHeight;
    }
}
