package Herencia;

public class Employee extends Person {

    //1. Definimos los atributos propios de esta clase
    protected int idEmployee;
    protected double salary;
    protected boolean socialSecurity;
    protected String[] endowment = new String[2];
    protected static int employeeCounter;

    //2. Añadimos el constructor de la clase
    public Employee(double salary, boolean socialSecurity, String[] endowment, String personName, String lastname) {
        super(personName, lastname);
        this.salary = salary;
        this.socialSecurity = socialSecurity;
        this.endowment = endowment;
        this.idEmployee = ++Employee.employeeCounter;
    }

    //3. Función que imprime el objeto de esta clase
    //Clic secundario > Insert code > toString()
    public String showDataArray(){
        //endowment.length obtiene la longitud del array
        String item = "";
        for (int i = 0; i < endowment.length; i++) {
            item = endowment[i];
        }
        return item;
    }
    
    @Override
    public String toString() {
        
        
        return "        {" + "\n              IdPerson: " + idPerson
                + ",\n              IdEmpleado: " + idEmployee
                + ",\n              Nombre: " + personName + " " + lastname
                + ",\n              Tipo documento: " + documentType
                + ",\n              Número: " + document
                + ",\n              Salario: " + salary
                + ",\n              ARL: " + socialSecurity
                + ",\n              Correo: " + email
                + ",\n              Dotación: " + showDataArray()
                + ",\n              Ciudad residencia: "
                + residenceCity + "\n        }";
    }
}
