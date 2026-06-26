import java.util.Scanner;

class Demo {

    public String name;
    public String address;
    public int age;
    public float yourNumber;
    public boolean yourAnswer;

    public Demo(String name, String address, int age, float yourNumber, boolean yourAnswer) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.yourNumber = yourNumber;
        this.yourAnswer = yourAnswer;
    }

    public void Display() {
        System.out.println("Your name is " + name);
        System.out.println("Your address is " + address);
        System.out.println("Your age is " + age);
        System.out.println("Your number is " + yourNumber);
        System.out.println("Your answer is " + yourAnswer);
    }

}

public class practice {
    public static void main(String[] args ) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your Name: ");
        String userName = input.nextLine();
        
        System.out.println("Enter your Address: ");
        String userAddress = input.nextLine();
        
        System.out.println("Enter your Age: ");
        int userAge = input.nextInt();

        System.out.println("Enter your favoriate number: ");
        float userNumber = input.nextFloat();

        System.out.println("Enter your answer in boolean: ");
        boolean userAnswer = input.nextBoolean();

        Demo myIdentity = new Demo(userName, userAddress, userAge, userNumber, userAnswer);

        myIdentity.Display();

        input.close();

    }
}