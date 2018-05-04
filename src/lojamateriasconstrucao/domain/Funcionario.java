
package lojamateriasconstrucao.domain;


public class Funcionario extends Pessoa {
    private int idFuncionario;
    private float salario;
    private float comissao;
    private boolean estado;
    private String nomeUtilizador;
    private String senha;
    private CarteiraProfissional carteiraprofissional;

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNomeUtilizador() {
        return nomeUtilizador;
    }

    public void setNomeUtilizador(String nomeUtilizador) {
        this.nomeUtilizador = nomeUtilizador;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public CarteiraProfissional getCarteiraprofissional() {
        return carteiraprofissional;
    }

    public void setCarteiraprofissional(CarteiraProfissional carteiraprofissional) {
        this.carteiraprofissional = carteiraprofissional;
    }

    
}
