
public class exception {
    
   public static void hello() throws Exception{
        
        System.out.println("within hello()");
        throw new Exception(" print error");
        
    }
    
public static void main(String args[]){
    
    try{
        hello();
    }
    catch(Exception e){
        
        System.out.println(e);
    }
        
    }
}
    
   
        
    

