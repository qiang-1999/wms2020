import java.util.Scanner;

public class Char2Num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ��0-9������");
        int num = sc.nextInt();
        char c1 = (char)(num + '0');
        System.out.println(c1);
    }
} 