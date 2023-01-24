package liskov_substitution.bad;

import java.math.BigDecimal;

public interface DepositAccount {
    void deposit(BigDecimal amount);
}
