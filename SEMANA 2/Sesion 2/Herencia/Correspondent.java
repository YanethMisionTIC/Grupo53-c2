
package Herencia;

public class Correspondent extends Employee{
    private int idCorrespondent;
    private static int correspondentCounter;
    private String vehicleType;

    public Correspondent(String vehicleType, double salary, boolean socialSecurity, String[] endowment, String personName, String lastname) {
        super(salary, socialSecurity, endowment, personName, lastname);
        this.vehicleType = vehicleType;
        this.idCorrespondent = ++Correspondent.correspondentCounter;
    }

    @Override
    public String toString() {
        return "Correspondent{" + "idCorrespondent=" + idCorrespondent + ", vehicleType=" + vehicleType + '}';
    }
    
    
}
