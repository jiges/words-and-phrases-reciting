package com.ccr.wapr.api.dto;

import lombok.*;

/**
 * @author ccr12312@163.com at 2019-4-26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class UserDTO {

    private String id;

    private String wxId;

    private String userName;

}
