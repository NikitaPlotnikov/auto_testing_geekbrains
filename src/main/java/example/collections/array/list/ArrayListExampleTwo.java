package example.collections.array.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExampleTwo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Гаврик");
        strings.add("Пуся");
        strings.add("Бублик");
        strings.add("Шарик");
        strings.add("Саламон");
        strings.add("Пуся");
        strings.add("Пуся");
        strings.add("Пуся");

        //фиксированный размер массива
        strings.ensureCapacity(400);

        //удаляет не занятые ячейки
        strings.trimToSize();

        //получение индекса элемента по объекту
        System.out.println(strings.indexOf("Пуся"));
        System.out.println(strings);

        //замена элемента (по индексу)
        strings.set(2,"Круглик");
        System.out.println(strings);

        //проверяем сколько раз одинаковый объект добавлен в лист-
        System.out.println(Collections.frequency(strings,"Пуся"));

        //Collections.sort() - сортировка-
        Collections.sort(strings);
        System.out.println(strings);

        //Методы интерфейса Iterator
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String dog =iterator.next();
            System.out.println(dog);
        }
        iterator.remove();
        System.out.println(strings);



    }
}
