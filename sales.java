/*Question
 * create a sales rep class that inherits the original employee class
The arrow used means inheritance in class diagrams  Employee

+ String firstName

+ String lastName

+ int registration

+ int age

+ int daysWorked

+ int vacationDays Taken

+ double salary

+ int yearsWorked

+ timeToRetirement()

vacationTimeLeft()

+ calculateBonus()

A

SalesRep

double salesMade

+ calculateComission()
 */

package Aditya;

public class sales {
    private String firstName;
    private String lastName;
    private int registration;
    private int age;
    private int daysWorked;
    private int vacationDaysTaken;
    private double salary;
    private int yearsWorked;

    // Constructor
    public sales(String firstName, String lastName, int registration, int age, int daysWorked,
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
}

