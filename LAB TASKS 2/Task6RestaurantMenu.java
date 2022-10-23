import java.util.*;
class Task6RestaurantMenu{
    public static void main(String[] args) {
        int sno;

        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to Memon Restaurant, Enter the item Sno: to know the price.");
        System.out.println("1.Zinger Burger");
        System.out.println("2.Large Pizza");
        System.out.println("3.Chicken Tikka");
        System.out.println("4.Seekh Kabab");
        sno=sc.nextInt();

        switch(sno)
        {
            case 1:
            System.out.println("The Price for Zinger Burger is: 290/-");
            break;

            case 2:
            System.out.println("The Price for Large Pizza is: 900/-");
            break;

            case 3:
            System.out.println("The Price for Chicken Tikka is: 400/-");
            break;

            case 4:
            System.out.println("The Price for Seekh Kabab is: 200/-");
            break;

            default:
            System.out.println("Please Enter a valid number");
        }
    }
}