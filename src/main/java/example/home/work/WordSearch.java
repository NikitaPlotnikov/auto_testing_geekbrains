package example.home.work;

import java.util.*;

public class WordSearch {
//    Создать коллекцию с набором из 10–20 слов,
//    должны встречаться повторяющиеся. Найти и вывести список уникальных слов,
//    из которых состоит коллекция.
//    Посчитать, сколько раз встречается каждое слово.

    public static void main(String[] args) {
        String[] text = new String[]{"возле","нашего","дома","большой","лес","там","много","гриб",
                "лес","ягод","однажды","моя","семья","пикник","занесён","книгу","нельзя", "белыми","гриб",
                "есть","ядовитый","пикник","много","ядовитый","пикник","интересные","нашёл","мухомор"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(text));
        Set<String> set = new HashSet<>(arrayList);
        System.out.println(set);
        for (String string : arrayList) {
            System.out.println("Слово " + string + " встречается " +Collections.frequency(arrayList, string) + " раз");
        }
    }
}
