package tech.hanting.rss2kindle.web.vo;


import lombok.Data;

/**
 * @author hanting
 * UserVO
 */
@Data
public class UserVo {

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
