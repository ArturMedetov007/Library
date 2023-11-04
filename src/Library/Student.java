package Library;

public class Student {
    String name;
    int studentID;
    Book borrowedBook;

    void display() {
        System.out.println("Student: " + name + " | Student ID: " + studentID);
        if (borrowedBook != null) {
            System.out.print("Borrowed Book: ");
            borrowedBook.display();
        } else {
            System.out.println("No book borrowed.");
        }
    }

}
