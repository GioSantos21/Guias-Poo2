/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplos.arreglos;

/**
 *
 * @author Geovanny
 */
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class EjemplosArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        double seguir = 1;
        while (seguir!=0) {
            double desicion = Double.valueOf(JOptionPane.showInputDialog(null,"1- Opción 1."
                    + "\n2- Opción 2."
                    + "\n3- Opción 3."
                    + "\n4- Opción 4."
                    + "\n5- Opción 5."
                    + "\n6- Opción 6."
                    + "\n7- Opción 7."
                    + "\n8- Opción 8."
                    + "\nSi desea salir del programa. Presione <9>"
                    + "\n\n Elija una opción <1-8>: ")).doubleValue();
            while (desicion != 0) {
                if (desicion == 1) { 
                    int edad[] = new int[10];
                    edad[0]=18;
                    edad[1]=19;
                    edad[2]=21;
                    edad[3]=17;
                    edad[4]=19;
                    edad[5]=22;
                    edad[6]=23;
                    edad[7]=24;
                    edad[8]=21;
                    edad[9]=19;
                    int sum = 0;
                    for(int n=0; n<10; n++) {
                            System.out.println("Edad = "+edad[n]);
                            sum+=edad[n];
                    }
                    System.out.println("\nSuma = "+sum);
                    desicion = 0;
                }else if (desicion == 2) {
                    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
                    int edad[] = new int[10];
                    int sum = 0;
                    //captura por teclado de los valores del array
                    for(int n=0; n<10; n++) {
                            System.out.println("Edad = ");
                        try
                        {
                            edad[n] = Integer.valueOf(
                            teclado.readLine()).intValue();
                        }
                            catch(Exception e)
                        {
                            System.out.println("Error! no es número.");
                        }
                        System.out.println();
                        sum+=edad[n];
                    }
                        System.out.println("\nSuma = "+sum);
                        desicion = 0;
                } else if (desicion == 3) {
                    int edad[] = new int[10];
                    int sum = 0;
                    //captura en modo gráfico de los valores del array
                    for(int n=0; n<10; n++) {
                        try
                        {
                            edad[n] = Integer.valueOf(JOptionPane.
                            showInputDialog(null,"Edad "+(n+1)+":", "Arrays",JOptionPane.QUESTION_MESSAGE)).intValue();
                        }
                        catch(Exception e)
                        {
                                JOptionPane.showMessageDialog(null,
                                "Error no es un número","Arrays",
                                JOptionPane.ERROR_MESSAGE);
                        }
                        sum+=edad[n];
                    }
                    JOptionPane.showMessageDialog(null,"Suma = "+sum,
                    "Arrays",JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                } else if (desicion == 4) {
                    String dias[] = {"Lunes", "Martes", "Miércoles",
			"Jueves","Viernes", "Sábado", "Domingo"};
			for(int i = 0 ; i < 7;i++) {
                            System.out.println("Día = "+dias[i]);
			}
                    desicion = 0;
                } else if (desicion == 5){
                    BufferedReader teclado = new BufferedReader(new
                    InputStreamReader(System.in));
                    String nombres[] = new String[4];
                    for(int i = 0 ; i < 4 ;i++){
                        System.out.print("Nombre = ");
                        nombres[i] = teclado.readLine();
                        System.out.println();
                    }
                    System.out.println("\n"
                            + "+---------------------+"
                            + "| Listado de Nombres |"
                            + "+---------------------+");
                    for(int i = 0 ; i < 4 ;i++){
                        System.out.println((i+1)+") "+nombres[i]);
                    }
                    System.exit(0);
                } else if ( desicion == 6) {
                    JTextArea salida = new JTextArea(5,5);
                    salida.setText("Nombres ingresados: \n");
                    String nombres[] = new String[4];
                    for(int i = 0 ; i < 4 ;i++) {
                    nombres[i] = JOptionPane.showInputDialog(null,"Nombre "+(i+1)+" : ","Arrays de String",JOptionPane.QUESTION_MESSAGE);
                    salida.append(nombres[i]+"\n");
                    }
                    JOptionPane.showMessageDialog(null,salida,"Arrays de String",JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                } else if (desicion == 9) {
                  JOptionPane.showMessageDialog(null,"Adios te esperamos pronto...");
                  seguir = 0;
                  desicion =0;
                }
            }
        }
    }
}
