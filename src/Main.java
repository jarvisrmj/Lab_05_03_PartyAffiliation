public class Main
{
    public static void main(String[] args)
    {
        String party = "R";
        System.out.println("enter your party [R,D,I]");
        if (party.equalsIgnoreCase("R"))
            System.out.println("You get a Republican Elephant");
        else if (party.equalsIgnoreCase("D"))
            System.out.println("You get a Democratic Donkey");
        else if (party.equalsIgnoreCase("I"))
            System.out.println("You get an Independent Man");
        else
            System.out.println("You are a part of a different party");

    }
}