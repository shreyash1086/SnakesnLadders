public class Player {
    public int counter;

    Player() {
        this.counter = 0;
    }

    public void increamentCount() {
        counter++;
    }

    public void increamentCount(int number) {
        counter = counter + number;
    }

    public void decreamentCount(int number) {
        counter = counter - number;
    }

    public int getCount() {
        return counter;
    }
}
