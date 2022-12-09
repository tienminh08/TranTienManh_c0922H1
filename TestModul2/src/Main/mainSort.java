package Main;

import Manager.ManagerStudent;

import java.util.Scanner;

public class mainSort {
    static Scanner scanner = new Scanner(System.in);
    static ManagerStudent managerStudent1= new ManagerStudent();

    public void mainsapxep() {
        System.out.println("---SAP XEP SINH VIEN THEO DIEM TRUNG BINH---");
        System.out.println("chon chuc nang theo so (de tiep tuc)");
        System.out.println("1. sap xep diem trung binh tang dan ");
        System.out.println("2. sap xep diem trung binh giam dan");
        System.out.println("3.thoat");
        System.out.println("chon chuc nang:");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                managerStudent1.sortAverage();
                break;
            case 2:
                managerStudent1.sort();
                break;
            case 3:
                return;
        }
    }
}
