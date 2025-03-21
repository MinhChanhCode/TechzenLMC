package OOP.Polymorphic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n===== MENU QUẢN LÝ ĐIỆN THOẠI =====");
                System.out.println("1. Xem danh sách điện thoại");
                System.out.println("2. Thêm mới");
                System.out.println("3. Cập nhật");
                System.out.println("4. Xóa");
                System.out.println("5. Sắp xếp theo giá");
                System.out.println("6. Tìm kiếm");
                System.out.println("7. Tổng tiền");
                System.out.println("0. Thoát");
                System.out.println("===================================");
                System.out.print("Chọn chức năng: ");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Hiển thị danh sách điện thoại...");
                        break;
                    case 2:
                        System.out.println("Thêm mới điện thoại...");
                        break;
                    case 3:
                        System.out.println("Cập nhật thông tin điện thoại...");
                        break;
                    case 4:
                        System.out.println("Xóa điện thoại...");
                        break;
                    case 5:
                        System.out.println("Sắp xếp điện thoại theo giá...");
                        break;
                    case 6:
                        System.out.println("Tìm kiếm điện thoại...");
                        break;
                    case 7:
                        System.out.println("Tổng tiền các điện thoại...");
                        break;
                    case 0:
                        System.out.println("Thoát chương trình. Hẹn gặp lại!");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
                }
            } while (choice != 0);

            scanner.close();
        }
    }

