import java.util.*;   //сортировка по возврасту и по имени +
                    // надо дописать допустимые значения возвраста имени(без символов только буквы)
public class TMSortDvaOsnov {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(
                 new Student("Homer", 39),   // тут "," вместо ";"
                 new Student("Liza", 11),
                 new Student("Bart", 12),
                 new Student("Marge", 38)
        ));
         Collections.sort(students, new Comparator<Student>() {
             public int compare(Student s1, Student s2) {
                 if (s1.getAge() != s2.getAge()) {
                     return s1.getAge() - s2.getAge();
                 }
                 return s1.getName().compareTo(s2.getName());
             }
         });
        System.out.println(students);
        }
    }
     class Student {
        private String name;
        private  int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public  int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String toString(){
            return name+" "+ age;
        }
    }


