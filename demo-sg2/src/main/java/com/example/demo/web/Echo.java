package com.example.demo.web;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("显示发送内容")
public class Echo {

    @ApiModelProperty(required = true, dataType = "string")
    private String recStr;

    public String getRecStr() {
        return recStr;
    }

    public void setRecStr(String recStr) {
        this.recStr = recStr;
    }
}
