package RecordPractice;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
    static void main() {
        BankTransaction tx = new BankTransaction(
                "01",
                "Coffee",
                -50,
                LocalDate.now(),
                List.of("food","daily")
        );
        BankTransaction tx2 = new BankTransaction("TXN-001", "Coffee shop", -4.50, LocalDate.now(), List.of("food", "daily"));
        tx.equals(tx2);

        System.out.println(tx);

        List<BankTransaction> transactions = List.of(tx,tx2);

        double totalSpent = transactions.stream()
                .filter(BankTransaction::isDebit)
                .mapToDouble(BankTransaction::amount)
                .sum();

        System.out.println(totalSpent);

        Map<String, List<BankTransaction>> byTag = transactions.stream()
                .collect(Collectors.groupingBy(t->t.tags().get(0)));
    }
}
