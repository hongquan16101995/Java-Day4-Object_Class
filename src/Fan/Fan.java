package Fan;

public class Fan {
    private int Speed = 1;
    private boolean Status = false;
    private double Radius = 5;
    private String Color = "blue";

    public Fan(){

    }

    public int getSpeed(){
        return Speed;
    }

    public boolean getStatus(){
        return Status;
    }

    public  double getRadius(){
        return Radius;
    }

    public  String getColor(){
        return  Color;
    }

    public void setSpeed(int speed){
        Speed = speed;
    }

    public void setStatus(boolean status){
        Status = status;
    }

    public void setRadius(double radius){
        Radius = radius;
    }

    public void setColor(String color){
        Color = color;
    }

    public String toString(){
        if(this.getStatus() == true){
            return "Fan is on: " + " Speed: " + this.getSpeed() + ", Color: " + this.getColor() + ", Radius: " + this.getRadius();
        }else {
            return "Fan is off: " + " Color: " + this.getColor() + ", Radius: " + this.getRadius();
        }
    }
}
