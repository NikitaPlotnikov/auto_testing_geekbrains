package example.home.work;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Плотников","+79061524242");
        phoneBook.add("Михайлов","+79061524145");
        phoneBook.add("Шаражкин","+79061524234");
        phoneBook.add("Мамыкин","+79061524290");
        phoneBook.add("Михайлов","+79061522132");

        phoneBook.get("Михайлов");
        phoneBook.get("Плотников");
    }
}
