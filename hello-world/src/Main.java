public class Main {
    public static void main(String[] args) {
        MountainBike bike = new MountainBike(2,3,54);
        System.out.println(bike.toString());
        System.out.println("after we speed up");
        bike.speedUp(3);
        System.out.println(bike.toString());
        bike.applyBrake(6);
        String hjgghj = bike.setHeight(4);

        System.out.println(hjgghj);
    }
}
