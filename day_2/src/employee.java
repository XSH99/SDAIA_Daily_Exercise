public class employee {

    String name  ;
    double salary;
    int hairyYear;
    int year = 2024;

    public employee(String n , double s , int h){

        name = n;
        salary = s;
        hairyYear = h;

    }

    public double getSalary() {return salary * 12;}
    public double calculateHieary() { return year - hairyYear;}

}
