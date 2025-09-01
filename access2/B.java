package access2;

import access1.A;

public class B extends A {
    public void showFromB() {
        System.out.println("Access from B (subclass): " + pub + ", " + pro);
        // Can't access def or pri because they are not visible outside the package
    }

    public static void main(String[] args) {
        B b = new B();
        b.showFromB();
    }
}
