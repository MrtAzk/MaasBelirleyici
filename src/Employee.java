public class Employee {

    public String name;
    public int salary;
    public int workhours;
    public int hireYear;



    public Employee(String name,int salary,int workhours,int hireYear) {

        this.name=name;
        this.salary=salary;
        this.workhours=workhours;
        this.hireYear=hireYear;

    }

    public double tax(){
        if (salary<1000){
            return 0;
        }else {
            return salary *0.03;
        }
    }

    public int bonus(){
        if (workhours>40){
            return (workhours-40)*30;
        }else {
            return 0;
        }
    }

    public double raiseSalary(){
        int year =2021;

        int raiseYear=year-hireYear;

        if (raiseYear<10){
            return salary * 0.05;
        } else if (raiseYear >= 10 && raiseYear < 20) {
            return salary * 0.10;
            
        } else if (raiseYear>=20) {
            return salary * 0.15;
        }
        return 0;
    }

    public double totalSalary() {
        return salary + bonus() + raiseSalary() - tax();
    }


    public String toString() {
        return "Adı: " + name + "\n" +
                "Maaşı: " + salary + "\n" +
                "Çalışma Saati: " + workhours + "\n" +
                "Başlangıç Yılı: " + hireYear + "\n" +
                "Vergi: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Maaş Artışı: " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş: " + (salary + bonus() - tax()) + "\n" +
                "Toplam Maaş: " + totalSalary();
    }
}