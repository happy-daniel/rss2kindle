package tech.hanting.rss2kindle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.hanting.rss2kindle.convertor.UserConvertor;
import tech.hanting.rss2kindle.domain.User;
import tech.hanting.rss2kindle.repository.UserRepository;
import tech.hanting.rss2kindle.service.UserService;
import tech.hanting.rss2kindle.service.dto.UserDTO;

/**
 * @author hanting
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConvertor userConvertor;
    @Override
    public UserDTO findByLoginId(String loginId) {
        User entity = userRepository.findByLoginId(loginId);
        return userConvertor.convertEntity2DTO(entity);
    }
}
