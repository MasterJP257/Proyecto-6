package clase;

import java.util.Scanner;

public class Clase {

    public static void main(String[] args) {

        Zoo Zool = new Zoo();
        Veterinarian Personal = new Veterinarian();

        Zool.Animales[0] = new Animal();
        Zool.Animales[1] = new Animal();
        Zool.Animales[2] = new Animal();
        Zool.Animales[3] = new Animal();
        Zool.Animales[4] = new Animal();
        Zool.Animales[5] = new Animal();
        Zool.Animales[6] = new Animal();
        Zool.Animales[7] = new Animal();
        Zool.Animales[8] = new Animal();
        Zool.Animales[9] = new Animal();

        String name, type, food;
        int age, aux, c, n = -1, opc;
        boolean vaccinated, sleeping, si = false;
        double salary;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Menu:");
            System.out.println("Tienes: [" + (n + 1) + "] animalitos en tu Zoo.");
            System.out.println("1-. Poner un nuevo animalito");
            System.out.println("2-. Poner nombre");
            System.out.println("3-. Ponerle edad");
            System.out.println("4-. Escojer su tipo de comida y alimentarlo");
            System.out.println("5-. Vacunar");
            System.out.println("6-. Ponerlo a dormir (en el buen sentido)");
            System.out.println("7-. Imprimir todos los datos de un animal por su numero");
            System.out.println("8-. Imprimir todos los animales y sus datos");
            System.out.println("9-. Seleccionar animal por numero");
            System.out.println("10-. Eliminar");
            System.out.println("11-. Inicializar personal");
            System.out.println("0-. Salir");
            System.out.print("Ingresa tu opcion: ");
            opc = sc.nextInt();
            sc.nextLine();
            System.out.println("\n");
            
            switch (opc) {
                case 1: // Crear
                    if (Personal.cuidador == true) {
                        n++;
                        System.out.print("Escribe el tipo animalito #[" + (n + 1) + "]: ");
                        type = sc.nextLine();
                        Zool.Animales[n].setType(type);
                    } else {
                        System.out.println("Primero necesitas un cuidador.");
                    }
                    break;
                case 2:// Nombre
                    if (n != -1) {
                        System.out.print("Escribe el nombre del animalito #[" + (n + 1) + "]: ");
                        name = sc.nextLine();
                        Zool.Animales[n].setName(name);
                    } else {
                        System.out.println("Lo siento no hay animales actualmente");
                    }
                    break;
                case 3:// Edad
                    if (n != -1) {
                        System.out.print("Escribe la edad del animalito #[" + (n + 1) + "]: ");
                        age = sc.nextInt();
                        sc.nextLine();
                        Zool.Animales[n].setAge(age);
                    } else {
                        System.out.println("Lo siento no hay animales actualmente");
                    }
                    break;
                case 4: //Alimentar
                    if (Personal.alimentador == true) {
                        if (n != -1) {
                            System.out.println("Escribe el nombre de tu comida para el animalito");
                            food = sc.nextLine();
                            Zool.Animales[n].setFood(food);
                            Zool.Animales[n].setFed(true);
                            Zool.Animales[n].fed();
                        } else {
                            System.out.println("Lo siento no hay animales actualmente");
                        }
                    } else {
                        System.out.println("Primero necesitas a alguien que alimente");
                    }
                    break;
                case 5: //Vacunar
                    if (Personal.veterinario == true) {
                        if (n != -1) {
                            System.out.println("Hey quieres vacunar a tu animal actual (1 para si)?");
                            aux=sc.nextInt();
                            if(aux==1)
                            Zool.Animales[n].setVaccinated(true);
                            else
                                Zool.Animales[n].setVaccinated(Zool.Animales[n].vaccinated);
                        } else {
                            System.out.println("Lo siento no hay animales actualmente");
                        }
                    } else {
                        System.out.println("Primero necesitas un Veterinario");
                    }
                    break;

                case 6: //Dormir
                    if (n != -1) {
                        System.out.println("Quieres dormirlo o despertarlo? 1 para dormir 0 para despertarlo");
                        aux = sc.nextInt();
                        if (aux == 1) {
                            sleeping = true;
                        } else {
                            sleeping = false;
                        }
                        Zool.Animales[n].setSleeping(sleeping);
                        Zool.Animales[n].sleep();
                    } else {
                        System.out.println("Lo siento no hay animales actualmente");
                    }
                    break;

                case 7: //Imprimir uno
                    if (n != -1) {
                        System.out.println("Escoja el numero del animalito a imprimir sus datos: ");
                        aux = sc.nextInt();
                        aux = aux - 1;

                        if (aux <= n) {
                            System.out.println("Animal numero [" + (aux + 1) + "]: ");

                            System.out.println("Tipo: " + Zool.Animales[aux].type);
                            System.out.println("Nombre: " + Zool.Animales[aux].name);
                            System.out.println("Edad: " + Zool.Animales[aux].age);
                            Zool.Animales[aux].vacunado();
                        } else {
                            System.out.println("Lo siento ese numero no es valido.\nTenemos hasta el numero [" + (n+1) + "]");
                        }
                    } else {
                        System.out.println("Lo siento no hay animales actualmente");
                    }
                    break;

                case 8: //Imprimir todos
                    if (n != -1) {
                        for (c = 0; c <= n; c++) {
                            System.out.println("Animal numero [" + (c + 1) + "]: ");
                            System.out.println("Tipo: " + Zool.Animales[c].type);
                            System.out.println("Nombre: " + Zool.Animales[c].name);
                            System.out.println("Edad: " + Zool.Animales[c].age);
                            Zool.Animales[c].vacunado();
                            System.out.println("\n");
                        }
                    } else {
                        System.out.println("Lo siento no hay animales actualmente");
                    }
                    break;

                case 9: //Cambiar n
                    System.out.println("Escoja el numero del quien quiere cambiar sus datos: ");
                    aux = sc.nextInt();
                    aux = aux - 1;

                    if (aux <= n) {
                        break;
                    }

                case 10: //Eliminar
                    System.out.println("Escoja el numero del animalito a mandar a libertad y limpiar sus datos: ");
                    aux = sc.nextInt();
                    aux = aux - 1;

                    if (aux <= n) {
                        Zool.Animales[aux].setName("Null");
                        Zool.Animales[aux].setType("Null");
                        Zool.Animales[aux].setAge(0);
                        Zool.Animales[aux].setSleeping(false);
                        Zool.Animales[aux].setVaccinated(false);
                        Zool.Animales[aux].setFed(false);
                    } else {
                        System.out.println("Lo siento no hay un animal con ese numero");
                    }
                    break;

                case 11:
                    System.out.println("¿Quieres un Cuidador?(1 para si)");
                    age = sc.nextInt();
                    if (age == 1) {
                        si = true;
                    }
                    Personal.setCuidador(si);
                    si = false;
                    System.out.println("¿Quieres un Veterianrio? (1 para si)");
                    age = sc.nextInt();
                    if (age == 1) {
                        si = true;
                    }
                    Personal.setVeterinario(si);
                    si = false;
                    System.out.println("¿Quieres un Alimentador?(1 para si)");
                    age = sc.nextInt();
                    if (age == 1) {
                        si = true;
                    }
                    Personal.setAlimentador(si);
                    si = false;
                    System.out.println("¿Cuanto deseas pagarles?");
                    salary = sc.nextDouble();
                    Personal.setSalary(salary);
                    break;

                case 0:
                    System.out.println("Hasta luego =D");
                    break;
            }

        } while (opc != 0);
    }
}//Fin de la Clase principal