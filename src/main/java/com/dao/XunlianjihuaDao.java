package com.dao;

import com.entity.XunlianjihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XunlianjihuaView;

/**
 * 训练计划 Dao 接口
 *
 * @author 
 */
public interface XunlianjihuaDao extends BaseMapper<XunlianjihuaEntity> {

   List<XunlianjihuaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
