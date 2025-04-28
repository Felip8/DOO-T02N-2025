package sistemahotel;

public class Endereco{
    private String cidade;  
    private String bairro;
    private String rua;
    private String numero;
    private String complemento;
    
    public Endereco(String cidade, String bairro, String rua, String numero, 
            String complemento){
    
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }
    
    public String getEndereco(){
        return (rua + ", n°" + numero + ", " + complemento + " - " + bairro +
                ", " + cidade);
        }
    }
