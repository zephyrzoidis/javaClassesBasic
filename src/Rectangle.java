public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length * 2;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width * 2;
//    }

    public double getArea(){
        double area = length * width;
        return area;
    }

    public double getDiagonal(){
        double diagonal = Math.sqrt((length * length) + (width * width));
        return diagonal;
    }

    public boolean isSquare(){
        boolean current;
        if(length == width){
            current = true;
        }else{
            current = false;
        }
        return current;
    }

    public String printData() {
        return "This Rectangle: " +
                "width = " + width +
                ", length = '" + length + '\'' +
                ", area = " + getArea() +
                ", diagonal = '" + getDiagonal() + '\'' +
                ",  It is a square: '" + isSquare() + '\'' +
                '}';
    }

}
