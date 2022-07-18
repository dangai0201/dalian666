package test01;

public class Bus {

    private int speed;
    private int size;

    public Bus() {
    }

    public Bus(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



    public void move(){

    }

    public void speedUp(int addSpeed){
        int oldSpeed=this.getSpeed();
        this.setSpeed(oldSpeed+addSpeed);

    }



    public void speedDown(int subSpeed){
        int oldSpeed=this.getSpeed();
        this.setSpeed(oldSpeed+subSpeed);

    }


}
