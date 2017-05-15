package zadanieProxy;

public class Main {
    public static void main(String[] args) {
        PageAssembler assembler = new PageAssembler(300, 600, new FullWidthStrategy());

        assembler.addImage(new ImageProxy("parrot.png"));
        assembler.addImage(new ImageProxy("dogue.jpg"));
        assembler.addImage(new ImageProxy("cat.jpg"));

        assembler.pack();
    }
}
