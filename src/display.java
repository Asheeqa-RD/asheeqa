
public class display {

    int id;
    String name;
    int sem;
    
    display(int id,String name,int sem){
        this.id=id;
        this.name=name;
        this.sem=sem;
        System.out.println(id+" "+name+" "+sem);
    }
 public static void main(String [] args){
    display n=new display(111,"Jhon",4);
  } 
}


