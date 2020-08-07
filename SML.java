import java.util.Scanner;


public class SML
{
    private String word;
    private int index = 100;
    private String [] array;
    private String s;
    
    public SML(String word)
    {
        this.word = "";
        this.s = s;
       // this.index = index;
       // this. [] array = [] array;
    }
    
    public void startUP(String word)
    {
       Scanner input = new Scanner(System.in);
        
       array = new String[index];
        
       int count = 0;
       int num = 0;
        
        //NumberFormat formatter = new DecimalFormat("00");  
        // ----> 01
        String str = String.format("%02d", count);
        
       while(input.word != "-99999")
       {
           for(int i=0; i <100; i++)
           {
               //String.format("%02d ", (count+1));
               //String s = formatter.format(1);
               //System.out.printf("%s%d ", (count+1));
               //if()
               //{
                   
               //}
               System.out.printf("%s %n ", count+1, str);
               array[i] = input.next(); 
              
           }
       }
        
      input.close();
       
    }
    
   /* public String Print()
    {
        //System.out.println();
    }
            */          
}
    
    
