package example.equals.and.hashcode;

public class Start {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Собакен");
        Dog dog2 = new Dog("Гавик");

        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());

        dog1.dogPassportNumber = 1234;

        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());


    }
}
