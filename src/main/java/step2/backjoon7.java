package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class backjoon7 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[3];

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        Arrays.sort(arr);
        int max = arr[2];

        int result = 0;

        //3개다 같을경우
        if(a == b && b == c){
            result = 10000+a*1000;
        }

        //3개다 같지않을경우
        else if(a != b && b != c){
            result = max * 100;
        }

        else{
            result = 1000+a*100;
        }

        System.out.println(result);
    }
}
