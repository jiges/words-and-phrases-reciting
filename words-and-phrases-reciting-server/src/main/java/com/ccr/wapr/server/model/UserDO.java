package com.ccr.wapr.server.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.Id;

/**
 * 用户数据
 * @author ccr12312@163.com at 2019-4-25
 */
@Data
@Builder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class UserDO {

    @Id
    private String id;

    @EqualsAndHashCode.Include
    private String wxId;

    private String userName;
}
