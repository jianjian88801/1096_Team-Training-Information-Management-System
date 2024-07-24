package com.dao;

import com.entity.XunliankaoqinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XunliankaoqinView;

/**
 * 考勤信息 Dao 接口
 *
 * @author 
 */
public interface XunliankaoqinDao extends BaseMapper<XunliankaoqinEntity> {

   List<XunliankaoqinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
