package SoloProject.ChickEgg.user.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class UserPostDto {

    //이메일
    private String email;
    //패스워드
    private String password;
    //닉네임
    private String nickName;
    //나이
    private int age;
    //성별
    private char gender;

}
