package Model;

/**
 *
 * @author eliza
 */
public class Cachorro {
    // atributos
    private String peso;
    private String pelagem;
    private String cor;
    private String olho;
    private String orelha;

    //metodo construtor
    public Cachorro(){     
    }
    
    public Cachorro(String peso, String pelagem, String cor, String olho, String orelha) {
        this.peso = peso;
        this.pelagem = pelagem;
        this.cor = cor;
        this.olho = olho;
        this.orelha = orelha;
    }
    //metodos de acesso
    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getOlho() {
        return olho;
    }

    public void setOlho(String olho) {
        this.olho = olho;
    }

    public String getOrelha() {
        return orelha;
    }

    public void setOrelha(String orelha) {
        this.orelha = orelha;
    }

    //metodos de classes
    public void andar(){
            System.out.println("Vamos pegar a coleira?");
	}
	
    public void correr(){
            System.out.println("Marley pega...");
	}
	
    public void pular(){
            System.out.println("Marley pula...");
	}
    
    public void cheirar(){
            System.out.println("Marley fareja...");
	}
    public void brincar(){
            System.out.println("Marley vamos brincar?");
	}
	} 
