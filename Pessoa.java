/**
 * Classe Pessoa.
 */
public class Pessoa {
    private String nome;

    /**
     * Construtor da classe Pessoa.
     * @param nome da pessoa.
     */
    public Pessoa(String nome) {
        this.nome = nome;
    }

    /**
     * Método acessor get() da classe Pessoa.
     * @return nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método acessor set() da classe Pessoa.
     * @param nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}