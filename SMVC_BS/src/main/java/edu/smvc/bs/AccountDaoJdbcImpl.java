package edu.smvc.bs;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;

public class AccountDaoJdbcImpl implements AccountDao {
	
	@Bean
	public AccountDao accountDaoJdbc() {
		AccountDaoJdbcImpl bean = new AccountDaoJdbcImpl();
		return bean;
	}
	
	
	@Bean(autowire=Autowire.BY_TYPE)
		public AccountService accountService() {
		AccountServiceImpl bean = new AccountServiceImpl();
		return bean;
	}

	@Override
	public void insert(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(List<Account> accounts) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long accountId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account find(long accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> find(List<Long> accountIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> find(String ownerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> find(boolean locked) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Long, Account> getMap() {
		// TODO Auto-generated method stub
		return null;
	}

}
