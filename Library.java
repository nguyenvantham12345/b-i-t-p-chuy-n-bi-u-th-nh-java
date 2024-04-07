import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void borrowBook(String bookId, String memberId) {
        // Implement borrowing logic here
        // ...
    }

    public void returnBook(String bookId, String memberId) {
    }
}
