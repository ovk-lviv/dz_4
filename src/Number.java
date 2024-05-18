public class Number {
    private int number = 10;

    public int getNumber() {
        return number;
    }

    public int showNumber () {

        System.out.println(getNumber());
        return getNumber();
    }
}
