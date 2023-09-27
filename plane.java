public class plane {
    public String name;
    public String from;
    public String to;
    public String time;
    public String date;
    plane(String name,String from,String to,String time){
        this.name=name;
        this.from=from;
        this.to=to;
        this.time=time;
    }
    plane(){

    }
    public void printg(){
        System.out.println(name+" "+from+" "+to+" "+time);
    }
    // public void setname(String name){
    //     this.name=name;
    // }
    // public void setfrom(String from){
    //     this.from=from;
    // }
    // public void setto(String to){
    //     this.to=to;
    // }
    // public void settime(String time){
    //     this.time=time;
    // }

}
