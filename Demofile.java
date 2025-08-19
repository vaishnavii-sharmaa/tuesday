public class Demofile {
    int salary;

    public Demofile(int salary){
        this.salary = salary;
    }

    public static void main(String[] args) {
        int salary = 500000;
        System.out.println(salary);

        Demofile d1 = new Demofile(40000);
        System.out.println(d1.salary);
    }
}

