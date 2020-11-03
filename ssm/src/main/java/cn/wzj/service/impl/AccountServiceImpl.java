package cn.wzj.service.impl;

import cn.wzj.domain.Account;
import cn.wzj.mapper.AccountMapper;
import cn.wzj.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {
    /*public void save(Account account) {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            AccountMapper userMapper=sqlSession.getMapper(AccountMapper.class);
            userMapper.save(account);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Account> findAll() {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            AccountMapper userMapper=sqlSession.getMapper(AccountMapper.class);
            List<Account> all = userMapper.findAll();
            sqlSession.close();
            return all;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }*/
    @Autowired
    private AccountMapper accountMapper;
    public void save(Account account) {
       accountMapper.save(account);
    }

    public List<Account> findAll() {
        return accountMapper.findAll();
    }
}
