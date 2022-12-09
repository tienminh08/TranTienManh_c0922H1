package Manager;

import Model.Studnet;
import Oi.WriteandRead;
import Sort.Sort;
import Sort.SortAverage;


import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

public class ManagerStudent {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Studnet> SaveStudnet = (ArrayList<Studnet>) WriteandRead.read();

    public void crateStudent() {
        System.out.println("nhap ma sinh vien");
        String IdStudent = scanner.nextLine();
        System.out.println("nhap ten sinh vien");
        String Name = scanner.nextLine();

        do {
            try {

                System.out.println("nhap tuoi sinh vien");
                int age = Integer.parseInt(scanner.nextLine());
                if (age>6&&age<120){
                    System.out.println("nhap gioi tinh sinh vien");
                    String Gender = scanner.nextLine();
                    System.out.println("nhap dia chi sinh vien");
                    String address = scanner.nextLine();
                    do {
                        try {
                            System.out.println("nhap diem trung binh");
                            double average = Double.parseDouble(scanner.nextLine());
                            if (average>0&&average<10){
                                Studnet studnet = new Studnet(IdStudent, Name, age, Gender, address, average);
                                SaveStudnet.add(studnet);
                                WriteandRead.write(SaveStudnet);
                                System.out.println("thanh cong");
                                break;
                            }else {
                                System.out.println("nhap lai tuoi");
                            }

                        } catch (Exception e) {
                            System.out.println("nhap  so");
                        }
                    } while (true);
                    break;
                }else {
                    System.out.println("tuoi khong duoc nho hon 6 va lon hon 120");
                }


            } catch (Exception e) {
                System.out.println("nhap lai");

            }


        } while (true);


    }



    public void showSave() {
        int count=0;
        for (int i = 0; i < SaveStudnet.size(); i++) {
            System.out.println(SaveStudnet.get(i).toString());
            count++;

        }
        if (count==5){

        }
    }


    public int checkIDstudnet(String IdStudent) {
        for (int i = 0; i < SaveStudnet.size(); i++) {
            if (IdStudent.equals(SaveStudnet.get(i).getIDstudent())) {
                return i;
            }

        }
        return -1;
    }

    public void editStudnet() {
        System.out.println("nhap ma sinh vien ");
        String IdStudent = scanner.nextLine();
        if (checkIDstudnet(IdStudent) == -1) {
            System.out.println("Không tìm được sinh viên với mã sinh viên trên");

        } else {
            int index = checkIDstudnet(IdStudent);
            System.out.println("Ban muon sua thong tin gi?");
            System.out.println("1.Ma sinh vien");
            System.out.println("2.Ho ten sinh vien");
            System.out.println("3.Tuoi sinh vien");
            System.out.println("4.gioi tinh sinh vien");
            System.out.println("5.dia chi sinh vien");
            System.out.println("6.diem trung binh sinh vien");
            System.out.println("7 thoat");
            int choie = Integer.parseInt(scanner.nextLine());
            switch (choie) {
                case 1:
                    System.out.println("nhap ma sinh vien muon thay doi");
                    String newIdStudent = scanner.nextLine();
                    SaveStudnet.get(index).setIDstudent(newIdStudent);
                    System.out.println("thanh cong");
                    WriteandRead.write(SaveStudnet);
                    break;
                case 2:
                    System.out.println("nhap ten sinh vien muon thay doi");
                    String newname = scanner.nextLine();
                    SaveStudnet.get(index).setName(newname);
                    System.out.println("thanh cong");
                    WriteandRead.write(SaveStudnet);
                    break;
                case 3:
                    System.out.println("nhap tuoi sinh vien muon thay doi");
                    int age = Integer.parseInt(scanner.nextLine());
                    SaveStudnet.get(index).setAge(age);
                    System.out.println("thanh cong");
                    WriteandRead.write(SaveStudnet);
                    break;
                case 4:
                    System.out.println("nhap ma sinh vien muon thay doi");
                    String newgender = scanner.nextLine();
                    SaveStudnet.get(index).setGender(newgender);
                    System.out.println("thanh cong");
                    WriteandRead.write(SaveStudnet);
                    break;
                case 5:
                    System.out.println("nhap dia chi sinh vien muon thay doi");
                    String newaddress = scanner.nextLine();
                    SaveStudnet.get(index).setGender(newaddress);
                    System.out.println("thanh cong");
                    WriteandRead.write(SaveStudnet);
                    break;
                case 6:
                    System.out.println("nhap DTB sinh vien muon thay doi");
                    double tb = Double.parseDouble(scanner.nextLine());
                    SaveStudnet.get(index).setAverage(tb);
                    System.out.println("thanh cong");
                    WriteandRead.write(SaveStudnet);
                    break;
                default:
                    return;
            }
        }


    }

    public void delete() {
        System.out.println("nhap ma sinh vien muon xoa ");
        String IdStudent = scanner.nextLine();
        if (checkIDstudnet(IdStudent) == -1) {
            System.out.println("Không tìm được sinh viên với mã sinh viên trên");
            System.out.println("1.nhap lai");
            int choie = Integer.parseInt(scanner.nextLine());
            if (choie == 1) {
                delete();
            } else {
                return;
            }
        } else {
            int index = checkIDstudnet(IdStudent);
            System.out.println("ban chac chan muon xoa");
            System.out.println("1 nhan Y de xac nhan xoa");
            System.out.println("2.thoat");
            String choie = scanner.nextLine();
            if (choie.equals("Y")) {
                SaveStudnet.remove(index);
                System.out.println("thanh cong");
                WriteandRead.write(SaveStudnet);
            } else {
                return;
            }

        }
    }

    public void sortAverage() {
        Collections.sort(SaveStudnet, new SortAverage());

        for (int i = 0; i < SaveStudnet.size(); i++) {
            System.out.println(SaveStudnet.get(i).toString());

        }
    }

    public void sort() {
        Collections.sort(SaveStudnet, new Sort());
        for (int i = 0; i < SaveStudnet.size(); i++) {
            System.out.println(SaveStudnet.get(i).toString());

        }
    }

    public void write() {
        System.out.println("da ghi");
    }

    public void read() {
        System.out.println("da doc");
    }


}
