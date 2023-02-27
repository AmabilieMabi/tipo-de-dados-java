import java.util.Scanner;

public class mediadenotas {

    public static void main (String[] args){
        int n1, n2, media;

        System.out.println("informe o valor da primeira nota:");
        n1 = input.nextInt();

        System.out.println( "informe o valor da segunda nota:");
        n2 = input.nextInt();
        media = (n1 + n2) /2 ;

        System.out.printf("primeira nota foi = " +n1 );
        System.out.printf("\n segunda nota foi = " +n2 );
        System.out.printf("\n sua media foi = " + media + "\n" );

        if (media >= 8 && media <= 10)
        {
            System.out.print("aluno esta aprovado \n");
            }

            else if (media >=5 && media <= 7){

                System.out.print("aprovado, mas tera que fazer recuperação \n");
            }

            
        }



    }
    
}
