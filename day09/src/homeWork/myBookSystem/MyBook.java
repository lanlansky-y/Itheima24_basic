package homeWork.myBookSystem;

/**
 * 图书的属性有：编号，书名，作者，价格。要求提供如下功能：
 */
public class MyBook {
    private String id;
    private String bookName;
    private String author;
    private String price;

    public MyBook(String id, String bookName, String author, String price) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    public MyBook() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
