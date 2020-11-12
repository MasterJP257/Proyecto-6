package clase;

public class Animal {

    String name, type, food = "food";
    int age;
    boolean vaccinated, sleeping, fed;

    public Animal(String name, String type, int age, boolean vaccinated, boolean sleeping, boolean fed) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.vaccinated = vaccinated;
        this.sleeping = sleeping;
        this.fed = fed;
    }

    Animal() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public void setSleeping(boolean sleeping) {
        this.sleeping = sleeping;
    }

    public void setFed(boolean fed) {
        this.fed = fed;
    }
    
    public void fed() {
        System.out.println(fed == true ? "Ya comio" : "No a comido hoy");
        System.out.print("Y tiene para comer: ");
        System.out.println(food.equals("food")==true? "Comida marca CaliMax": food);
    }

    public void sleep() {
        System.out.println(name + "is sleeping");
    }

    public void vacunado(boolean vaccinated) {
        System.out.println(vaccinated == true ? "Esta vacunado" : "No esta vacunado");
    }

    public void vacunado() {
        System.out.println(vaccinated == true ? "Esta vacunado" : "No esta vacunado");
    }
}//Fin de la clase Animal