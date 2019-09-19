/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2v3;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Geovanny
 */
public class Guia2V3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double seguir = 1;
        while (seguir != 0){
            double desicion = Double.valueOf(JOptionPane.showInputDialog(null,"1- Número Positivo, Negativo o Cero."
                    + "\n2- Número Mayor y Menor de Tres Números."
                    + "\n3- Número Pares del 1 al 100."
                    + "\n4- Año bisiesto."
                    + "\n5- Número del 0 al 1,000 de 100 en 100."
                    + "\n6- Sumatoria de números impares del 101 al 200."
                    + "\n7- Encontrar el factorial de un número."
                    + "\n8- Tablas de multiplicar de la 11 a la 20."
                    + "\n\nSi desea salir del programa. Presione <9>"
                    + "\n\n Elija una opción <1-8>: ")).doubleValue();
            while (desicion!=0){
                if (desicion == 1){
                    double numero = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese un número: ")).doubleValue();
                    String respuesta;
                        if (numero>=1){
                            respuesta = "Positivo";
                        } else if (numero<0){
                            respuesta = "Negativo";
                        } else {
                            respuesta = "Cero";
                        }
                        JOptionPane.showMessageDialog(null,"El número ingresado es: "+respuesta);
                        break; 
                } else if (desicion == 2){
                    double numero1 = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese el primer número: ")).doubleValue();
                    double numero2 = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese el segundo número: ")).doubleValue();
                    double numero3 = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese el tercer número: ")).doubleValue();
                    if (numero1 > numero2 && numero1 > numero3){
                        if (numero2 > numero3){ 
                           JOptionPane.showMessageDialog(null,"El número menor es: "+numero3);
                        } else { 
                           JOptionPane.showMessageDialog(null,"El número menor es: "+numero2);
                        }
                            JOptionPane.showMessageDialog(null,"El número mayor es: "+numero1);   
                    }
                    if (numero2 > numero1 && numero2 > numero3){
                        if (numero1 > numero3){ 
                           JOptionPane.showMessageDialog(null,"El número menor es: "+numero3);
                        } else { 
                           JOptionPane.showMessageDialog(null,"El número menor es: "+numero1);
                        }
                            JOptionPane.showMessageDialog(null,"El número mayor es: "+numero2);   
                    }
                    if (numero3 > numero2 && numero3 > numero1){
                        if (numero2 > numero1){ 
                           JOptionPane.showMessageDialog(null,"El número menor es: "+numero1);
                        } else { 
                           JOptionPane.showMessageDialog(null,"El número menor es: "+numero2);
                        }
                            JOptionPane.showMessageDialog(null,"El número mayor es: "+numero3);   
                    }
                    break;
                } else if (desicion == 3) {
                        JTextArea numeros = new JTextArea(6,15);
                        numeros.setText("Números pares del 1 al 100\n");
                        for (int i=1;i<=100;i++) {
                            if (i%2==0) {
                                numeros.append(""+i+" , ");
                            }
                        }
                        JOptionPane.showMessageDialog(null,numeros);
                        break;
                } else if (desicion == 4){
                    double year = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese un año: ")).doubleValue();
                    if (year%4 == 0 && year%100 != 0 || year%400 == 0){
                    JOptionPane.showMessageDialog(null,"El año ingresado es bisiesto");
                    } else {
                    JOptionPane.showMessageDialog(null,"El año ingresado no es bisiesto");
                    }
                    break;
                } else if (desicion == 5){
                    JTextArea numeross = new JTextArea(6,15);
                    numeross.setText("Números del 0 al 1,000 de 100 en 100\n\n");
                    for (int i=0;i<=1000;i+=100){
                         numeross.append(""+i+"\n");
                    }
                    JOptionPane.showMessageDialog(null,numeross);
                    break;
                }else if (desicion == 6){
                    double contador = 0;
                    for (int i=101;i<200;i+=2){
                        contador = contador + i;
                    }
                    JOptionPane.showMessageDialog(null,"La sumatoria es: "+contador);
                    break;
                } else if (desicion == 7){
                    double contador = 1;
                    double contador2 = 1;
                    double factorial = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese un número: ")).doubleValue();
                    for (int i=1;i<factorial;i++){
                        ++contador;
                        //++contador2;
                       // JOptionPane.showMessageDialog(null,+contador2+" * "+contador+" = "+(contador2*contador));
                        contador2=contador2*contador;
                    }
                    JOptionPane.showMessageDialog(null,"El factorial es: "+contador2);
                    break; 
                } else if (desicion == 8) {
                    JTextArea tablas = new JTextArea(6,15);
                    tablas.setText("Tablas de multiplicar de la 11 a la 20\n");
                        for (int i=11;i<=20;i++) {
                            tablas.append("Tabla del "+i+"\t");
                            double contador = 1;
                            while (contador<11) {
                                tablas.append(i+" * "+contador+" = "+(i*contador)+"\t");
                                ++contador;
                            }
                            tablas.append("\n");
                            
                        }
                     JOptionPane.showMessageDialog(null,tablas);
                     break;
                }else if (desicion == 9) {
                    JOptionPane.showMessageDialog(null,"Adios te esperamos pronto...");
                    seguir = 0;
                    break;
                }
            }
        }
        
    }
    
}
