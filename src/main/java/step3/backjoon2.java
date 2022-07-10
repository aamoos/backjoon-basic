package step3;

import java.io.IOException;
import java.util.Scanner;

public class backjoon2 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        for(int i=0; i<a; i++){
            int b = scan.nextInt();
            int c = scan.nextInt();
            System.out.println(b+c);
        }
    }
}
