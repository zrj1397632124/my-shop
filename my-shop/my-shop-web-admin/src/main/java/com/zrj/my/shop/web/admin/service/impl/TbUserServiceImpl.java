package com.zrj.my.shop.web.admin.service.impl;

import com.zrj.my.shop.domain.TbUser;
import com.zrj.my.shop.web.admin.dao.TbUserDao;
import com.zrj.my.shop.web.admin.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: TbUserServiceImpl
 * @description:
 * @author: zrj
 * @create: 2019-09-26 15:56
 **/
@Service
public class TbUserServiceImpl implements TbUserService {
    @Autowired
    private TbUserDao tbUserDao;
    @Override
    public List<TbUser> selectAll() {
        return tbUserDao.selectAll();
    }

    @Override
    public void insert(TbUser tbUser) {
        tbUserDao.insert(tbUser);
    }

    @Override
    public TbUser selectOne(Long id) {
        return tbUserDao.selectOne(id);
    }

    @Override
    public void updateTbUser(TbUser tbUser) {
        tbUserDao.updateTbUser(tbUser);
    }

    @Override
    public void deleteOne(Long id) {
        tbUserDao.deleteOne(id);
    }

    @Override
    public List<TbUser> selectByUsername(String username) {
        return tbUserDao.selectByUsername(username);
    }
}
