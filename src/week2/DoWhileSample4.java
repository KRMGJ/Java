package week2;

public class DoWhileSample4 {
    public static void main(String[] args) {
        // a부터 z까지 줄마다 1개 2개 3개... 씩 출력
        char c = 'a';
        int count = 1;
        while (c <= 'z') {
            for (int i = 0; i < count && c <= 'z'; i++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
            count++;
        }
//        do {
//            int i = 0;
//            while (i < count && c <= 'z') {
//                System.out.print(c + " ");
//                c++;
//                i++;
//            }
//            System.out.println();
//            count++;
//        } while (c <= 'z');
    }
}
