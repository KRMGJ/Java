package week4;

public class Book {
    String title;
    String author;

    void show() {
        System.out.println(title + " " + author);
    }

    public Book(){
        this("", "");
        System.out.println("생성자 호출됨");
    }

    public Book(String title){
        this.title = title;
        this.author = "작자미상";
    }
    /**
     * 생성자 오버로딩
     * @param title 제목
     * @param author 작가
     */
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");
        Book emptyBook = new Book();
        loveStory.show();
    }
}
