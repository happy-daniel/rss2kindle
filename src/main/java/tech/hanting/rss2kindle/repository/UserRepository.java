package tech.hanting.rss2kindle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.hanting.rss2kindle.domain.User;

/**
 * @author hanting
 */
public interface UserRepository extends JpaRepository<User,Long> {

    /**
     * 根据LoginId获取User
     * @param loginId
     * @return
     */
    User findByLoginId(String loginId);

}
