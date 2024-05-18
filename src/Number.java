public class Number {
    private static int number = 10;

    public static int getNumber() {
        return number;
    }

    public static int showNumber () {

        System.out.println(getNumber());
        return getNumber();
    }
}
