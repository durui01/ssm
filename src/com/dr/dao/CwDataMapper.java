package com.dr.dao;

import com.dr.vo.CwData;
import java.util.List;
import java.util.Map;

public interface CwDataMapper {
    int deleteByPrimaryKey(String dataid);

    int insert(CwData record);

    int insertSelective(CwData record);

    CwData selectByPrimaryKey(String  dataid);

    int updateByPrimaryKeySelective(CwData record);

    int updateByPrimaryKey(CwData record);
    //通过查询主题来获取全部
    List<CwData> queryByTitle(String datatitle);
    
    List<CwData> queryAll();
    //计算总条数
    CwData queryCount();

    //分页传入参数是map类型
    List<CwData> queryPage(Map<String, Object> map);
}