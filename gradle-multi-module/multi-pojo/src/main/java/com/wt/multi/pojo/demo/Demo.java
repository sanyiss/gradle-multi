package com.wt.multi.pojo.demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 案例
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="Demo",description="案例实体")
public class Demo {
    @ApiModelProperty(value = "主键id", name = "pkId")
    private Integer pkId;
    @ApiModelProperty(value = "名称", name = "name")
    private String name;
}
