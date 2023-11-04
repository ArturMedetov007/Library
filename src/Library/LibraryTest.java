package Library;

public class LibraryTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.author = "Leo Tolstoy";
        book.title = "War and Peace";
        book.id = 1;

        Student student = new Student();
        student.name = "John";
        student.studentID = 12345;

        Teacher teacher = new Teacher();
        teacher.name = "Mrs. Smith";
        teacher.id = 1001;
        teacher.subject = "Literature";

        Library library = new Library();
        library.availableBook = book;

        student.display();
        teacher.display();
        library.lendBook(student);
        student.display();

        library.acceptBook(student);
        student.display();
    }
}
