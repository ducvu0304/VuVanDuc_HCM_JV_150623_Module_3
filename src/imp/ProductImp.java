package imp;

import entity.Product;

import java.util.Scanner;

public class ProductImp {
    Product[] products = new Product[100];
    int addProductQuantity;
    int currentIndex = 0;

    public static void main(String[] args) {
        ProductImp productImp = new ProductImp();
        Scanner scanner =  new Scanner(System.in);
        boolean isExit = true;

        do {
            Menu();

            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    productImp.addProduct(scanner);
                    break;
                case 2:
                    productImp.showAllProduct();
                    break;
                case 3:
                    productImp.calculateProfit();
                    break;
                case 4:
                    productImp.decsSortingProductByProfit();
                    break;
                case 5:
                    productImp.filterProductByExportPrice(scanner);
                    break;
                case 6:

                    productImp.findProductByProductName(scanner);
                    break;
                case 7:
                    productImp.importProduct(scanner);
                    break;
                case 8:
                    productImp.exportProduct(scanner);
                    break;
                case 9:
                    productImp.updateStatus(scanner);
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }while (isExit);
    }

    static void Menu() {
        System.out.println("***********************MENU**************************");
        System.out.println("1.  Nhập thông tin n sản phẩm (n nhập từ bàn phím)");
        System.out.println("2.  Hiển thị thông tin các sản phẩm");
        System.out.println("3.  Tính lợi nhuận các sản phẩm");
        System.out.println("4.  Sắp xếp các sản phẩm theo lợi nhuận giảm dần");
        System.out.println("5.  Thống kê các sản phẩm theo giá bán");
        System.out.println("6.  Tìm các sản phẩm theo tên sản phẩm");
        System.out.println("7.  Nhập sản phẩm");
        System.out.println("8.  Bán sản phẩm");
        System.out.println("9.  Cập nhật trạng thái sản phẩm");
        System.out.println("10. Thoát");
    }

    private void addProduct(Scanner scanner) {
        System.out.println("Enter n product");
        addProductQuantity = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < addProductQuantity; i++) {
            Product product = new Product();
            product.inputData(scanner, products, currentIndex);
            products[currentIndex] = product;
            currentIndex++;
        }
    }

    private void showAllProduct() {
        for (int i = 0; i < currentIndex; i++) {
            products[i].displayData();
        }
    }

    private void calculateProfit() {
        for (int i = 0; i < currentIndex; i++) {
            products[i].calProfit();
        }
        System.out.println("Calculate profit complete!");
    }

    private void decsSortingProductByProfit() {
        for (int i= 0; i < currentIndex-1 ; i++) {
            for (int j = i+1;  j < currentIndex; j++) {
                if(products[i].getProfit() < products[j].getProfit()) {
                    Product temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }

        System.out.println("Sorting products is complete!");
    }

    private void filterProductByExportPrice(Scanner scanner) {
        float fromPrice, toPrice;
        int count = 0;

        do {
            System.out.println("Enter from price:");
            fromPrice = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Enter to price:");
            toPrice =  scanner.nextFloat();
            scanner.nextLine();

            if (fromPrice > toPrice)
                System.out.println("formPrice is less than toPrice");

        }while (fromPrice > toPrice);

        for (int i = 0 ; i < currentIndex; i++) {
            if(products[i].getExportPrice() >= fromPrice && products[i].getExportPrice() <= toPrice) {
                count++;
            }
        }

        System.out.printf("%d product in the price range from %.2f to %.2f\n", count, fromPrice, toPrice);
    }

    private void findProductByProductName(Scanner scanner) {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        boolean isExist = false;

        for (int i = 0; i < currentIndex; i++) {
            if(products[i].getProductName().equalsIgnoreCase((name))) {
                isExist = true;
                products[i].displayData();
            }
        }

        if(!isExist) {
            System.out.printf("The product %s out of stock", name);
        }
    }

    private void importProduct(Scanner scanner) {
        System.out.println("Enter product id:");
        String productID = scanner.nextLine();
        System.out.println("Enter quantity:");
        int quantity = Integer.parseInt(scanner.nextLine());

        boolean isExist = false;
        for (int i = 0; i < currentIndex; i++) {
            if(products[i].getProductId().equalsIgnoreCase(productID)) {
                int newQuantity = products[i].getQuantity() + quantity;
                products[i].setQuantity(newQuantity);
                isExist =  true;
                break;
            }
        }

        if(!isExist) {
            Product product = new Product();
            product.setProductId(productID);
            product.setQuantity(quantity);

            products[currentIndex+1] = product;
        }
    }

    private void exportProduct(Scanner scanner){
        System.out.println("Enter product name:");
        String productName = scanner.nextLine();
        System.out.println("Enter quantity");
        int quantity = Integer.parseInt(scanner.nextLine());
        boolean isExist = false;

        for (int i = 0; i < currentIndex; i++){
            if(products[i].getProductName().equalsIgnoreCase(productName)) {
                isExist = true;

                if(products[i].getQuantity() > quantity) {
                    int newQuantity =  products[i].getQuantity() - quantity;
                    products[i].setQuantity(newQuantity);
                    System.out.printf("The product export %d successfullly \n", quantity);
                }else {
                    System.out.printf("The product %s out of stock", productName);
                }
            }
        }

        if(!isExist) {
            System.out.printf("The product %s out of stock", productName);
        }
    }

    private void updateStatus(Scanner scanner) {
        System.out.println("Enter ProductID:");
        String productId =  scanner.nextLine();
        boolean isExist = false;

        for (int i = 0; i < currentIndex; i++) {
            if(products[i].getProductId().equalsIgnoreCase(productId)){
                isExist = true;
                products[i].setStatus(!products[i].isStatus());
                System.out.printf("The product");
            }
        }

        if(!isExist) {
            System.out.printf("The product %s is out of stock or incorrect!", productId);
        }
    }

}
