import java.io.File;

public class SJFileMusicRename {
    public static void main(String[] args) {
        File []filesList;
        File source=new File("d:/MusicMix/");
        filesList = source.listFiles(); // записываем файлы из папки в массив объектов типа File
for (int i=0;i< filesList.length;i++) {
    String buf = filesList[i].getName(); // читаем текущее имя файла

    if (buf.contains("()")) {  // если заканчивается на .txt, то меняем на .java
        buf = buf.replace("()", "");
        //replaceAll заменяет все вхождения
        filesList[i].renameTo(new File("d:/MusicMix/" + buf));
   }


//    for (File file : source.listFiles()) {  //listFiles - метод, который возвращает список файлов в папке с именем
//        System.out.println(file.getAbsolutePath());  //может возвращать String  или обьект File
        // long lenght() -Возвращает размер/длину файла в байтах


    }
}
}


