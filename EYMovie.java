
  class EYMovie {
   public static void main(String[] args) {
     EYTestMovie one = new EYTestMovie();
     one.name = "Как Прогореть на Акциях";
     one.genre = "Трагедия";
     one.rating = -2;
     EYTestMovie two = new EYTestMovie();
     two.name = "Потерянные в Офисе";
     two.genre = "Комедия";
     two.rating = 5 ;
     two.playIt();
     EYTestMovie three = new EYTestMovie();
     three.name = "Байт-Клуб";
     three.genre = "Трагедия, но в целом веселая";
     three.rating = 127;
   }
 }
  class EYTestMovie {
    String name;
    String genre;
    int rating;
    void playIt(){
      System.out.println("Проигрывание фильма "+name+" "+genre+  " рейтинг "+rating);
    };
}
