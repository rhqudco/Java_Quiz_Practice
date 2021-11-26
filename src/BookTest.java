class Book {
    String bookNo;
    String bookTitle;
    String bookAuthor;
    int bookYear;
    int bookPrice;
    String bookPublisher;

    Book(String bookNo,
            String bookTitle,
            String bookAuthor,
            int bookPrice,
            int bookYear,
            String bookPublisher) {
        this.bookNo = bookNo;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookYear = bookYear;
        this.bookPublisher = bookPublisher;
    }
    @Override
    public String toString() {
        return bookNo + "   " + bookTitle + "   " + bookAuthor + "       " + bookPrice + "       " + bookYear + "    " + bookPublisher;
    }
}

class Magazine extends Book {
    int month;
    Magazine(String bookNo,
             String bookTitle,
             String bookAuthor,
             int bookPrice,
             int bookYear,
             String bookPublisher,
             int month) {
        super(bookNo, bookTitle, bookAuthor, bookPrice, bookYear, bookPublisher);
        this.month = month;
    }
    @Override
    public String toString() {
        return bookNo + "" + bookTitle + "" + bookAuthor + "     " + bookPrice + "      " + bookYear + "     " + bookPublisher + "      " + month;
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("B001", "   자바 프로그래밍", "홍길동", 25000, 2021, "   멀티출판사");
        Book b2 = new Book("B002", "    자바스크립트", "  이몽룡", 30000, 2020, "   서울출판사");
        Book b3 = new Book("B003", "      HTML/CSS", "    성춘향", 18000, 2021, "   강남출판사");

        Magazine m1 = new Magazine("M001", "      자바 월드", "     홍길동", 25000, 2021, "멀티출판사", 5);
        Magazine m2 = new Magazine("M002", "       웹 월드", "      이몽룡", 30000, 2020, "서울출판사", 7);
        Magazine m3 = new Magazine("M003", "      게임 월드", "     성춘향", 18000, 2021, "강남출판사", 9);
        System.out.println("도서번호      도서명         저자         가격      발행일        출판사");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println();
        System.out.println("잡지번호    잡지명      발행인      가격    발행연도     출판사     발행월");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
    }
}
