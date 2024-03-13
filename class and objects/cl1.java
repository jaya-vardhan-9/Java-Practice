

class Car{
    /*Member variables (Properties) */
    String color;
    String model;
    int year;


    void accelerate() {
        System.out.println("The car is accelerating!");
      } 
}

public class cl1 {
    public static void main(String[] args) {

        Car mycar = new Car();

        mycar.color = "Red";
        mycar.model = "Sport";
        mycar.year = 2023;

        mycar.accelerate();

        
    }
}