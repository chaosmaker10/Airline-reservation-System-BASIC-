import java.util.*;
public class ticket {
    public String tickets;
    public String name;
    public int cost;
    public int no;
    final int seats[]=new int[10];
    ticket(){
        System.out.println("Lets start Booking!!");
    }
    public void bookticket(){
        // int seats[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the passenger");
        String name=sc.nextLine();
        for(int i=0;i<10;i++){
            if(seats[i]==0)
                System.out.println(i+"->These seats are free");
        }
        System.out.println("Enter seat number");
        int s=sc.nextInt();
        seats[s]++;
        setname(name);
        setno(s);
        setcost(1000);
    }
    public void setname(String name){
        this.name=name;
    }
    public void setno(int no){
        this.no=no;
    }
    public void setcost(int cost){
        this.cost=cost;
    }
    public void printticket(){
        System.out.println(name+" "+no+" "+cost);
    }
}
