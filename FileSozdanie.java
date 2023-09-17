import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSozdanie {
    public static void main(String[] args) throws IOException {
         Files.createFile(Path.of("D:\\Game of Brain\\progi\\Test.txt")); //создает файл,если 2 раз ошибка

        File folder = new File("D:\\Game of Brain\\progi");


       for (File file : folder.listFiles()) //возвращает список файлов в папке с именем
       {System.out.println(file.getName());   //список файлов в директории
                 }




    }
}
