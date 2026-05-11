package RecordPractice;

public record User(int id, String name, String email) {

    public User{
        if(id<0){
            throw new IllegalArgumentException("ID cannot be negative");
        }
    }
}
