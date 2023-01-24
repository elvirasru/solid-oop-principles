package liskov_substitution.bad;

import java.math.BigDecimal;

public class CurrentAccount implements WithdrawalAccount {
    @Override
    public void deposit(BigDecimal amount) {
        // Deposit into CurrentAccount
    }

    @Override
    public void withdraw(BigDecimal amount) {
        // Withdraw from CurrentAccount
    }
}
