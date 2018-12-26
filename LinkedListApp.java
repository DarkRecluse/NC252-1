package ggwp;

import java.util.Scanner;



public class LinkedListApp {

    public LinkedListApp() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList l = new LinkedList();
        System.out.println("Enter n: " );
        int n = input.nextInt();
        System.out.println("Enter m: " );
        int m = input.nextInt();
        for (int i = 0; i < n; i++) {
            l.insertFirst(new DataItem("Number :" +i));


        }
        while (l.getCount()>1) {
            l.deleteFirst(m);
            l.setID();
            l.displayList();
        }

    }

}
