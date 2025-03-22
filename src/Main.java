import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    // Main methodunda WorkersInfo methodu çağrılıyor;
    public static void main(String[] args) {
        WorkersInfo();
    }

    // İkinci sayfa da yazdığımız methodları doldurması verileri giriyoruz;
    protected static void WorkersInfo(){
        System.out.println("Çalışan adını giriniz: ");
        String name = scanner.nextLine();

        System.out.println("Çalışanın maaş bilgisini giriniz: ");
        int salary = scanner.nextInt();

        System.out.println("Çalışanın haftalık çalışma saatini giriniz: ");
        int workHours = scanner.nextInt();

        System.out.println("Çalışanın işe başlangıç yılını giriniz: ");
        int hireYear = scanner.nextInt();

        Employee employee = new Employee(name, salary, workHours, hireYear);

        System.out.println("Çalışan bilgileri: ");
        System.out.println(employee);

    }


}