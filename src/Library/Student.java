package Library;
import java.time.LocalDate;
public class Student {
    String name;
    int studentID;
    Book borrowedBook;

    void display() {
        System.out.println("Student: " + name + " | Student ID: " + studentID);
        LocalDate today = LocalDate.now();
        today = today.minusMonths(1);
        if (borrowedBook != null) {
            System.out.print("Borrowed Book: " + today + " ");
            borrowedBook.display();
        } else {
            System.out.println("No book borrowed.");
        }
    }

}
