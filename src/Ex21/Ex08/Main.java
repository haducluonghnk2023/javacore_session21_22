package Ex21.Ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập danh sách số điện thoại (cách nhau bằng dấu phẩy): ");
        String phone = sc.nextLine();
        String [] phones = phone.split(",");
        List<String> validPhones = new ArrayList<>();
        List<String> invalidPhones = new ArrayList<>();
        for(String p : phones) {
            p = p.trim();
            try{
                validatePhoneNumber(p);
                validPhones.add(p);
            }catch(InvalidPhoneNumberLengthException e){
                invalidPhones.add(e.getMessage());
            }
        }
        System.out.println("\nSố điện thoại hợp lệ: " + validPhones);
        System.out.println("Số điện thoại không hợp lệ: " + invalidPhones);
        sc.close();
    }
    public static void validatePhoneNumber(String phone) throws InvalidPhoneNumberLengthException{
        if(!phone.matches("\\d{10}")){
            throw new InvalidPhoneNumberLengthException("Không hợp lệ: " + phone + " (Phải có đúng 10 chữ số)");
        }
    }
}
