package com.dao;

import com.entity.XunlianjinduEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XunlianjinduView;

/**
 * 训练进度 Dao 接口
 *
 * @author 
 */
public interface XunlianjinduDao extends BaseMapper<XunlianjinduEntity> {

   List<XunlianjinduView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
