import br.unicap.edi.arqowl.Stack;

public class App {
    public static void main(String[] args) throws Exception {

        Stack<Integer> pilha = new Stack();

        pilha.push(5);

        System.out.println(pilha.pop());
    }
}
