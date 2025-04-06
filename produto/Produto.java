/**
 * Pacote produto.
 */
package produto;

/**
 * Classe produto.
 */
public class Produto {
    private String nome;

    /**
     * Construtor da classe produto.
     * 
     * @param nome do produto.
     */
    public Produto(String nome) {
        this.nome = nome;
    }

    /**
     * Método acessor get().
     * 
     * @return nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método acessor set().
     * 
     * @param nome do produto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}