package tech.hanting.rss2kindle.convertor;

import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tech.hanting.rss2kindle.domain.User;
import tech.hanting.rss2kindle.service.dto.UserDTO;
import tech.hanting.rss2kindle.web.vo.UserVo;

/**
 * @author hanting
 * 用户的Convertor
 */
@Mapper(componentModel = "spring")
public interface UserConvertor {

    /**
     * 转换entity到DTO
     * @param entity
     * @return
     */
    UserDTO convertEntity2DTO(User entity);


    /**
     * 转换dto到VO
     * @param dto
     * @return
     */
    UserVo convertDTO2Vo(UserDTO dto);

}
