package clase;

public class Veterinarian {

    String name;
    boolean cuidador, veterinario, alimentador;
    double salary;

    public Veterinarian(boolean cuidador, boolean veterinario, boolean alimentador, double salary) {
        this.cuidador = cuidador;
        this.veterinario = veterinario;
        this.alimentador = alimentador;
        this.salary = salary;
    }

    Veterinarian() {

    }

    public void setCuidador(boolean cuidador) {
        this.cuidador = cuidador;
    }

    public void setVeterinario(boolean veterinario) {
        this.veterinario = veterinario;
    }

    public void setAlimentador(boolean alimentador) {
        this.alimentador = alimentador;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}//Fin de la clase Veterinarian