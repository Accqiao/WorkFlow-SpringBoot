package org.work.flow.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.work.flow.entity.Userinfo;
import org.work.flow.service.UserinfoService;
import org.work.flow.mapper.UserinfoMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
* @author Accqiao
* @description 针对表 [userinfo] 的数据库操作 Service 实现 Impl
* @createDate 2022-06-11 03:02:13
*/
@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo>
    implements UserinfoService{

    @Resource
    private UserinfoMapper mapper;

    @Override
    public Userinfo selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Userinfo record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Userinfo record) {
        return mapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Userinfo record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Userinfo record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int toInsertOrUpdate(Userinfo record) {
        return mapper.toInsertOrUpdate(record);
    }

    @Override
    public int toInsertOrUpdateSelective(Userinfo record) {
        return mapper.toInsertOrUpdateSelective(record);
    }

}




