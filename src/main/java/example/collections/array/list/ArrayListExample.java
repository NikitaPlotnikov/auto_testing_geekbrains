package example.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        //Добавление одного элемента
        strings.add("Гаврик");
        strings.add("Пуся");
        strings.add("Бублик");
        strings.add("Шарик");
        strings.add("Саламон");

        List<String> stringsNew = new ArrayList<>();
        stringsNew.add("Гаврик");
        stringsNew.add("Пуся");


        //Удаление одного элемента
        strings.remove("Пуся");
        System.out.println(strings);

        //Определение размера
        //количество элементов
        System.out.println(strings.size());
        //проверка на пустоту
        System.out.println(strings.isEmpty());
        //Проверка на вхождение
        //Одного элемента
        System.out.println(strings.contains("Гаврик"));
        System.out.println(strings.contains("Сэм"));
        //Элементов коллекции
        System.out.println(strings.containsAll(stringsNew));

        //Добавление элементов коллекции
        strings.addAll(stringsNew);
        System.out.println(strings);


        //Удаление элементов коллекции
        strings.removeAll(stringsNew);
        System.out.println(strings);

        //копирует элементы коллекции в массив объектов
        String[] arr = new String[strings.size()];
        strings.toArray(arr);
        for (int i = 0; i < arr.length;i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        //удаляет из набора данных элементы,
        // не совпадающие с теми, которые содержатся в наборе.
        // Возвращает true, если в результате вызова метода
        // набор данных изменился.
        strings.retainAll(stringsNew);
        System.out.println(strings);

        //Удаление всех элементов
        strings.clear();
        System.out.println(strings);










    }
}
