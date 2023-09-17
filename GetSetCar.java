public class GetSetCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMark(" Toyta ");
        car.setFuel(92);
        car.setSitmest(6);
        car.setColor("Серебристая");
        car.setMileage(143000);
        car.infoCar();
            }
}

class Car{
       private String color ;
        private   String mark ;
        private  int fuel;
        private  int sitmest;
        private  double mileage ;



    public void setMark(String markName){
    mark=markName;}    //привравниваем поле класса(mark) к значениям ,к-ое пришло в параметрах(String mark)
public String getMark(){ return mark;}

public void  setFuel(int fuelName){fuel=fuelName; }
public int getFuel(){ return fuel; }

public void setSitmest(int sitmestName) {

        if (sitmestName>8){
        System.out.println("avtobus");
    }
    else{
        sitmest = sitmestName;
    }}

public int getSitmest() {return sitmest; }

public void setMileage(double mileageName) {
        double a =1.6;

        mileage = mileageName*a; }
public double setMileage() {return mileage; }

    public void setColor(String colorName) {color = colorName; }
    public String getColor() {return color; }


    void infoCar(){
          System.out.println(color+" "+mark+" "+fuel+" бензин "+" "+sitmest+" мест"+" "+"пробег "+mileage+"km");
      }



}

