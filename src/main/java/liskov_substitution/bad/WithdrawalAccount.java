package liskov_substitution.bad;

import java.math.BigDecimal;

public interface WithdrawalAccount {
    void deposit(BigDecimal amount);

    /**
     * Reduces the account balance by the specified amount
     * provided given amount > 0 and account meets minimum available
     * balance criteria.
     *
     * @param amount
     */
    void withdraw(BigDecimal amount);

}
