package pontuarios;

import java.util.ArrayList;
import java.util.List;

public class Prontuario {

    List<Consulta> consultas;

    public Prontuario(){
        consultas = new ArrayList<>();
    }
    
    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

}
