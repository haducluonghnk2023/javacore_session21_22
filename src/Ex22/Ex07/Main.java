package Ex22.Ex07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String file = "data.txt";
        List<Country> list = readCountriesFromFile(file);
        System.out.println("Danh sách quốc gia:");
        for (Country country : list) {
            System.out.println(country);
        }
    }
    public static List<Country>  readCountriesFromFile(String filename) {
        List<Country> countries = new ArrayList<>();
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File không tồn tại!");
            return countries;
        }
        try(Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] data = line.split(",");
                if (data.length == 3){
                    int id =  Integer.parseInt(data[0]);
                    String name =  data[1];
                    String code =  data[2];
                    countries.add(new Country(id, name, code));
                }
            }
        }catch (FileNotFoundException e) {
            System.out.println("Lỗi: Không tìm thấy file!");
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Dữ liệu không hợp lệ!");
        }
        return countries;
    }
}
