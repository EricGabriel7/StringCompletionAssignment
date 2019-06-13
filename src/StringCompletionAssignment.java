import java.util.Scanner;

public class StringCompletionAssignment
{
    public static void main( String[] args )
    {
        String name;
        String breed;
        int age;

        System.out.print( "Greetings. What is your pet's name? " );
        //Requesting data
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.next();

        System.out.print( "What kind of animal is " + name + "? " );
        //Setting breed equal to user's answer to prompt
        breed = keyboard.next();
        System.out.print( "How old is " + name + "? ");
        //User's next int answer = age to next be printed
        age = keyboard.nextInt();
        System.out.println( name + " is your " + breed + " and they are " + age );
    }
}