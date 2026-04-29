public record RecordDemo1(String name, int employeeNumber) {

    public static final String DEFAULT_EMPLOYEE_NAME="George";

    public RecordDemo1{
        if(employeeNumber<0){
            throw new IllegalArgumentException("employeeNumber cannot be negative");
        }
    }
    public String nameInUpperCase(){
        return name.toUpperCase();
    }

    public static void printWhatever(){
        System.out.println("Whatever");
    }
}
