import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.*;

public class SMLTest1
{
    public static void main(String [] args)
    {
        //String word;
       
        String wordCopy;
        int operationCode = 0;
        int operandCode = 0;
        int size = 100;
        int integ = 0;
        int accumulator = 0;
        int instructionCounter = 0;
        int instructionRegister = 0;
        int [] memory = new int[size];
        int [] instruction = new int[size];
        int [] user = new int[size];
        boolean cont = true;    
       
        
        System.out.println();
        System.out.println("*** Welcome to Simpletron ***");
        System.out.println("*** Please enter your program one instruction     ***");
        System.out.println("*** (or data word) at the time. I will display    ***");
        System.out.println("*** the location number and  a question mark (?). ***");
        System.out.println("*** you then type the word for that location.     ***");
        System.out.println("*** Type -99999 to stop entering your program.    ***");
        System.out.println();
        System.out.println();
        
        Scanner input = new Scanner(System.in);
        SML1 obj = new SML1(integ, operandCode, operationCode, size, instructionCounter, instructionRegister);
        
        
        while(cont)
        {
           
            System.out.printf("%02d", instructionCounter);
            System.out.print(" ? ");
            instructionRegister = input.nextInt();
            memory[instructionCounter] = instructionRegister;
            instructionCounter++;
            //instructionRegister = memory[instructionCounter];

            if(instructionRegister == -99999)
            {
                cont = false;
                obj.executionStat();               
            }
            
            else
            {
               // System.out.println("Instruction stored.");
                //instructionRegister = memory[instructionCounter];
                   
            }
        }
                            
                for(int j = 0; j< instructionCounter; j++)
                {                  
                    operationCode = memory[j] / 100;
                    operandCode = memory[j] % 100;
                                        
                    if(operationCode == 10)  
                    {
                        obj.read();
                        user[operandCode] = obj.getInteger();                  
                        System.out.println();
                 
                    }
                    
                    else if(operationCode == 11)  
                    {
                        System.out.println();
                        System.out.print("WRITE ");
                        System.out.print(user[operandCode]);
                        System.out.println();
                    }
                        
                    else if(operationCode == 20)
                    {
                        System.out.print("LOAD ");
                        accumulator = user[operandCode];
                        System.out.print(accumulator);
                        System.out.println();
                    }
                        
                    else if(operationCode == 21)
                    {
                         System.out.print("STORE ");
                         user[operandCode] = accumulator;
                         System.out.print(user[operandCode]);
                         System.out.println();
                    }
                        
                    else if(operationCode == 30)
                    {
                         System.out.print("ADD ");
                         accumulator += user[operandCode];
                         System.out.print(accumulator);
                         System.out.println();
                    }
                        
                    else if(operationCode == 31)
                    {
                         System.out.print("SUBTRACT ");
                         accumulator -= user[operandCode];
                         System.out.print(accumulator);
                         System.out.println();
                    }
                    
                    else if(operationCode == 32)
                    {
                        System.out.print("DIVIDE ");
                        if(user[operationCode] !=0)
                        {
                            accumulator /= user[operationCode];
                            System.out.print(accumulator);
                            System.out.println();
                        }
                        else
                        {
                            obj.Divide0();
                        }                                              
                    }
                    
                    else if(operationCode == 33)
                    {
                        System.out.print("MULTIPLY ");
                        accumulator *= user[operationCode];
                        System.out.print(accumulator);
                        System.out.println();                       
                    }
                        
                    else if(operationCode == 40)
                    {                        
                        System.out.print("BRANCH ");
                        instructionCounter = operandCode;
                        System.out.println();

                    }
                        
                    else if(operationCode == 41)
                    {
                        System.out.print("BRANCHNEG ");
                        if(accumulator < 0)
                        {
                            instructionCounter = operandCode;
                            System.out.println();
                        }
                    }
                        
                    else if(operationCode == 42)
                    {
                        System.out.print("BRANCHZERO ");
                        if(accumulator == 0)
                        {
                            instructionCounter = operandCode;
                            System.out.println();

                        }
                    }
                        
                    else if(operationCode == 43)
                    {
                        System.out.print("HALT "); 
                        System.out.println();
                        obj.executionHalt();
                        
                    }
                }
        
         accumulator = 0;
         instructionCounter =0;
         instructionRegister =0;
         operationCode =0;
         operandCode =0;
        
         System.out.println();
         System.out.printf("%-35s%+05d\n", "accumulator ", accumulator);
         System.out.printf("%-38s%02d\n", "instructionCounter ", instructionCounter);
         System.out.printf("%-35s%+05d\n", "instructionRegister ", instructionRegister);
         System.out.printf("%-38s%02d\n", "operationCode ", operationCode);
         System.out.printf("%-38s%02d\n", "operand ", operandCode);
                           
        } // main
                                       
} 
               
            
                       
            
        
       
        
   
