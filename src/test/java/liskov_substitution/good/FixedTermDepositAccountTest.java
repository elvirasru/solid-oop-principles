package liskov_substitution.good;

import liskov_substitution.bad.DepositAccount;
import liskov_substitution.bad.FixedTermDepositAccount;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FixedTermDepositAccountTest {

    @Test
    void should() {
        DepositAccount fixedTermDepositAccount = new FixedTermDepositAccount();

        fixedTermDepositAccount.deposit(BigDecimal.valueOf(100L));

        assertTrue(fixedTermDepositAccount instanceof  DepositAccount);
    }
}