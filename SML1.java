import java.util.Scanner;

public class SML1
{
   // private String word;
 
   //
  // private String word;
  // private String wordCopy;
  private int integer = 0;
  private int oppCode = 0;
  private int oppAnd = 0;
  private int max = 100;
  //private int[] mem;
  private int IR = 0;
  private int IC = 0;
    
  private int acc = 0;
  //private int[max] mem;
    
  public SML1()
  {
      this.integer = 0;     
      this.oppAnd = 0;
      this.oppCode = 0;
      this.max = 100;
      this.IC = 0;
      this.IR = 0;
  }
    
  public SML1(int integer, int oppAnd, int oppCode, int max, int IC, int IR)
  {
      this.integer = integer;     
      this.oppAnd = oppAnd;
      this.oppCode = oppCode;
      this.max = max;
      this.IC = IC;
      this.IR = IR;
   
  }
    
  public void executionStat()
  {
      System.out.println();
      System.out.println("*** Program loading completed ***");
      System.out.println("*** Program execution begins  ***");
      System.out.println();
  }
    
  public void executionHalt()
  {
      System.out.println();
      System.out.print("*** Simpletron execution terminated ***");
      System.out.println();
  }
  
  public void Divide0()
  {
      System.out.println();
      System.out.print("*** Attempt to divide by Zero ***");
      System.out.print("*** Simpletron execution abnormally terminated ***");
      System.out.println();
  }
  
  public void setInteger(int integer)
  {
      this.integer = integer;
  }
  
  public int getInteger()
  {
      return integer;
  }
    
  public void read()
  {
      Scanner read = new Scanner(System.in);
      
     
      System.out.print("Enter an Integer "); 
      
      int hold = read.nextInt();
      setInteger(hold);
      
         
      System.out.println();
  }
    
  public void write()
  {
      
  }
    
    
  public void load()
  {
      
  }
    
  public void add()
  {
      
  }
  
    
 // public void
    
}