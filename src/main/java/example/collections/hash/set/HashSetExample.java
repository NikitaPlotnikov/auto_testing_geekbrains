package example.collections.hash.set;

import org.junit.jupiter.api.Assertions;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();

        //добавляет элемент, если же такой элемент уже присутствует, то возвращает false
        strings.add("Гаврик");
        strings.add("Пуся");
        strings.add("Бублик");
        strings.add("Шарик");
        strings.add("Саламон");
        Assertions.assertFalse(strings.add("Саламон"));

        HashSet<String> stringsNew = new HashSet<>();
        stringsNew.add("Гавр");
        stringsNew.add("Пусик");

        //добавляет все элементы коллекции
        strings.addAll(stringsNew);
        System.out.println(strings);

        //возвращает размер
        System.out.println(strings.size());

        //возвращает true, если данный элемент присутствует в множестве.
        Assertions.assertTrue(strings.contains("Гавр"));

        //удаляет данный элемент из множества, если таковой присутствует
        strings.remove("Пусик");

        //удаляет все элементы коллекции из множества, если таковые есть
        strings.removeAll(stringsNew);
        System.out.println(strings);

        //возвращает true, если в множестве нет элементов.
        Assertions.assertFalse(strings.isEmpty());
        
    }
}
