import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        System.out.print('\u000C'); //clear the terminal
        System.out.println("Welcome to my portfolio");
        System.out.println("Press 0 to quit");
        System.out.println("Press 1 for Monkey jumpers");
        System.out.println("Press 2 for Calculator");
        System.out.println("Press 3 to display menu");

        Scanner scannerObj = new Scanner(System.in); //create a Scanner Object
        String menuPress = scannerObj.nextLine(); // take user input
        while (!menuPress.equals("0"))
        {
            if (menuPress.equals("1")) //run Monkey Jumpers if key press is 1
            {
                System.out.print('\u000C'); //clear the terminal
                System.out.println("Welcome to Monkey jumpers");
                System.out.println("What jumper do you want?");
                //take user input to define the jumper 
                String jumpers = scannerObj.nextLine();
            
                System.out.println("How many jumpers do you want? (integers only)");
                //take user input to define number of jumpers
                String numJumperString = scannerObj.nextLine();
                //convert the String input variable to an int variable
                int numJumper = Integer.parseInt(numJumperString);
            
                MonkeyJumpers jumperObj = new MonkeyJumpers();
                jumperObj.runJumpers(numJumper,jumpers);
            }
            
            if (menuPress.equals("2"))
            {
                System.out.print('\u000C');
                Calculator calculate = new Calculator();
                System.out.println("Press 1 to add");
                System.out.println("Press 2 to subtract");
                System.out.println("Press 3 to multiply");
                System.out.println("Press 4 to divide");
                System.out.println("Press 5 for rapid fire mode");
                System.out.println("Press 0 to exit Calculator");
                String calcMenu = scannerObj.nextLine();
                                
                while (!calcMenu.equals("0"))
                {
                    if (calcMenu.equals("1"))
                    {
                       System.out.print('\u000C');
                       System.out.println("Which numbers do you want to add?");
                       String sumNum = scannerObj.nextLine();
                       ArrayList<Integer> numList = new ArrayList<>();
                       while (!sumNum.equals("="))
                       {   
                           
                           int intSumNum = Integer.parseInt(sumNum);
                           numList.add(intSumNum);
                           sumNum = scannerObj.nextLine();
                           if (sumNum.equals("="))
                           {
                               break;
                           }
                       }
                                             
                       int sum = 0;
                       for (int i : numList)
                       {
                           sum = sum + i;
                       }
                       
                       System.out.println("Your answer is: " + sum);
                       System.out.println("Press 0 to exit Calculator");
                       calcMenu = scannerObj.nextLine();
                       System.out.print('\u000C');
                    }
                    
                    if (calcMenu.equals("2"))
                    {
                        System.out.print('\u000C');
                       System.out.println("Which numbers do you want to subtract?");
                       String sumNum = scannerObj.nextLine();
                       ArrayList<Integer> numList = new ArrayList<>();
                       while (!sumNum.equals("="))
                       {   
                           int intSumNum = Integer.parseInt(sumNum);
                           numList.add(intSumNum);
                           sumNum = scannerObj.nextLine();
                           if (sumNum.equals("="))
                           {
                               break;
                           }
                       }
                                             
                       int sum = numList.get(0) + 1;
                       for (int i : numList)
                       {
                           sum = sum - i;
                       }
                       
                       System.out.println("Your answer is: " + sum);
                       System.out.println("Press 0 to exit Calculator");
                       calcMenu = scannerObj.nextLine();
                       System.out.print('\u000C');
                    }
                    
                    if (calcMenu.equals("3"))
                    {
                        System.out.print('\u000C');
                       System.out.println("Which numbers do you want to multiply?");
                       String productList = scannerObj.nextLine();
                       ArrayList<Integer> numList = new ArrayList<>();
                       while (!productList.equals("="))
                       {   
                           
                           int intProduct = Integer.parseInt(productList);
                           numList.add(intProduct);
                           productList = scannerObj.nextLine();
                           if (productList.equals("="))
                           {
                               break;
                           }
                       }
                                             
                       int Product = 0;
                       for (int i : numList)
                       {
                           Product = Product + i;
                       }
                       
                       System.out.println("Your answer is: " + Product);
                       System.out.println("Press 0 to exit Calculator");
                       calcMenu = scannerObj.nextLine();
                       System.out.print('\u000C');
                    }
                    if (calcMenu.equals("4"))
                    {
                        
                    }
                    if (calcMenu.equals("5"))
                    {
                        
                    }
                    System.out.print('\u000C');
                }
            }
            
            if (menuPress.equals("3"))
            {
                System.out.print('\u000C'); //clear the terminal
                System.out.println("Welcome to my portfolio");
                System.out.println("Press 0 to quit");
                System.out.println("Press 1 for Monkey jumpers");
                System.out.println("Press 2 for Calculator");
            }
            System.out.println("Press 3 to display menu");
            menuPress = scannerObj.nextLine();
        }
    }
    
}