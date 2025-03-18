import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan veri al
        System.out.print("Çalışanın adını girin: ");
        String name = scanner.nextLine();

        System.out.print("Maaşı girin: ");
        int salary = scanner.nextInt();

        System.out.print("Haftalık çalışma saatini girin: ");
        int workhours = scanner.nextInt();

        System.out.print("İşe giriş yılını girin: ");
        int hireYear = scanner.nextInt();

        // Employee nesnesini oluştur
        Employee emp = new Employee(name, salary, workhours, hireYear);

        // Bilgileri yazdır
        System.out.println("\nÇalışan Bilgileri:");
        System.out.println(emp); // toString() otomatik çağrılır

        // Scanner'ı kapat
        scanner.close();

    }
}
