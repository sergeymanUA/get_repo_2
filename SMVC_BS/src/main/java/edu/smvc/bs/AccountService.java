package edu.smvc.bs;


import java.util.Map;

public interface AccountService {
    public void transferMoney(long sourceAccountId, long targetAccountId, double amount);

    public void depositMoney(long accountId, double amount) throws Exception;

    public Account getAccount(long accountId);

    public Map<Long, Account> getMap();
}
