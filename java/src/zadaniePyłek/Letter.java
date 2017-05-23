package zadaniePyłek;

public class Letter {
    private char aChar;

    public Letter(char aChar) {
        this.aChar = aChar;
    }

    public void showAt(int index) {
        while (index-- > 0) {
            System.out.printf(" ");
        }
        System.out.println(this.aChar);
    }
}
