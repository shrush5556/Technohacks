import java.util.Scanner;
import java.util.ArrayList;

public class ToDoList {
    public static void main(String[] args){
    ArrayList<String> ToDoList= new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    while (true)
    {
        System.out.println("\nToDo List Menu: ");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. View List");
        System.out.println("4. Exit");
        System.out.println("\nEnter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter the task to do");
                String newItem = sc.nextLine();
                ToDoList.add(newItem);
                System.out.println("Task added succesfully.....!");
                break;

            case 2:
                System.out.println("Enter the task number to remove");
                int removeIndex = sc.nextInt();
                sc.nextLine();
                if(removeIndex >= 1 && removeIndex <= ToDoList.size())
                {
                    String removedItem = ToDoList.remove(removeIndex - 1);
                    System.out.println("Removed: "+removedItem);
                }
                else{
                    System.out.println("Invalid task number !");
                }
                break;

            case 3:
                System.out.println("\n ToDO list: ");
                for(int i=0 ; i < ToDoList.size() ; i++){
                    System.out.println((i+1)+". "+ToDoList.get(i));
                }
                break;
            
            case 4:
                System.out.println("Exiting the ToDoListprogram.....Bye!!Bye!!");
                break;

            default:
                System.out.println("Invalid choice. Please enter the correct option!!");
                break;
        }
    }
    
    }
}
