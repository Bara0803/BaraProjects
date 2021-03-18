package org.example.rwitter.service;

import org.example.rwitter.model.Account;

import java.util.List;

public interface AccountService {
void createAccount(Account account);
void deleteAccount(Account account);
void updateAccount(Account account);
List<Account> getAllAccounts();

}
