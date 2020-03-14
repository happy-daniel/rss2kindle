package tech.hanting.rss2kindle.service;

import tech.hanting.rss2kindle.service.dto.UserDTO;

/**
 * 用户相关的服务
 */
public interface UserService {

    /**
     *
     * @param loginId
     * @return
     */
    UserDTO findByLoginId(String loginId);
}
