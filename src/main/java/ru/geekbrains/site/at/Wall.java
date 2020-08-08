package ru.geekbrains.site.at;

public class Wall implements Obstacles {

    private int size;

    public Wall(int size){
        this.size = size;
    }


    public void check(Players players) {
        players.jump();
        players.setSuccess(players.getJump() >= size);
        if (players.getSuccess()) {
            System.out.println("Прыгун " + players.getName() + " выполнил испытание, перепрыгнув стену высотой: " + size);
        } else {
            System.out.println("Прыгун " + players.getName() + " не перепрыгнул стену высотой: " + size);
        }

    }
}
