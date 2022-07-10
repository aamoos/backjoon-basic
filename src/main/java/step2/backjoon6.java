package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String arr[] = br.readLine().split(" ");

        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int time = Integer.parseInt(br.readLine());

        int a = h*60 + m + time;
        h = a/60;
        m = a%60;

        if(h>=24){
            h = h-24;
        }

        System.out.println(h + " " + m);
    }
}
