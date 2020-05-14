package single_responsibility.bad;
import java.util.*;
public class Book {
    String name;
    String authorName;
    int totalPageCount;
    int curPageCount;
    boolean toRead;
    public Book(){}
    public Book(String name, String authorName, int numOfPages){
        this.name = name;
        this.authorName = authorName;
        this.totalPageCount = numOfPages;
        this.curPageCount = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public void printBookInformation(){
        System.out.println(this.name + " " + this.authorName + ", and you read "+ this.curPageCount +" of "+  this.totalPageCount);
    }
    public void read(int page){
        this.curPageCount = (this.curPageCount + page <= this.totalPageCount) ? this.curPageCount + page : this.totalPageCount;
    }
}
