import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println('\u000C'); //clear the terminal
        System.out.println("Welcome to my portfolio");
        System.out.println("Press 0 to quit");
        System.out.println("Press 1 for Monkey jumpers");
        System.out.println("Press 2 for Calculator");
        System.out.println("Press 3 to display menu");

        Scanner scannerObj = new Scanner(System.in); //create a Scanner Object
        String menuPress = scannerObj.nextLine(); // take user input
        while (!menuPress.equals("0")) //while loop so that 0 returns to menu
        {
            if (menuPress.equals("1")) //run Monkey Jumpers if key press is 1
            {
                System.out.println('\u000C'); //clear the terminal
                System.out.println("Welcome to Monkey jumpers");
                System.out.println("What jumper do you want?");
                //take user input to define the jumper 
                String jumpers = scannerObj.nextLine();
            
                System.out.println("How many jumpers do you want? (integers only)");
                //take user input to define number of jumpers
                String numJumperString = scannerObj.nextLine();
                //convert the String input variable to an int variable
                int numJumper = Integer.parseInt(numJumperString);
            
                MonkeyJumpers jumperObj = new MonkeyJumpers(); //run the Monkey Jumpers class
                jumperObj.runJumpers(numJumper,jumpers);
            }
            
            if (menuPress.equals("2"))
            {
                System.out.println('\u000C'); //clear terminal
                System.out.println("Press 1 to add"); //display menu
                System.out.println("Press 2 to subtract");
                System.out.println("Press 3 to multiply");
                System.out.println("Press 0 to exit Calculator");
                String calcMenu = scannerObj.nextLine(); //take user input as calculator menu var
                                
                while (!calcMenu.equals("0")) //while loop to make 0 the escape
                {
                    if (calcMenu.equals("1")) //add option
                    {
                       System.out.println('\u000C');
                       System.out.println("Which numbers do you want to add?");
                       String sumNum = scannerObj.nextLine();
                       ArrayList<Integer> numList = new ArrayList<>(); //add user input to Arraylist
                       while (!sumNum.equals("=")) //make the = sign the escape to terminate
                       {   
                           
                           int intSumNum = Integer.parseInt(sumNum); // convert sumNum to int
                           numList.add(intSumNum); //add the user input to array numList
                           sumNum = scannerObj.nextLine(); // ask for user input again
                           if (sumNum.equals("=")) //if user enters = then while loop will terminate
                           {
                               break;
                           }
                       }
                                             
                       int sum = 0; //define sum as 0
                       for (int i : numList) //loop through aray numList
                       {
                           sum = sum + i; //add each element of numList together
                       }
                       
                       System.out.println("Your answer is: " + sum); //display answer
                       System.out.println("Press 0 to exit Calculator"); //exit prompt
                       calcMenu = scannerObj.nextLine();
                       System.out.println('\u000C');
                    }
                    
                    if (calcMenu.equals("2")) //subtract option
                    {
                        System.out.println('\u000C');
                       System.out.println("Which numbers do you want to subtract?"); //prompt
                       String sumNum = scannerObj.nextLine(); //take user input
                       ArrayList<Integer> numList = new ArrayList<>(); //user input to array
                       while (!sumNum.equals("="))
                       {   
                           int intSumNum = Integer.parseInt(sumNum); //user input to integer
                           numList.add(intSumNum); //add user input to arraylist
                           sumNum = scannerObj.nextLine(); 
                           if (sumNum.equals("=")) //break code
                           {
                               break;
                           }
                       }
                                             
                       int sum = numList.get(0) + 1; //first element of numList and add 1, idk why but it works
                       for (int i : numList) //loop through and subtract
                       {
                           sum = sum - i;
                       }
                       
                       System.out.println("Your answer is: " + sum);
                       System.out.println("Press 0 to exit Calculator");
                       calcMenu = scannerObj.nextLine();
                       System.out.println('\u000C');
                    }
                    
                    if (calcMenu.equals("3"))
                    {
                       System.out.println('\u000C');
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
                           Product = Product * i;
                       }
                       
                       System.out.println("Your answer is: " + Product);
                       System.out.println("Press 0 to exit Calculator");
                       calcMenu = scannerObj.nextLine();
                       System.out.println('\u000C');
                    }
                    

                }
                
            }
            
            if (menuPress.equals("3")) //display menu option
            {
                System.out.println('\u000C'); //clear the terminal
                System.out.println("Welcome to my portfolio");
                System.out.println("Press 0 to quit");
                System.out.println("Press 1 for Monkey jumpers");
                System.out.println("Press 2 for Calculator");
                System.out.println("Press 3 to display menu");
                menuPress = scannerObj.nextLine();
            }
            
            System.out.println('\u000C'); //clear the terminal
            System.out.println("Welcome to my portfolio");
            System.out.println("Press 0 to quit");
            System.out.println("Press 1 for Monkey jumpers");
            System.out.println("Press 2 for Calculator");
            System.out.println("Press 3 to display menu");
            menuPress = scannerObj.nextLine();
        }
    }
    
}