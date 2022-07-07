package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backjoon2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        if(n >= 90 && n <= 100){
            System.out.println("A");
        }else if(n >= 80 && n <= 89){
            System.out.println("B");
        }else if(n >= 70 && n <= 79){
            System.out.println("C");
        }else if(n >= 60 && n <= 69){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
