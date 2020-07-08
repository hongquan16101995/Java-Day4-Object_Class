package Fan;

public class TestFan {
    public static void main(String[] args) {
        int SLOW = 1;
        int MEDIUM = 2;
        int FAST = 3;

        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);

        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setStatus(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
