public class FJulPereopredMetod {
    public static void main(String[] args) {
        Animal catExtAnimal=new Cat(); // catExtAnimal расматривается как Animal, но метод переопределенный вызовется
        Cat cat=new Cat();

       // catExtAnimal.catSay();  метод catSay недоступен в классе родителе Animal
        catExtAnimal.say();  //переопределенный в потомке метод вызовется
        cat.say();           //переопределенный в потомке метод вызовется
        cat.catSay();

    }
    }
class Animal {
    public void say(){
        System.out.println(" Animal say"); }
}
 class Cat extends Animal{
    public void catSay(){
        System.out.println("tolko metod cat ");    }

    public void say(){
        System.out.println("Cat say");    }
}
