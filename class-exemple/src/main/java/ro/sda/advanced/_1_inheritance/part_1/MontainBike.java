package ro.sda.advanced._1_inheritance.part_1;

public class MontainBike extends Bicycle {

    public int seatHeight;

    public MontainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void adjustSeatUp() {
        if (seatHeight < 5) {
            seatHeight++;
        } else {
            System.out.println("seat is already at maximum");
        }
    }

    public void adjsutSeatDown() {
        if (seatHeight > 0) {
            seatHeight--;
        } else {
            System.out.println("seat height is already at minimum");
        }
    }

}
