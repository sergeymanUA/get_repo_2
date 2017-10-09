package edu.smvc.bs;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service("accountService")
@Lazy
public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;

	@Autowired
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	//Configuring Beans Using Constructor Injection
	public AccountServiceImpl(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public AccountServiceImpl() {
		//this.accountDao = accountDao;
	}

	//@Override
	public void transferMoney(long sourceAccountId, long targetAccountId, double amount) {
		Account sourceAccount = accountDao.find(sourceAccountId);
		Account targetAccount = accountDao.find(targetAccountId);
		sourceAccount.setBalance(sourceAccount.getBalance() - amount);
		targetAccount.setBalance(targetAccount.getBalance() + amount);
		accountDao.update(sourceAccount);
		accountDao.update(targetAccount);
	}

	//@Override
	public void depositMoney(long accountId, double amount) throws Exception {
		Account account = accountDao.find(accountId);
		account.setBalance(account.getBalance() + amount);
		accountDao.update(account);
	}

	//@Override
	public Account getAccount(long accountId) {
		return accountDao.find(accountId);
	}

	public Map<Long, Account> getMap() {
		return accountDao.getMap();
	}
}
