import java.util.Scanner;

public class logica{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário bruto");
        float salario = scan.nextFloat();
        scan.nextLine();
        System.out.println("Digite o valor do seu benefícios");
        float beneficios = scan.nextFloat();
        scan.nextLine();

        float valorimposto = 0;

        if(salario >= 0 && salario <= 1100) {
            // imposto de 5.00%
            valorimposto = 0.05F * salario;
        }
        else if (salario >= 1100.01 && salario <= 2500.00){
            //imposto 10.00%
            valorimposto = 0.10F * salario;
        } else {
            //imposto 15.00
            valorimposto = 0.15F * salario;

        }



        float saida = salario - valorimposto + beneficios;
        System.out.println(String.format("%.2f", saida));
    }
}