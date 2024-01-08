import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for(int i = 1; i < 10000; i++){
            if(i%a == 2){
                System.out.println(i);
            }
        }

        br.close();
    }
}
