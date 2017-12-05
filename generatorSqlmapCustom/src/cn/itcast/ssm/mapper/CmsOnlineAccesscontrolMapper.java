package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.CmsOnlineAccesscontrol;
import cn.itcast.ssm.po.CmsOnlineAccesscontrolExample;
import cn.itcast.ssm.po.CmsOnlineAccesscontrolKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsOnlineAccesscontrolMapper {
    int countByExample(CmsOnlineAccesscontrolExample example);

    int deleteByExample(CmsOnlineAccesscontrolExample example);

    int deleteByPrimaryKey(CmsOnlineAccesscontrolKey key);

    int insert(CmsOnlineAccesscontrol record);

    int insertSelective(CmsOnlineAccesscontrol record);

    List<CmsOnlineAccesscontrol> selectByExample(CmsOnlineAccesscontrolExample example);

    CmsOnlineAccesscontrol selectByPrimaryKey(CmsOnlineAccesscontrolKey key);

    int updateByExampleSelective(@Param("record") CmsOnlineAccesscontrol record, @Param("example") CmsOnlineAccesscontrolExample example);

    int updateByExample(@Param("record") CmsOnlineAccesscontrol record, @Param("example") CmsOnlineAccesscontrolExample example);

    int updateByPrimaryKeySelective(CmsOnlineAccesscontrol record);

    int updateByPrimaryKey(CmsOnlineAccesscontrol record);
}