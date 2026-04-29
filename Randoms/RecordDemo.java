import java.util.Objects;

public class RecordDemo{
    private final String name;
    private final int employeeNumber;

    public RecordDemo (String name, int employeeNumber){
        this.name= name;
        this.employeeNumber=employeeNumber;
    }
    public String getName() {
        return name;
    }
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public String toString() {
        return "RecordDemo [name=" + name + ", employeeNumber=" + employeeNumber + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + employeeNumber;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RecordDemo other = (RecordDemo) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (employeeNumber != other.employeeNumber)
            return false;
        return true;
    }

    

    

}