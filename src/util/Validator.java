package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Validator {
    public static int validateInputInteger(String message,Scanner scanner){
        System.out.println(message);
        do {
            try{
                return Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException ex){
                System.err.println("Du lieu nhap vao khong phai so nguyen, vui long nhap lai");
            }
        }while (true);
    }

    public static LocalDate validateInputDate(String message, Scanner scanner){
        System.out.println(message);
        do {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try{
                return LocalDate.parse(scanner.nextLine(), dtf);
            }catch (DateTimeParseException e){
                System.err.println("khong dung dinh dang, vui long nhap lai");
            }
            catch (Exception ex){
              ex.printStackTrace();
            }
        }while (true);
    }

}
