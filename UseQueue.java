import java.util.Scanner;

class Node {
    public int data;

    public Node next;

}

class Structure {
    public Node start;
    public Node last;

    Structure() {
        start = null;
        last = null;
    }

    void addItem(int val) {
        Node newnode = new Node();

        if (start == null) {
            newnode.data = val;
            newnode.next = null;
            start = newnode;
            last = newnode;
        } else {
            newnode.data = val;
            newnode.next = null;

            last.next = newnode;
            last=newnode;


            System.out.println("Item is Added");
        }
    }

    void deleteFrontNode(){
        if(start!=null){
            start=start.next;

        }
        else{
            System.out.println("Queue is empty ");
        }
    }

    void display(){
        Node temp=start;
       while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
       }
    }
}

public class UseQueue {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Structure S=new Structure();

        while(true){
            System.out.print("Enter value : ");
            int v=sc.nextInt();

            S.addItem(v);

            System.out.print("Do you want to continue :");
            String choise =sc.next();

            if(choise.equals("N")|| choise.equals("n"))
            break;

        }

        S.display();

        S.deleteFrontNode();
        S.deleteFrontNode();

        System.out.println("After deleting :");
        S.display();
    }

}


/*
 * import java.util.*;

class Node {
    public int data;
    public Node next;
}

class Structure {
    public Node start;
    public Node last;

    Structure() {
        start = null;
        last = null;
    }

    void addItem(int val) {
        Node newnode = new Node();
        if (start == null) {
            newnode.data = val;
            newnode.next = null;
            start = newnode;
            last = newnode;
        } else {
            newnode.data = val;
            newnode.next = null;
            last.next = newnode;
            last = newnode;
        }

        System.out.println("Item is added ! ");

    }

    void delFrontNode() {
        if (start != null)
            start = start.next;
        else
            System.out.println("Queue is empty now !");
    }

    void display() {
        Node temp = start;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

class UserQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Structure obj = new Structure();
        while (true) {
            System.out.println("Enter value : ");
            int v = sc.nextInt();

            obj.addItem(v);

            System.out.println("Do you want to continue :");
            String choice = sc.next();
            if (choice.equals("N") || choice.equals("n"))
                break;
        }

        obj.display();

        obj.delFrontNode();
        obj.delFrontNode();

        obj.display();

    }
}
 */