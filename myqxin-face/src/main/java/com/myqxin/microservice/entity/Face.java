package com.myqxin.microservice.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * @author xuhongzu
 * @date 2020/10/30
 */
@Data
@Builder
@Accessors(chain = true)
@TableName("t_face")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "face对象", description = "用户人脸信息实体对象")
public class Face extends BaseEntity {

    @ApiModelProperty(value = "用户人脸信息", example = "xxsfgdfdasfdfaddf")
    private String faceInfo;

}
