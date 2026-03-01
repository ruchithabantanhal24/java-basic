import java.util.Scanner;
public class Gcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int num = Math.min(a,b);num>=1;num--){
            if(a%num == 0 && b%num == 0){
                System.out.println(num);
                break;
            }
        }

    }
}