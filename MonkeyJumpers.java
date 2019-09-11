public class MonkeyJumpers
{
    public void runJumpers(int number, String jumpers)
    {
        while (number > -1)
            {
                String space = " ";
                if (number == 0)
                {
                    System.out.println("Zero little" + space + jumpers + space + "jumping on the bed");
                }
                else
                {
                    System.out.println(number + space + "little" + space + jumpers + space + "jumping on the bed");
                    System.out.println("One fell off and broke his head");
                    System.out.println("Mama called the doctor and the doctor said");
                    System.out.println("no more"+ space + jumpers + space + "jumping on the bed.");
                }
                number--;
            }
    }
}