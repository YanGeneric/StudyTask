 class DrumKit {
            boolean topHat = true;
            boolean snare = true;
            void playTopHat () {
            System.out.println(" динь динь динь");
        }
        void playSnare () {
            System.out.println(" бах бах бах");
        }}
 class DrumKitTestDrive {   //если метод майн поставить пред классом DruKit прога не работает , почему...?
                public static void main(String[] args) {     //паблик класса нет и имя
                     DrumKit d = new DrumKit();             //исходника несовпадает с именем класса

                    d.playSnare();
                    d.snare = false;
                    d.playTopHat();

                    if (d.snare == true) {
                        d.playSnare();
                    }}
            }



