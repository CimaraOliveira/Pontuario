package pontuarios;

import java.util.ArrayList;
import java.util.List;

public class Medico {

    private String nome;
    private double crm;
    List<Prontuario> prontuarios;

    public Medico() {
        prontuarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCrm() {
        return crm;
    }

    public void setCrm(double crm) {
        this.crm = crm;
    }

    public List<Prontuario> getProntuarios() {
        return prontuarios;
    }

    public void setProntuarios(List<Prontuario> prontuarios) {
        this.prontuarios = prontuarios;
    }
}
