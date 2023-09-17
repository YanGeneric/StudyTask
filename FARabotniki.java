public class FARabotniki {         // создаем работниковб проверяем условия написания имени
    public static void main(String[] args) {   // проверка имени работает только в конструкторе
 Person person1 =new Person( 30,77,8,"Яша111","Иванов", "Иванович");
//person1.setName("Yan");
//person1.setCategory(7);
        person1.showInfo();

    }

   private    static  class Person{

         private    int age,weight,category;
           private String name,surname,patronymic;

            public int getWeight() { return weight; }

            public void setWeight(int weight) {  if(30< weight&&200>weight)  { this.weight = weight; }else System.out.println("Не коректный вес");  }

            public int getAge() {     return age;     }

            public void setAge(int age) { if(30< age&&130>age)  { this.age = age;  } else System.out.println("Не коректный возвраст");}

            public int getCategory() {  return category;   }

            public void setCategory(int category) {if(0<category&&6>category) {this.category = category;}else
                System.out.println("Некоректная категория");     }

            public String getName() {return name;  }

            public void setName(String name)  { if(isAlpha(name)) { this.name=name;}       else
              System.out.println("Не коректное имя");   }

            public String getSurname() {   return surname; }

            public void setSurname(String surname) {  this.surname = surname;  }

            public String getPatronymic() {  return patronymic;  }

            public void setPatronymic(String patronymic) {  this.patronymic = patronymic;}

            Person(int age,int weight,int category,String name,String surname,String patronymic){
                this.age =age;
                this.weight = weight;
                this.category = category;
                this.name = name;
                this.surname = surname;
                this.patronymic = patronymic;
            }
            public Person(){
               }

       public static  boolean isAlpha(String name) {
           char[] chars = name.toCharArray();    //создает из строки массив чаров
           for (char c : chars) {
               if(!Character.isLetter(c)) {
                   System.out.println("Не коректное имя");
                   return false;
               }
           }
           return true;
       }

      public void showInfo(){
           System.out.println("Имя - "+name+"\nФамилия - "+surname+"\nОтчество  - "+patronymic+"\nвозвраст - "+age+"\nвес - "
                   +weight+"\nкатегория - "+category);
       }

    }

}
