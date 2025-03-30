package exception;

import util.Validator;

import java.time.LocalDate;
import java.util.Scanner;

public class ValidateDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate dob = Validator.validateInputDate("Nhap vao ngay sinh cua ban",sc);
        System.out.println("ngay sinh cua ban "+ dob);
    }
}
