// Faça um programa em Java que leia um numero e imprima se 
// ele e positivo, negativo ou nulo (zero).
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int num;
    
    System.out.print("Digite um numero: ");
    num = entrada.nextInt();
    
    if (num > 0)
       System.out.println("O numero "+num+" é positivo.");       
    else {
       if (num < 0) 
          System.out.println("O numero "+num+" é negativo.");
       else
          System.out.println("O numero "+num+" é nulo.");          
    }  
    
    entrada.close();
  }
}