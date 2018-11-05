public class Circle {
    private String color = "yellow";
    private double radius = 0.5;

    public Circle(){
    }

    public Circle(String color, double radius){
        this.color=color;
        this.radius = radius;

    }
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public double getArea(){
        return Math.sqrt(radius)*Math.PI;
    }

    @Override
    public String toString(){
        return "Color: "+ getColor()
                + " Radius: "+getRadius()
                + " Perimeter: " + getPerimeter()
                + " Area: " + getArea();
    }
}
