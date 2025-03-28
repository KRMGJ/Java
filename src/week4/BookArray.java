package week4;

import lombok.AllArgsConstructor;

import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Books[] book = new Books[2];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < book.length; i++) {
            System.out.print("제목>> ");
            String title = scanner.nextLine();
            System.out.print("저자>> ");
            String author = scanner.nextLine();
            book[i] = new Books(title, author);
        }

        for (int i = 0; i < book.length; i++) {
            System.out.print("(" + book[i].title + ", " + book[i].author + ")");
        }
        scanner.close();
    }
}

@AllArgsConstructor
class Books {
    String title;
    String author;
}