/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3ej3;
import javax.swing.JOptionPane;
/**
 *
 * @author AALS
 */
public class Proyecto3ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opEntrada,num1,num2 = 0;
        
        
        Object [] options = {" Salir.",
        "Calcular Máximo Común Divisor"," Calcular Mínimo Común Múltiplo"};
        
        opEntrada = JOptionPane.showOptionDialog(null, 
                "Introduzca la operación que desee calcular"
                , "Calculadora de MCD y MCM", JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, options,options[0] );
       
        
        
        switch(opEntrada){
            case 1:
               
                JOptionPane.showMessageDialog(null, 
                        "Bienvenido al cálculo de Máximo Común Divisor", 
                        null, JOptionPane.INFORMATION_MESSAGE);

               
        String message1 = JOptionPane.showInputDialog(null, "Ingrese el primer número", 
                "Primer número", JOptionPane.QUESTION_MESSAGE);
        num1 = comprobarDato(message1);
        
        
        
        String message2 = JOptionPane.showInputDialog(null, "Ingrese el segundo número", 
                "Segundo número", JOptionPane.QUESTION_MESSAGE);
        num2 = comprobarDato(message2);
         
       
        int a = Math.max(num1, num2);
        
        int b = Math.min(num1, num2);   
             
       int res;        
         
        do {
            
            res = b;
           
            b = a%b;
            
            a = res;
        } while (b!=0);
       
        
        
        JOptionPane.showMessageDialog(null,"El M.C.D entre "+num1+" y "+num2+" es: " 
                + res,"MCD",JOptionPane.INFORMATION_MESSAGE);
         
            break;
                
                
            case 2:
                
                JOptionPane.showMessageDialog(null, 
                        "Bienvenido al cálculo de Mínimo Común Múltiplo", 
                        null, JOptionPane.INFORMATION_MESSAGE);
                
                
              
              
                
             
        
        String message3 = JOptionPane.showInputDialog(null, "Ingrese el primer número", 
                "Primer número", JOptionPane.QUESTION_MESSAGE);
        num1 = comprobarDato(message3);
        
        
        String message4 = JOptionPane.showInputDialog(null, "Ingrese el segundo número", 
                "Segundo número", JOptionPane.QUESTION_MESSAGE);
        num1 = comprobarDato(message4);
        
        
                
        int min = Math.min(num1, num2);
        int mcm = 0;
        
        for (int i=1; i<=min; i++) {
            if (num1%i==0 && num2%i==0) {
                
                int mcd = i;
                
                mcm = (num1*num2)/mcd;
            }
        }
        
        
        
        JOptionPane.showMessageDialog(null,"El M.C.D entre "+num1+" y "+num2+" es: " 
                + mcm,"MCD",JOptionPane.INFORMATION_MESSAGE);
        
        
        
                break;
                           
                    
            default:
                 
                
                JOptionPane.showMessageDialog(null, 
                        "Adiós", 
                        null, JOptionPane.INFORMATION_MESSAGE);
        }   
        
    }
    
    public static int comprobarDato(String option){
        int x = 0;
        boolean flag;
        
        do{
            try {
            x = Integer.parseInt(option);
            flag = true;
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Introdujo un dato inválido "+e,
                        "Error", JOptionPane.ERROR_MESSAGE);
                flag = false;
            }
        } while (flag==false);
        
        return x; 
    }
}
      

