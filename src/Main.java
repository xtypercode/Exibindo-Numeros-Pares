import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num;

        num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
