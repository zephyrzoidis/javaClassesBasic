public class Car {
    private int year;
    private String make;
    private int miles;
    private String model;


    public Car(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.miles = 0;
        this.model = model;
    }

//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public String getMake() {
//        return make;
//    }
//
//    public void setMake(String make) {
//        this.make = make;
//    }
//
//    public int getMiles() {
//        return miles;
//    }
//
//    public String getModel(){
//        return model;
//    }
//
//    public void setModel(String model){
//        this.model = model;
//    }

    public void setMiles(int miles) {
        this.miles = miles;
    }




    @Override
    public String toString() {
        return "This Car is a: " +
                "year =" + year +
                ", make ='" + make + '\'' +
                ", miles =" + miles +
                ", model ='" + model + '\'' +
                '}';
    }
}
