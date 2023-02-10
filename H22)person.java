import java.util.Scanner;

class Person {
    private String name;
    private String address;
    private String telephoneNumber;
    private String mobileNumber;
    private String headOfFamily;
    private String id;

    public Person(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, String id) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getHeadOfFamily() {
        return headOfFamily;
    }

    public String getId() {
        return id;
    }
}

class Directory {
    private Person[] people;
    private int numPeople;

    public Directory(int numPeople) {
        this.numPeople = numPeople;
        this.people = new Person[numPeople];
    }

    public void addPerson(int index, Person person) {
        this.people[index] = person;
    }

    public void printDirectory() {
        System.out.println("Directory:");
        System.out.println("Name\tAddress\tTelephone\tMobile\tHead of Family\tID");
        for (int i = 0; i < numPeople; i++) {
            Person person = people[i];
            System.out.println(person.getName() + "\t" + person.getAddress() + "\t" + person.getTelephoneNumber() + "\t" + person.getMobileNumber() + "\t" + person.getHeadOfFamily() + "\t" + person.getId());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int numPeople = sc.nextInt();

        Directory directory = new Directory(numPeople);

        for (int i = 0; i < numPeople; i++) {
            System.out.println("Enter information for person " + (i+1) + ":");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Address: ");
            String address = sc.next();
            System.out.print("Telephone Number: ");
            String telephoneNumber = sc.next();
            System.out.print("Mobile Number: ");
            String mobileNumber = sc.next();
            System.out.print("Head of Family: ");
            String headOfFamily = sc.next();
            System.out.print("Unique ID: ");
            String id = sc.next();
            directory.addPerson(i, new Person(name, address, telephoneNumber, mobileNumber, headOfFamily
}
}
}
