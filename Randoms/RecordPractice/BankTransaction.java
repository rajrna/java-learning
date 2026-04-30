package RecordPractice;

import java.time.LocalDate;
import java.util.List;

//public record BankTransaction(
//        String id,
//        String description,
//        double amount,
//        LocalDate date,
//        List<String> tags) mutable. This is shallow immutable
//        { }

public record BankTransaction(
        String id,
        String description,
        double amount,
        LocalDate date,
        List<String> tags
) {
    public BankTransaction{
        if(amount == 0) throw new IllegalArgumentException("Amount cannot be zero");
        if(id== null|| id.isBlank()) throw new IllegalArgumentException("ID required");
        tags = List.copyOf(tags);
    }

    public boolean isDebit(){ return amount <0;}
    public boolean isCredit(){ return  amount> 0;}
}