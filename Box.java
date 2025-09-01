//Create a generic class Box<T> that stores any type of value and prints it.
//Name:Diya Manandhar
class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println("Value: " + value);
    }
}
