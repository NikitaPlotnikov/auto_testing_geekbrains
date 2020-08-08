package ru.geekbrains.site.at;

public class Human implements Players {

    private String name;
    private int run;
    private int jump;
    private boolean success = true;

    public Human(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getJump() {
        return jump;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void run() {
        System.out.println(name + " бежит максимум: " + run);
    }

    public void jump() {
        System.out.println(name + " прыгает максимум: " + jump);
    }
}
