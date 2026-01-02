package fr.codecake.airbnbclone.user.mapper;

import org.mapstruct.Mapper;

import fr.codecake.airbnbclone.user.application.dto.ReadUserDTO;
import fr.codecake.airbnbclone.user.domain.Authority;
import fr.codecake.airbnbclone.user.domain.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO userToReadUserDTO(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }

}
