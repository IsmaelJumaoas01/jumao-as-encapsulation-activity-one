import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private Birthday birthday;
    private String address;

    public Person() {
        birthday = new Birthday();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static class Birthday {
        private int day;
        private int month;
        private int year;

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person();
        System.out.print("Enter First Name: ");
        person.setFirstName(scanner.nextLine());

        System.out.print("Enter Middle Name: ");
        person.setMiddleName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        person.setLastName(scanner.nextLine());

        while (true) {
            try {
                System.out.print("Enter Age: ");
                person.setAge(scanner.nextInt());
                scanner.nextLine();

                break; 
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid age.");
                scanner.nextLine(); 
            }
        }

        Birthday birthday = person.getBirthday();

        while (true) {
            try {
                System.out.print("Enter Birthdate Day (e.g., 7): ");
                birthday.setDay(scanner.nextInt());
                scanner.nextLine(); 

                System.out.print("Enter Birthdate Month (e.g., 1 for January): ");
                birthday.setMonth(scanner.nextInt());
                scanner.nextLine();

                System.out.print("Enter Birthdate Year (e.g., 2004): ");
                birthday.setYear(scanner.nextInt());
                scanner.nextLine(); 

                break; 
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter valid day, month, and year.");
                scanner.nextLine();
            }
        }

        System.out.print("Enter Address: ");
        person.setAddress(scanner.nextLine());

        System.out.println("\nPerson Information:");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Middle Name: " + person.getMiddleName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Birthday: " + person.getBirthday().getMonth() + "/" + person.getBirthday().getDay() + "/" + person.getBirthday().getYear());
        System.out.println("Address: " + person.getAddress());

        scanner.close();
    }
}
