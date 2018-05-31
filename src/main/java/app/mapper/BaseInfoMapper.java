package app.mapper;

import java.util.List;

import app.domain.BaseInfo;

public interface BaseInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BaseInfo record);

    int insertSelective(BaseInfo record);

    BaseInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BaseInfo record);

    int updateByPrimaryKey(BaseInfo record);
    
    List<BaseInfo> getByInfo(String info);
}