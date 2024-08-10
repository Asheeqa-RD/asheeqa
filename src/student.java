
class student {
  
    public void college(){
        System.out.println("student of SJC");
    }
}

class bca extends student
{
    public void id1(){
       
        System.out.println("student of bca");
        
}
 // public static void main(String [] args){
  //    bca b=new bca();
 //     b.college();
  //    b.id1();
 //     
  //}  
}

class sub extends bca{
    String sub1;
    String sub2;
    
    void displaySub(String sub1,String sub2){
        System.out.print(sub1+" " +sub2);
    }
    public static void main(String [] args){
      sub b=new sub();
      b.college();
      b.id1();
      b.displaySub("java","COA");
    } 
}

