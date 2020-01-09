package com.zking.P2PLoan.home.service;

import com.zking.P2PLoan.home.mapper.IAccountMapper;
import com.zking.P2PLoan.home.model.AccountModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * create by CSQ on 2020-01-06
 */
@Service
public class IAccountServiceImpl implements IAccountService {

    @Resource
    private IAccountMapper accountMapper;

    @Override
    public AccountModel getAccountInfoByuserName(String userName) {
        return accountMapper.getAccountInfoByuserName(userName);
    }

    @Override
    public int Transfer(BigDecimal balance, int id) {
        return accountMapper.Transfer(balance,id);
    }

    /**
     * 投资的方法
     * @param amount 投资金额
     * @param userName 所登录的用户账户号
     */
    public void investment(BigDecimal amount,String userName) {

        AccountModel accountModel = this.getAccountInfoByuserName(userName);
        if(accountModel!=null && !"".equals(accountModel)){
            BigDecimal usableAmount = accountModel.getUsableAmount();
            if(usableAmount.compareTo(amount)==1){
                BigDecimal subtract = usableAmount.subtract(amount);
                this.Transfer(subtract, accountModel.getId());
            } else if(usableAmount.compareTo(amount)==0){
                BigDecimal subtract = usableAmount.subtract(amount);
                this.Transfer(subtract, accountModel.getId());
            } else {
                System.out.println("没钱了！");
            }
        }
    }

}
