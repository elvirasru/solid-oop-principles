package liskov_substitution.bad;

import java.math.BigDecimal;

public class SavingsAccount implements WithdrawalAccount {
    @Override    
    public void deposit(BigDecimal amount) {
        // Deposit into SavingsAccount
    }

    @Override
    public void withdraw(BigDecimal amount) {
        // Withdraw from SavingsAccount
    }
}
