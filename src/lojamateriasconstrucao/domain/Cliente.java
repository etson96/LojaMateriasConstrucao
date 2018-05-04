
package lojamateriasconstrucao.domain;


public class Cliente extends Pessoa{
    private int idCliente;
    private EstadoCivil estadoCivil;
    private Sexo sexo;
    private float totalRendimento;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public float getTotalRendimento() {
        return totalRendimento;
    }

    public void setTotalRendimento(float totalRendimento) {
        this.totalRendimento = totalRendimento;
    }
   
    
    
}


enum EstadoCivil{
    Casado,
    Solteiro,
    Viuvo,
    Separado
}

enum Sexo{
    Masculino,
    Feminino
}

