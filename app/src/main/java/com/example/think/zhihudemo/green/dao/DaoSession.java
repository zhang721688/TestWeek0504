package com.example.think.zhihudemo.green.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.think.zhihudemo.green.entity.MsgGreenInfo;

import com.example.think.zhihudemo.green.dao.MsgGreenInfoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig msgGreenInfoDaoConfig;

    private final MsgGreenInfoDao msgGreenInfoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        msgGreenInfoDaoConfig = daoConfigMap.get(MsgGreenInfoDao.class).clone();
        msgGreenInfoDaoConfig.initIdentityScope(type);

        msgGreenInfoDao = new MsgGreenInfoDao(msgGreenInfoDaoConfig, this);

        registerDao(MsgGreenInfo.class, msgGreenInfoDao);
    }
    
    public void clear() {
        msgGreenInfoDaoConfig.clearIdentityScope();
    }

    public MsgGreenInfoDao getMsgGreenInfoDao() {
        return msgGreenInfoDao;
    }

}
