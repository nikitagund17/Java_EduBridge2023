import java.util.Scanner;

class UseStack {
    int arr[];

    int top;

    UseStack() {
        arr = new int[10];
    }

    public boolean isOverFlow() {
        if (top > 9) {
            System.out.println("StackOverFlow");
            return true;
        }
        return false;

    }

    public void addItem(int item) {
        if (!isOverFlow()) {
            top++;
            arr[top] = item;
        }

    }

    public boolean isEmpty() {
        if (top < 0) {
            System.out.println("Stack is Empty");
            return true;
        }

        return false;
    }

    public int DeleteItem() {
        int h = arr[top];
        if (!isEmpty()) {

            return arr[top--];
        }

        return h;

    }

}

class StackArray {

    public static void main(String[] args) {
        UseStack US = new UseStack();
        Scanner sc = new Scanner(System.in);
        int choise;

        while (true) {
            System.out.println("1: Add\n2: Delete\n3: List\n4: Exit");
            System.out.print("Enter ur choice: ");
            choise = sc.nextInt();

            switch (choise) {
                case 1:
                    System.out.print("\nEnter the top element:");
                    int h = sc.nextInt();
                    US.addItem(h);

                    break;

                case 2:
                    int m = US.DeleteItem();
                    System.out.println(m + " is deleted");
                    break;

                case 3:
                    for (int i = US.top; i > 0; i--) {
                        System.out.println(US.arr[i] + "\t");
                    }
                    break;

                case 4:
                    System.exit(0);
                    break;

            }

        }

    }

}


/*import java.util.*;

class UserStack {
    int arr[];
    int top;

    UserStack() {
        arr = new int[10];
        top = -1;
    }

    public boolean isOverFlow() {
        if (top > 9) {
            System.out.println("Stack OverFlow");
            return true;
        }
        return false;
    }

    public void addItem(int tm) {
        if (!isOverFlow()) {
            top++;
            arr[top] = tm;
        }

    }

    public boolean isEmpty() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    }

    public void deleteItem() {
        if (!isEmpty()) {
            top--;
        }

    }

}

class StackArray {

    public static void main(String[] args) {
        int choice;
        UserStack u = new UserStack();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("1: Add \n 2:Delete \n 3:List\n 4:Exit ");
            System.out.println("Enter your choice :");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nEnter the top element:  ");
                    int h = sc.nextInt();
                    u.addItem(h);
                    break;
                case 2:
                    u.deleteItem();
                    System.out.println("item is deleted !");
                    break;
                case 3:
                    for (int i = u.top; i >= 0; i--) {
                        System.out.print(u.arr[i] + "\t");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

} */