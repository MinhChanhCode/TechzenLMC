package OOP.ClassObject.Ex2;

import java.util.Scanner;

public class Phanso {
    int tuSo;
    int mauSo;

    void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tử số: ");
        tuSo = scanner.nextInt();

        do {
            System.out.print("Nhập mẫu số khác (bắt buộc khác 0): ");
            mauSo = scanner.nextInt();
            if (mauSo == 0) {
                System.out.println("Vui lòng nhập lại !!!");
            }
        } while (mauSo == 0);
    }

    void rutGon() {
        int UCLN = UocChungLonNhat(tuSo, mauSo);

        tuSo /= UCLN;
        mauSo /= UCLN;

        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }

        System.out.println("\nTử số là: " + tuSo);
        System.out.println("Mẫu số là: " + mauSo);
        System.out.println("Kết quả là: " + UocChungLonNhat(tuSo, mauSo));

    }

    int UocChungLonNhat(int tuSo, int mauSo) {
        if (tuSo == 0 || mauSo == 0) {
            return 1;
        }
        tuSo = Math.abs(tuSo);

        for (int i = tuSo; i >= 1; i--) {
            if (tuSo % i == 0 && mauSo % i == 0) {
                return i;
            }
        }
        return 1;
    }



}