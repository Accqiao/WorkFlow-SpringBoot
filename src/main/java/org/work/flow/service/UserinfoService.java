package org.work.flow.service;

import org.work.flow.entity.Userinfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Accqiao
* @description 针对表 [userinfo] 的数据库操作 Service
* @createDate 2022-06-11 03:02:13
*/
public interface UserinfoService extends IService<Userinfo> {



    //查询 ByPrimaryKey
    Userinfo selectByPrimaryKey(String id);
    //删除 ByPrimaryKey
    int deleteByPrimaryKey(String id);

    //插入一条数据
    int insert(Userinfo record);
    int insertSelective(Userinfo record);

    //更新一条数据
    int updateByPrimaryKey(Userinfo record);
    int updateByPrimaryKeySelective(Userinfo record);

    //插入一条数据，如果该数据存在则直接更新该数据
    int toInsertOrUpdate(Userinfo record);
    int toInsertOrUpdateSelective(Userinfo record);

}
