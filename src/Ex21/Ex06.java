package Ex21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Nhập danh sách chuỗi, mỗi chuỗi trên một dòng (nhập 'exit' để kết thúc):");
        String str;
        while(true){
            str = sc.nextLine();
            if(str.equals("exit")){
                break;
            }
            list.add(str);
        }
        List<Integer> validIntegers  = list.stream().
                filter(Ex06::isNumeric).map(Integer::parseInt).toList();
        System.out.println("Số lượng chuỗi hợp lệ: " + validIntegers.size());
        System.out.println("Số lượng chuỗi không hợp lệ: " + (list.size() - validIntegers.size()));

        System.out.println("Danh sách số nguyên đã chuyển đổi thành công:");
        System.out.println(validIntegers);
        sc.close();
    }
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
