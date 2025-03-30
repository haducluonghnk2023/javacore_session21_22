package Ex21;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("nhap vao so phan tu cua mang ");
            int n = sc.nextInt();
            int [] a = new int[n];
            for (int i = 0; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("nhap vao chi so phan tu cua mang ");
            int index = sc.nextInt();
            System.out.println(a[index]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
