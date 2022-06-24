package Herencia;

public class Manager extends Employee{
    private int idManager;
    private static int manegerCounter;

    public Manager(double salary, boolean socialSecurity, String[] endowment, String personName, String lastname) {
        super(salary, socialSecurity, endowment, personName, lastname);
        this.idManager = ++Manager.manegerCounter;
    }

    @Override
    public String toString() {
        return "        {" + "\n              IdPerson: " + idPerson
                + ",\n              IdEmpleado: " + idEmployee
                + ",\n              Gerente N°: " + idManager
                + ",\n              Nombre: " + personName + " " + lastname
                + ",\n              Tipo documento: " + documentType
                + ",\n              Número: " + document
                + ",\n              Salario: " + salary
                + ",\n              ARL: " + socialSecurity
                + ",\n              Correo: " + email
                + ",\n              Dotación: " + super.showDataArray()
                + ",\n              Ciudad residencia: "
                + residenceCity + "\n        }";
    }
    
    
   
    
}
