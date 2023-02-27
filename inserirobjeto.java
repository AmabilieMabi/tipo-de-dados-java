import java.util.Scanner; 


public class inserirobjeto {

    public static void main (String[] args) { 


        Scanner input = new Scanner (System.in);
        int base, altura, area;

        System.out.println("informe o valor da base:");
        base = input.nextInt();

        System.out.println("informe o valor da altura:");
        altura = input.nextInt();
    

        area = base * altura;

     System.out.printf("A area de um retangulo de base = " + base);
     System.out.printf("\n a altura de = " + altura);

     
     System.out.printf("\n é = " + area + "\n");

    }

}
