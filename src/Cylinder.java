public class Cylinder extends Circle {
    private double height = 2.5;

    public Cylinder(){

    }

    public Cylinder(String color, double radius, double height){
        super(color,radius);
        this.height = height;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public String toString(){
        return "Cylinder have: height = "
                + getHeight()
                + super.toString();
    }
}
