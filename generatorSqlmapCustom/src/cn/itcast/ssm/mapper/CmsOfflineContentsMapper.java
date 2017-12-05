package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.CmsOfflineContents;
import cn.itcast.ssm.po.CmsOfflineContentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsOfflineContentsMapper {
    int countByExample(CmsOfflineContentsExample example);

    int deleteByExample(CmsOfflineContentsExample example);

    int deleteByPrimaryKey(String resourceId);

    int insert(CmsOfflineContents record);

    int insertSelective(CmsOfflineContents record);

    List<CmsOfflineContents> selectByExampleWithBLOBs(CmsOfflineContentsExample example);

    List<CmsOfflineContents> selectByExample(CmsOfflineContentsExample example);

    CmsOfflineContents selectByPrimaryKey(String resourceId);

    int updateByExampleSelective(@Param("record") CmsOfflineContents record, @Param("example") CmsOfflineContentsExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsOfflineContents record, @Param("example") CmsOfflineContentsExample example);

    int updateByExample(@Param("record") CmsOfflineContents record, @Param("example") CmsOfflineContentsExample example);

    int updateByPrimaryKeySelective(CmsOfflineContents record);

    int updateByPrimaryKeyWithBLOBs(CmsOfflineContents record);
}