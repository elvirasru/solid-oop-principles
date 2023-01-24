package liskov_substitution.bad;

import java.math.BigDecimal;

public class FixedTermDepositAccount implements DepositAccount {
    @Override
    public void deposit(BigDecimal amount) {
        // Deposit into this account
    }

}
