package org.work.flow.service;

import org.work.flow.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Accqiao
* @description 针对表 [user] 的数据库操作 Service
* @createDate 2022-06-11 03:01:47
*/
public interface UserService extends IService<User> {



    //查询 ByPrimaryKey
    User selectByPrimaryKey(String id);
    //删除 ByPrimaryKey
    int deleteByPrimaryKey(String id);

    //插入一条数据
    int insert(User record);
    int insertSelective(User record);

    //更新一条数据
    int updateByPrimaryKey(User record);
    int updateByPrimaryKeySelective(User record);

    //插入一条数据，如果该数据存在则直接更新该数据
    int toInsertOrUpdate(User record);
    int toInsertOrUpdateSelective(User record);

}
