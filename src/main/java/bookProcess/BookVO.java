package bookProcess;

public class BookVO {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private int bookCnt;


    public int getBoodId()
    {
        return this.bookId;
    }
    public String getBookName()
    {
        return this.bookName;
    }
    public String getBookAuthor()
    {
        return this.bookAuthor;
    }
    public int getBookCnt()
    {
        return this.bookCnt;
    }



    public void setBookId(int bookId)
    {
        this.bookId = bookId;
    }
    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }
    public void setBookAuthor(String bookAuthor)
    {
        this.bookAuthor = bookAuthor;
    }
    public void setBookCnt(int bookCnt)
    {
        this.bookCnt = bookCnt;
    }

}
