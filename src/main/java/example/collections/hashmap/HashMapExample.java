package example.collections.hashmap;

import example.equals.and.hashcode.Dog;
import org.junit.jupiter.api.Assertions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample {


    public static void main(String[] args) {
        HashMap<String, Dog> stringDogHashMap = new HashMap<>();

        Dog byblik = new Dog("Бублик");
        Dog sharik = new Dog("Шарик");
        Dog spoyk = new Dog("Споук");

        String ivan = "Иван";
        String petr = "Петр";

        //добавление элемента. возвращает предыдущее value по ключу
        stringDogHashMap.put(ivan,byblik);
        stringDogHashMap.put(petr,sharik);
        stringDogHashMap.put(petr,spoyk);

        System.out.println(stringDogHashMap);

        //    Определение размера
        //    количество элементов
        System.out.println(stringDogHashMap.size());

        //проверка на пустоту

        Assertions.assertFalse(stringDogHashMap.isEmpty());

        //Проверки на вхождение

        // проверка вхождения по ключу
        Assertions.assertTrue(stringDogHashMap.containsKey("Иван"));

        // проверка вхождения по значению
        Assertions.assertFalse(stringDogHashMap.containsValue("Споук"));

        //Получение элементов
        //получение по ключу
        System.out.println(stringDogHashMap.get("Петр"));

        //получение множества всех значений
        Set<String> strings = stringDogHashMap.keySet();
        System.out.println(strings);

        //получение коллекции всех значений
        Collection<Dog> values = stringDogHashMap.values();
        System.out.println(values);

        //    Удаление элементов
        //одного одного элемента по ключу
        stringDogHashMap.remove("Иван");
        System.out.println(stringDogHashMap);

        //удаление всех элементов
        stringDogHashMap.clear();
        System.out.println(stringDogHashMap);


    }

}
