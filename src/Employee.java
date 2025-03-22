public class Employee {

    // Bilgi için nitelikleri tanımladık;
    protected String name;
    protected double salary;
    protected int workHours;
    protected int hireYear;

    //Formata uygun bir Constructor metodu oluşturduk;
    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //Gerekli hesaplamalar için methodunu oluşturduk;
    public double Tax(){
        if(salary > 1000 ){
            return salary * 0.03;
        } else {
            return 0;
        }
    }

    public double Bonus(){
        if (workHours > 40){
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double YearlyBonus(){
        int thisYear = 2021;

        if ((thisYear - hireYear) < 10 ){
            return salary * 0.05;
        } if ((thisYear - hireYear) > 9 && (thisYear - hireYear) < 20){
            return salary * 0.10;
        } if ((thisYear - hireYear) > 19){
            return salary * 0.15;
        }
        return 0;
    }

    // Ödevin print tanımına özel method yaptık;
    public String toString () {
        return "Adı: " + name + "\n" +
                "Maaş: " + salary + "\n" +
                "Çalışma Saati: " + workHours + "\n" +
                "İşe giriş yılı: " + hireYear + "\n" +
                "Vergi: " + Tax() + "\n" +
                "Bonus: " + Bonus() + "\n" +
                "Maaş artışı: " + YearlyBonus() + "\n" +
                "Vergi ve bonusla ile birlikte maaş: " + (salary + Bonus() - Tax()) + "\n" +
                "Toplam maaş: " + (salary + Bonus() + YearlyBonus() - Tax());

    }

}