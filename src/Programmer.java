public class Programmer extends Dancer{
    private String Elevator;
    private int height;

    public Programmer(String name, String surName, int age, String color,String elevator, int height) {
        super(name, surName, age, color);
        this.Elevator = elevator;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "Elevator='" + Elevator + '\'' +
                ", height=" + height +
                "} " + super.toString();
    }
}
