import java.util.Scanner;

public class CalculadoraImc
{
    public static void main(String args[]){
        System.out.println("========================");
        System.out.println("*** CALCULO DEL IMC ****");
        System.out.println("========================");
        System.out.println(""); 

        float imc = calcularImc();
        System.out.println("Su IMC es: "+imc);
    }

    public static float calcularImc(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite su peso en kg: ");
        float peso = teclado.nextFloat();
        System.out.print("Digite su altura en mts: ");
        float altura = teclado.nextFloat();
        if(peso <= 0 || altura <= 0){
            System.out.println("El peso y la altura deben ser mayores a 0");
            return 0;
        }
        return peso / (altura * altura);
    }

}