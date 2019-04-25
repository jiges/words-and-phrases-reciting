package com.ccr.wapr.api.dto;

import lombok.Builder;
import lombok.Data;

/**
 * 调用失败时返回的失败信息
 * @author ccr12312@163.com at 2019-4-25
 */
@Data
@Builder
public class ApiErrorResponse {
    //Http响应码
    private int status;
    //错误代码
    private String errorCode;
    //提示信息
    private String message;
    //详细信息
    private String detail;
}
