public class Banco;
    

    import java.util.List;
    
    public class Banco {

    }

     private String nome;
     private int numeroBanco;
     
     public int getNumeroBanco() {
        return numeroBanco;
    }
    
    public void setNumeroBanco(int numeroBanco) {
        this.numeroBanco = numeroBanco;
    }
    
    private List<Conta> contas;
     
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Conta> getContas() {
        return contas;
    }
    
    public void setContas(List<Conta> contas) {
        this.contas = contas;

    }

    

