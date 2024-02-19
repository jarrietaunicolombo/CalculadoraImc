import java.util.Scanner;

public class CalculadoraImc
{
    public static void main(String args[]){
        System.out.println("========================");
        System.out.println("*** CALCULO DEL IMC ****");
        System.out.println("========================");
        System.out.println(""); 
<<<<<<< Updated upstream
=======

        float imc = calcularImc();
        System.out.println("Su IMC es: "+imc);
        interpretarImc(imc);
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
>>>>>>> Stashed changes
    }

    public static void interpretarImc(float imc){
        if(imc < 18.5){
            System.out.println("Muy bajo de peso, vez al medico");
        }
        else  if(imc >= 18.5 && imc <= 24.9) {
            System.out.println("Estas bien de peso");
        }
        else  if(imc >= 25 && imc <= 29.9) {
            System.out.println("Estas con sobre peso, realiza ejercicios");
        }
        else{
            System.out.println("Estas obeso, vez al medico");
        }   
    }

}