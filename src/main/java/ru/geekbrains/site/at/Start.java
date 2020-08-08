package ru.geekbrains.site.at;

//        Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать
//        (методы просто выводят информацию о действии в консоль).
//        ————————————————————————
//        Создайте два класса: беговая дорожка и стена, при прохождении через которые,
//        участники должны выполнять соответствующие действия (бежать или прыгать),
//        результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//        У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//        ————————————————————————
//        Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//
//        ————————————————————————
//        Задание со звездочкой:
//        Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
public class Start {
    public static void main(String[] args) {

        Cat tima = new Cat("Tima",150,2);
        Cat max = new Cat("Max",300,5);
        Cat tom = new Cat("Tom",30,1);
        Human vasilih = new Human("Vasilih",150,1);
        Human misha = new Human("Misha",220,1);
        Human oleg = new Human("Oleg",50,4);
        Robot wally = new Robot("Wally",100,2);
        Robot R2D2 = new Robot("R2D2",1000,0);
        Robot eva = new Robot("EVA",1,10);
        Wall wall1 = new Wall(4);
        Wall wall2 = new Wall(2);
        Wall wall3 = new Wall(1);
        Treadmill treadmill1 = new Treadmill(300);
        Treadmill treadmill2 = new Treadmill(100);
        Treadmill treadmill3 = new Treadmill(50);

        Players[] players = {tima,max,tom,vasilih,misha,oleg,wally,R2D2,eva};
        Obstacles[] obstacles = {wall1,wall2,wall3,treadmill1,treadmill2,treadmill3};

        for (int i = 0; i < obstacles.length; i++){
            System.out.println("\nИспытание " + (i + 1));

            for (Players play : players) {
                if (play.getSuccess()) {
                    System.out.println("------------");
                    obstacles[i].check(play);
                }

            }

        }

    }



}
