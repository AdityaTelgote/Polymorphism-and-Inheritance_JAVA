/*Question
 * Create the following class
 * + String firstName

+ String lastName

+ int registration

+ int age

+ int daysWorked

+ int vacationDays Taken

+ double salary

+ int yearsWorked

timeToRetirement()

+ vacationTimeLeft()

+ calculateBonus()      Implement the methods:

   public int timeToRetirement(){
      // time to retirement = min(60 - age, 40 - yearsWorked)
   }

   public int vacationTimeLeft(){
       // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
   }

   public int calculateBonus(){
       // bonus = 2.2*salary
   }
 */

package Aditya;

public class Employee {
    private String firstName;
    private String lastName;
    private int registration;
    private int age;
    private int daysWorked;
    private int vacationDaysTaken;
    private double salary;
    private int yearsWorked;

    // Constructor
    public Employee(String firstName, String lastName, int registration, int age, int daysWorked,
                    int vacationDaysTaken, double salary, int yearsWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
    }

    public int timeToRetirement() {
        return Math.min(60 - age, 40 - yearsWorked);
    }

    public int vacationTimeLeft() {
        return (int) ((daysWorked / 360.0) * (30 - vacationDaysTaken));
    }

    public double calculateBonus() {
        return 2.2 * salary;
    }

    // Getters and setters for fields (not implemented here for brevity)

    public static void main(String[] args) {
        // Example of creating an Employee object and using the methods
        Employee employee = new Employee("John", "Doe", 12345, 35, 250, 10, 50000, 15);
        
        System.out.println("Time to Retirement: " + employee.timeToRetirement() + " years");
        System.out.println("Vacation Time Left: " + employee.vacationTimeLeft() + " days");
        System.out.println("Bonus: $" + employee.calculateBonus());
    }
}
