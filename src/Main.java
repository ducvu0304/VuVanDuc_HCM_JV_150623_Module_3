import entity.Product;

public class Main {
    public static void main(String[] args) {
    String str = "pd02".toUpperCase();
    String str1 = "PD02";

        Product[] products =  new Product[4];
        System.out.println(products[0] != null);

//        System.out.println(str.charAt(0) == 'P');
//        System.out.println(str.equalsIgnoreCase(str1));



//        1. Xây dựng lớp Product trong package ra.entity gồm:
//        a. Các thuộc tính
//▪ productid – String: Mã sản phẩm – gồm 4 ký tự, không trùng lặp bất đàu từ ký tự P
//▪ productName – String: Tên sản phẩm – gồm 6-50 ký tự, không trùng
//                lặp
//▪ importPrice – float: Giá nhập có giá trị lớn hơn 0
//▪ exportPrice – float: Giá xuất có giá trị lớn hơn ít nhất 20% so với
//                importPrice
//▪ profit – float: Lợi nhuận tính theo công thức:
//▪ profit = exportPrice – importPrice
//▪ quantity – int: Số lượng sản phẩm có giá trị lớn hơn 0
//▪ descri@ptions – String: Mô tả sản phẩm
//▪ status – Boolean: Trạng thái sản phẩm
//        b. Các constructor
//        c. Các phương thức get/set
//        d. Các phương thức
//▪ inputData(Scanner scanner): Cho phép nhập thông tin sản phẩm (trừ
//                profit) có validate dữ liệu đầu vào theo yêu cầu
//▪ displayData(): Cho phép hiển thị tất cả thông tin sản phẩm, (hiển thị
//        trạng thái: true – Đang bán, false – Không bán)
//▪ calProfit(): Cho phép tính lợi nhuận sản phẩm theo công thức
//        2. Xây dựng lớp main có tên ProductImp trong package ra.imp thực hiện khởi
//        tạo một mảng Product gồm 100 phần tử và hiển thị menu - thực hiện các
//        chức năng theo menu:
//***********************MENU**************************
//        1. Nhập thông tin n sản phẩm (n nhập từ bàn phím)
//        2. Hiển thị thông tin các sản phẩm
//        3. Tính lợi nhuận các sản phẩm
//        4. Sắp xếp các sản phẩm theo lợi nhuận giảm dần
//        5. Thống kê các sản phẩm theo giá
//        6. Tìm các sản phẩm theo tên sản phẩm
//        7. Nhập sản phẩm
//        8. Bán sản phẩm
//        9. Cập nhật trạng thái sản phẩm
//        10. Thoát
//        Lưu ý:
//• Chức năng 5: Thống kê các sản phẩm theo giá
//        o Cho phép người dùng nhập vào khoảng giá cần thống kê sản phẩm
//        (fromPrice - toPrice)
//        o Thống kê số lượng các sản phẩm có giá bán trong khoảng từ fromPrice
//        đến toPrice
//• Chức năng 7: Nhập sản phẩm
//        o Cho phép người dùng nhập vào mã sản phẩm và số lượng sản phẩm cần
//        nhập
//        o Tiến hành cộng số lượng vừa nhập vào quantity của sản phẩm có mã
//        sản phẩm cần nhập
//• Chức năng 8: Bán sản phẩm
//        o Cho phép người dùng nhập vào tên sản phẩm và số lượng sản phẩm cần
//        bán
//        o Tiến hành trừ số lượng vừa bán từ quantity của sản phẩm có tên sản
//        phẩm cần bán
//• Chức năng 9: Cập nhật trạng thái sản phẩm
//        o Cho phép người dùng nhập vào mã sản phẩm cần cập nhật trạng thái
//        o Cập nhật sản phẩm có mã như vậy từ true → false và ngược lại
    }
}