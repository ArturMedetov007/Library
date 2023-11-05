package Library;

public class LibraryTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.author = "G.Rouling";
        book.title = "Garri Potter";
        book.id = 1;

        Student student = new Student();
        student.name = "Alimzhan";
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
