package run.ProductManagement;

import ra.entity.Product;
import ra.utils.ScannerUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ProductMana {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = "src\\ra\\data\\products.txt";
        List<Product> list = new ArrayList<>();

//        Optional<List<Product>> optional = Optional.ofNullable((List<Product>) readFile(path));
//
//        if(optional.isPresent()) {
//            list = optional.get();
//        }

        while (true) {
            System.out.println("*********** Menu *********\n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Hiển thị thông tin sản phẩm \n" +
                    "3. Thoát ");

            System.out.println("Enterc choice:");
            int choice = ScannerUtils.inputInteger(scanner);

            switch (choice) {
                case 1:
                    Product product = new Product("Áo thung", "Yame", 26, "mặc mát");

                    list.add(product);
                    writeFile(path, list);
                    System.out.println("Add product successfully!");
                    break;
                case 2:
                    list.stream().map(Product::getName).forEach(System.out::println);
                    break;
                case 3:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("No choices");
            }
        }
    }

    static void writeFile(String filePath, List<Product> list) throws IOException {
        ObjectOutputStream outputStream = null;

        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(filePath));
            outputStream.writeObject(list);
        }catch (EOFException e){
            e.printStackTrace();
        }finally {
            outputStream.close();
        }
    }

    static List<Product> readFile(String filePath) throws IOException {
        List<Product> list = new ArrayList<>();
        ObjectInputStream inputStream = null;

        try {
            inputStream = new ObjectInputStream(new FileInputStream(filePath));

            Optional<List<Product>> optional = Optional.ofNullable((List<Product>)inputStream.readObject());
            if(optional.isPresent()) {
                list = optional.get();
            }else {
                list = new ArrayList<>();
            }
        } catch (EOFException e){

        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            assert inputStream != null;
            inputStream.close();
        }

        return list;
    }
}
