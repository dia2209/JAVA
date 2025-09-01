public class BoxDemo {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(123);
        intBox.printValue();

        Box<String> strBox = new Box<>("Hello");
        strBox.printValue();
    }
}