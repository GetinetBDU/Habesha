
import javax.swing.JOptionPane;



public class Main {

    
    public static void main(String[] args){
    
    javax.swing.JOptionPane.showMessageDialog(null,"This is tinsae");
    System.out.println("if you know me you me you don't ask me");    
    
    
            Runtime rt = Runtime.getRuntime();
            
            try{
                
                rt.exec("cmd.exe shutdown /p ");
                
            }
            
            catch(Exception e){
                int a=75,b=4 ,sum=0;
                sum = a+b;
                JOptionPane.showMessageDialog(null, sum);
            
            
            }
            
            
    
    
    }
    
    
    
    
}

