import produto.Produto;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana");
        Produto produto = new Produto("Produto A");

        System.out.println("Pessoa: " + pessoa.getNome());
        System.out.println("Produto: " + produto.getNome());

        try {
            System.out.println(divide(10, 0)); // Exceção é tratada.
        } catch (ArithmeticException ae) {
            System.out.println("ERRO aritmético!"); // É exiba a mensagem de erro.
        } catch (Exception e) {
            System.out.println("ERRO genérico"); // É exiba a mensagem de erro.
        } finally {
            System.out.println("FIM DO PROGRAMA"); // Sempre será exibida a mensagem, ocorrendo erro ou não.
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
