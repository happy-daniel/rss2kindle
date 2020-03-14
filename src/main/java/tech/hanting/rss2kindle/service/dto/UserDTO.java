package tech.hanting.rss2kindle.service.dto;

import lombok.Data;

/**
 * @author hanting
 */
@Data
public class UserDTO {
    /**
     * 数据库ID
     */
    private Long id;
    /**
     * email
     */
    private String email;
    /**
     * 登录ID
     */
    private String loginId;
}
