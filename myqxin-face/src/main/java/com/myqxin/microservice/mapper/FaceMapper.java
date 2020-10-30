package com.myqxin.microservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myqxin.microservice.entity.Face;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xuhongzu
 * @date 2020/10/30
 */
@Mapper
public interface FaceMapper extends BaseMapper<Face> {
}
