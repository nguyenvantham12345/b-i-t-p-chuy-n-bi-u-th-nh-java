public class Book {
    private String bookId;
    private String title;
    private String author;
    private String isbn;
    private boolean availability;

    public Book(String bookId, String title, String author, String isbn) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availability = true; // Giả sử sách có sẵn khi tạo mới
    }

    public boolean checkAvailability() {
        return availability;
    }

    public void borrow() {
        if (availability) {
            availability = false;
            System.out.println("Sách đã được mượn.");
        } else {
            System.out.println("Xin lỗi, sách hiện không có sẵn.");
        }
    }
