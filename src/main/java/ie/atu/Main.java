package ie.atu;

public class Main {
    public static void main(String[] args)
    {
        Person myPerson = new Person("Tyrese", "Athlone", "0899785456");
        System.out.println(myPerson.toString());
        Customer myCustomer = new Customer("TJ", "DUBLIN", "987654321", "28105", true);
        System.out.println(myCustomer.toString());
    }
}