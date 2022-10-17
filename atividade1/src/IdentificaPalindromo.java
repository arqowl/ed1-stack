import br.unicap.edi.arqowl.Stack;
import java.util.Scanner;

public class IdentificaPalindromo {
    public static void main(String[] args) {
        String palavra;
        Stack<Character> pilha = new Stack<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        palavra = in.next(); in.nextLine();

        System.out.println(isPalidromo(palavra));


    }
    
    public static boolean isPalidromo(String palavra){
        Stack<Character> pilha = new Stack<>();
        int conta=0;

        for(int i=0;i<=palavra.length()-1;i++){
            pilha.push(palavra.charAt(i));
        }

        for(int i=0;i<=palavra.length()-1;i++){
            if(palavra.charAt(i)==pilha.pop()){
                conta++;
            }
        }

        if(conta==palavra.length()){
            return true;
        } else{
            return false;
        }
    }


}
