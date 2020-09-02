package example.home.work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
//    Написать простой класс Телефонный Справочник,
//    который хранит список фамилий и телефонных номеров.
//    В него с помощью метода add() можно добавлять записи,
//    а с помощью get() — искать номер телефона по фамилии.
//    Для одной фамилии может быть несколько телефонов (однофамильцы):
//    тогда при запросе такой фамилии должны выводиться все номера.
    private Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String name,String phone){
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }
        List<String> values = phoneBook.get(name);
        values.add(phone);
    }

    public void get(String name){
        List<String> values = phoneBook.get(name);
        System.out.println(name + " " + values);
    }




}
