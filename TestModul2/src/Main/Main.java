package Main;

import Manager.ManagerStudent;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ManagerStudent managerStudent = new ManagerStudent();
    static mainSort mainSort= new mainSort();


    public static void main(String[] args) {
      while (true){
          System.out.println("---CHUONG TRINH QUAN LY SINH VIEN---");
          System.out.println("1. Xem danh sach sinh vien");
          System.out.println("2. Them moi");
          System.out.println("3. Cap nhat");
          System.out.println("4. Xoa");
          System.out.println("5. Sap xep");
          System.out.println("6.Doc tu file");
          System.out.println("7.Ghi tu file");
          System.out.println("8.Thoat");
          int choie = Integer.parseInt(scanner.nextLine());
          switch (choie) {
              case 1:

                  managerStudent.showSave();
                  break;
              case 2:

                  managerStudent.crateStudent();
                  break;
              case 3:
                  managerStudent.editStudnet();
                  break;
              case 4:
                  managerStudent.delete();
                  break;
              case 5:
                  mainSort.mainsapxep();
                  break;
              case 6:
                  managerStudent.read();
                  break;
              case 7:
                  managerStudent.write();
                  break;
              case 8:
                  System.exit(8);
                  break;
          }
      }
    }

}
