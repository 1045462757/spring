package com.example.dao;

import com.example.domain.Account;

import java.util.List;

/**
 * 账户的持久层接口
 */
public interface AccountDao {
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
     * 根据名称查询账户
     *
     * @param accountName
     * @return
     */
    Account findAccountByName(String accountName);
}
