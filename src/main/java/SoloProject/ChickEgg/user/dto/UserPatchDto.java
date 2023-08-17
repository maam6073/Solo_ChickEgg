package SoloProject.ChickEgg.user.dto;

import lombok.Getter;

@Getter
public class UserPatchDto {
    //닉네임
    private String nickName;
    //나이
    private int age;
    //성별
    private char gender;
}
