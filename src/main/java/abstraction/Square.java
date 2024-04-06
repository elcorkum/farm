package abstraction;

public class Square extends Shape{
    private double dimension;

    public double getDimension() {
        return this.dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public Square(double dimension){
        this.dimension = dimension;
    }
    @Override
    public double calculateArea() {
        return this.dimension * this.dimension;
    }
}
