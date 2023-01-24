package liskov_substitution.bad;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private WithdrawalAccount account;

    public BankingAppWithdrawalService(WithdrawalAccount account) {
        this.account = account;
    }

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }
}
