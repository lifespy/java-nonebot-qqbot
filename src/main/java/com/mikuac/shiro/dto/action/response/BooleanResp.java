package com.mikuac.shiro.dto.action.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * Created on 2021/7/8.
 *
 * @author Zero
 */
@Data
public class BooleanResp {

    @JSONField(name = "yes")
    private boolean yes;

}