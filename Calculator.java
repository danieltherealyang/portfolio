public class Calculator
{
    public void sum(int ... numList)
    {
        int sum = 0;
        for (int num : numList)
        {
            sum = sum + num;
        }
        System.out.println("Your answer is: " + sum);
    }
}