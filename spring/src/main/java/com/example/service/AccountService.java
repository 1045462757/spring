package com.example.service;

import com.example.domain.Account;

import java.util.List;

public interface AccountService {

    /**
     * 查询所有账户
     *
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 查找一个账户
     *
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 保存账户
     *
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 更新账户
     *
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 删除账户
     *
     * @param accountId
     */
    void deleteAccount(Integer accountId);

    /**
     * 转账
     *
     * @param sourceName
     * @param targetName
     * @param money
     */
    void transfer(String sourceName, String targetName, Float money);
}
