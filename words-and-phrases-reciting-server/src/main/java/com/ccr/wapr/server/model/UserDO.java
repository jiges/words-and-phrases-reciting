package com.ccr.wapr.server.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 用户数据
 * @author ccr12312@163.com at 2019-4-25
 */
@Data
@Builder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document(collection = "user")
public class UserDO {

    @Id
    private String id;

    @EqualsAndHashCode.Include
    @Indexed
    private String wxId;

    private String userName;
}
