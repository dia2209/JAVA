/*Write a program to store a list of Book objects in a file using ObjectOutputStream and
retrieve them using ObjectInputStream.*/
//Name:Diya Manandhar

class Book1 {
    int id;
    String title;
    String author;

    public Book1(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return id + "," + title + "," + author;
    }
}

