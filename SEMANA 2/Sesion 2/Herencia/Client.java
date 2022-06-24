package Herencia;

public class Client extends Person{
    private int idClient;
    private boolean vipCategory;
    private static int clientCounter;
    
    public Client(boolean vipCategory, String personName, String lastname, String documentType, String document, String email, String residenceCity) {
        super(personName, lastname, documentType, document, email, residenceCity);
        this.vipCategory = vipCategory;
        this.idClient = ++Client.clientCounter;
    }

    @Override
    public String toString() {
        return "        {" + "\n              IdPerson: " + idPerson
                + ",\n              IdCliente: " + idClient
                + ",\n              Nombre: " + personName + " " + lastname
                + ",\n              Tipo documento: " + documentType
                + ",\n              Número: " + document
                + ",\n              Cliente preferencial: " + vipCategory
                + ",\n              Correo: " + email
                + ",\n              Ciudad residencia: " + residenceCity + "\n        }";
    }
    
    
}
