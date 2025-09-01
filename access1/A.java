/*Create two packages and demonstrate the use of public, protected,private, and default
access modifiers between classes of different packages.*/
//Name: Diya Manandhar
package access1;

public class A{
    public int pub=1;
    protected int pro=2;
    int def=3;
    private int pri=4;

    public void show(){
        System.out.println("Access in class A: "+pub+", "+ def+", "+pri);
    }
}
