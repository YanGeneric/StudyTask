public class FFGetSet {
    public static void main(String[] args) {
        Tip tip1 = new Tip();
        Tip tip2 = new Tip();
         tip1.setName("Tim");
         tip1.setAge(5);

        tip1.speak();

    }
}

class Tip {
    private String login;
    private int age;

    void speak() {
        System.out.println("Меня зовут " + login + "  и мне " + age);
    }
    public void setName(String username) {
       if( username.isEmpty()){
            System.out.println("Введено пустое имя ");
        }else{
            login = username;
        }
    }
    public String getName() {
        return login;
    }
    public void setAge(int userage) {
        age = userage;
    }
    public int getAge() {
        return age;
    }
}
