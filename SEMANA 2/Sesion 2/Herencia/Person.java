package Herencia;

public class Person {

    protected int idPerson;
    protected String personName;
    protected String lastname;
    protected String documentType;
    protected String document;
    protected String email;
    protected String residenceCity;
    protected static int personCounter; 

    //1. Añadir constructor de la clase
    public Person(String personName, String lastname) {
        this.personName = personName;
        this.lastname = lastname;
        //Inicializar la variable idPerson
        //La variable personCounter, cada vez que se crea una instancia de Person
        //se incrementará automaticamente en 1.
        this.idPerson = ++Person.personCounter;
    }
    

    //2. Añadir la función que imprime el objeto
    @Override
    public String toString() {
        /*
        Persona 
            {
                Nombre: valor,
                Apellido: valor,
                Tipo de documento: valor
            }
         */
        return "        {" + "\n              IdPerson: " + idPerson + 
                "\n              Nombre: " + personName + " " + lastname
                + ",\n              Tipo documento: " + documentType
                + ",\n              Número: " + document
                + ",\n              Correo=" + email + ",\n              Ciudad residencia: "
                + residenceCity + "\n        }";
    }

}
