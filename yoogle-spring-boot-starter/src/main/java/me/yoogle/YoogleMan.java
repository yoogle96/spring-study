package me.yoogle;


public class YoogleMan {

    String name;

    int howLong;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHowLong() {
        return howLong;
    }

    public void setHowLong(int howLong) {
        this.howLong = howLong;
    }

    @Override
    public String toString() {
        return "YoogleMan{" +
                "name='" + name + '\'' +
                ", howLong=" + howLong +
                '}';
    }
}
