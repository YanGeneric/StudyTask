import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EAStreamAPi {      //Stream APi
    public static void main(String[] args) {

        Arrays.asList(1, 2, 3).stream().forEach(System.out::println);// аналогично записанной ниже
        Stream.of(1, 2, 3).forEach(System.out::println);

        IntStream.of(120, 410, 85, 32, 314, 12)
                .filter(x -> x < 300) //отбирает элементы, значение которых меньше 300
                .map(x -> x + 11)     //прибавляет 11 к каждому числу,
                .limit(3)      //ограничивает количество элементов до 3
                .forEach(System.out::print);

        Stream.iterate(2, x -> x + 6) //бесконечный цикл итерации x+6
                .limit(6)
                .forEach(System.out::println);

        IntStream.range(0, 10)       //Создаёт стрим из числового промежутка 0,1,2,3,4..10 включительно
                .forEach(System.out::println);

        Stream.concat(
                        Stream.of(1, 2, 3),    //Объединяет два стрима:вначале идут элементы A,а по его окончанию  элементы  B
                        Stream.of(4, 5, 6))
                .forEach(System.out::println);

    // skip(long n)                      Пропускает n элементов стрима не выводит их
    // sorted(Comparator comparator)    Сортирует элементы стрима и возвращаем стрим с уникальными элементами
    // distinct()   Убирает повторяющиеся элементы и возвращаем стрим с уникальными элементами
    // takeWhile(Predicate predicate)  Возвращает элементы до тех пор, пока они удовлетворяют условию
    // boxed()       Преобразует примитивный стрим в объектный
        long count = IntStream.range(0, 10)      //long count() Возвращает количество элементов стрима
                .flatMap(x -> IntStream.range(0, x))
                .count();
        System.out.println(count);       //45 незнаю, почему  их столько

  // R collect(Collector collector)        Один из самых мощных операторов Stream API. С его помощью можно собрать
  // все элементы в список, множество или другую коллекцию, сгруппировать элементы по какому-нибудь критерию
  // объединить всё в строку
        String s = Stream.of(1, 2, 3)
                .map(String::valueOf)
                .collect(Collectors.joining("-", "<", ">")); //s: "<1-2-3>"


    }
    }
