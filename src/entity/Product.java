package entity;

import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private float profit;
    private int quantity;
    private String descriptions;
    private boolean  status;

    public Product() {
    }

    public Product(String productId, String productName, float importPrice, float exportPrice, float profit, int quantity, String descriptions, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.profit = profit;
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.status = status;
    }

    public void inputData (Scanner scanner, Product[] products, int length) {
        boolean isExist;


        /** Product ID */
        do {
            isExist = false;

            System.out.println("Enter ProductID:");
            this.productId = scanner.nextLine().toUpperCase();

            if(this.productId.charAt(0) == 'P' && this.productId.length() == 4) {
                for (int i = 0; i < length; i++) {
                    if(products[i].productId.equalsIgnoreCase(productId)) {
                        System.out.println("The product ID is exist!");
                        isExist = true;
                        break;
                    }
                }
            }else {
                isExist = true;
                System.out.println("ProductID must be 4 character and start with the letter P (Example: PD001)");
            }

        }while (isExist);


        /** Product Name */
        do {
            isExist = false;

            System.out.println("Enter Product name:");
            this.productName = scanner.nextLine().toUpperCase();

            if(this.productName.length() > 5 && this.productName.length() < 50) {
                for (int i =0;  i < length; i++) {
                    if(products[i].productName.equalsIgnoreCase(this.productName)) {
                        System.out.println("The product name is exist!");
                        isExist = true;
                        break;
                    }
                }
            }else {
                isExist = true;
                System.out.println("The product name is from 6 character to 50 character");
            }
        }while (isExist);

        /** Import Price */
        do {
            System.out.println("Enter Import price:");
            this.importPrice = scanner.nextFloat();
            scanner.nextLine();

            if(this.importPrice < 1) {
                System.out.println("The import price is greater than 0");
            }

        }while (this.importPrice < 1);

        /** Export Price */
        do {
            System.out.println("Enter Export price:");
            this.exportPrice = scanner.nextFloat();
            scanner.nextLine();

            if(this.exportPrice < this.importPrice*1.2) {
                System.out.println("The export price is at least 20% greater than the import price");
            }

        }while (this.exportPrice < this.importPrice*1.2);

        /** Quantity */
        do {
            System.out.println("Enter quantity:");
            this.quantity = scanner.nextInt();
            scanner.nextLine();

            if(this.quantity < 1) {
                System.out.println("The quantity is greater than 0");
            }

        }while (this.quantity < 1);

        /** Description */
        System.out.println("Enter description:");
        this.descriptions = scanner.nextLine();


        /** Status */
        System.out.println("Choose Status (1. active - 2. nonActive)");
        int chooseStatus = Integer.parseInt(scanner.nextLine());

        switch (chooseStatus) {
            case 1:
                this.status = true;
                break;
            case 2:
                this.status = false;
                break;
            default:
                this.status = true;
        }


    }

    public void displayData () {
        String status =  this.status ?  "In stock" : "Out of stock";

        System.out.println("===================");
        System.out.printf("ProductID: %s - ProductName: %s\n" +
                          "ImportPrice: %.2f - ExportPrice: %.2f\n" +
                          "Quantity: %d\n" +
                          "Description: %s\n" +
                          "Status: %s\n" +
                          "Profit: %.2f\n",
                          this.productId, this.productName, this.importPrice, this.exportPrice,
                          this.quantity, this.descriptions, status, this.profit);

    }

    public void calProfit () {
        this.profit = this.exportPrice - this.importPrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
