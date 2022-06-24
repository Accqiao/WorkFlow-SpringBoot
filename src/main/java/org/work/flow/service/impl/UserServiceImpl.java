package org.work.flow.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.work.flow.entity.User;
import org.work.flow.service.UserService;
import org.work.flow.mapper.UserMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
* @author Accqiao
* @description 针对表 [user] 的数据库操作 Service 实现 Impl
* @createDate 2022-06-11 03:01:47
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Resource
    private UserMapper mapper;

    @Override
    public User selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return mapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int toInsertOrUpdate(User record) {
        return mapper.toInsertOrUpdate(record);
    }

    @Override
    public int toInsertOrUpdateSelective(User record) {
        return mapper.toInsertOrUpdateSelective(record);
    }

}




