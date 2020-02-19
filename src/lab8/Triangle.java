package lab8;

public class Triangle extends GraphicObject{
    private double base;
    private double high;
    @Override
    public void findArea() {
        double area = 0.5 * base * high;
        System.out.println("The are of Triangle :"+area);
    }

    //getter and setter

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
