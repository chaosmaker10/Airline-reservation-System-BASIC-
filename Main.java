import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<plane> p1=new ArrayList<plane>();
        ArrayList<ticket> db=new ArrayList<ticket>();
        p1.add(new plane("AIRINDIA","UK","CHENNAI","11"));
        p1.add(new plane("EMIRATES","UK","USA","12"));
        p1.add(new plane("AIRINDIA","UK","IRELAND","1"));
        // for(plane a:p1){
        //     a.printg();
        // }
        System.out.println("Enter name");
        String name=sc.nextLine();
        System.out.println("From:");
        String from=sc.nextLine();
        System.out.println("To:");
        String to=sc.nextLine();
        for(plane a:p1){
            if(a.from.equalsIgnoreCase(from) && a.to.equalsIgnoreCase(to)){
                a.printg();
                System.out.println("Enter number of tickets");
                int n=sc.nextInt();
                while(n!=0){
                    ticket t1=new ticket();
                    db.add(t1);
                    t1.bookticket();
                    n--;
                }
            }
        }
        int tcost=0;
        for(ticket a:db){
            tcost+=a.cost;
            a.printticket();
        }
        System.out.println("Total Cost:-"+ tcost);
        // System.out.println(p1.get(0).printg());
    }
}
