import java.util.Scanner;
public class Lcm {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
		for(int num = Math.max(a,b); ;num++){
			if(num% a == 0 && num % b == 0) {
				System.out.println(num);
                break;
            }
		}
	}
}