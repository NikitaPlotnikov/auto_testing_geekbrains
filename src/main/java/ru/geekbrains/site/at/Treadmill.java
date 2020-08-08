package ru.geekbrains.site.at;

public class Treadmill implements Obstacles {

    private int size;

    public Treadmill(int size){
        this.size = size;
    }


    public void check(Players players) {
        players.run();
        players.setSuccess(players.getRun() >= size);
        if (players.getSuccess()) {
            System.out.println("Бегун " + players.getName() + " выполнил испытание, пробежав дорожку длиной: " + size);
        } else {
            System.out.println("Бегун " + players.getName() + " не пробежал дорожку длиной: " + size);
        }
    }
}
