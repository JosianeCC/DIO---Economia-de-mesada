import java.util.Scanner;

public class calculoMesada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        int meses = 1;

        double economia = 0;

        
        System.out.println("Informe o número de meses que deseja economizar: ");

        meses = leitor.nextInt();

        for(mesada = entrada; mesada >= entrada; entrada++){
            
            economia = meses * entrada;
            
        }
            
        System.out.println("Em " + meses + " meses você economizou: " + economia);
        
     
      
    }   
}
