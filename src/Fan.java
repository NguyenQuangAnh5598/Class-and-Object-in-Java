public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = this.SLOW;
    private boolean status = false;
    private double radius =5;
    private String color = "blue";

    public boolean isStatus() {
        return status;
    }
    public int getSpeed() {
        return speed;
    }
    public String getColor() {
        return color;
    }
    public double getRadius() {
        return radius;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public Fan() {
    }
    public String toString() {
        if (this.status) {
            return "Speed: " + this.speed + " ,color: " + this.color + " ,radius: " + this.radius + " Fan is on";
        } else {
            return "color: " + this.color + " ,radius: " + this.radius + " Fan is off";
        }
    }
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("Green");
        fan1.setStatus(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        System.out.println("fan1 is " + fan1.toString());
        System.out.println("fan2 is " + fan2.toString());
    }
}
