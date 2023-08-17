package SoloProject.ChickEgg.user.mapper;

import SoloProject.ChickEgg.user.dto.UserPatchDto;
import SoloProject.ChickEgg.user.dto.UserPostDto;
import SoloProject.ChickEgg.user.entity.User;
import org.springframework.stereotype.Component;

@Component //Spring Been으로 등록하기 위한 애너테이션
public class UserMapper {
    public User userPostDtoToUser(UserPostDto userPostDto){
        return null;
    }

    public User userPatchDtoToUser(UserPatchDto userPatchDto){
        return null;
    }
}
