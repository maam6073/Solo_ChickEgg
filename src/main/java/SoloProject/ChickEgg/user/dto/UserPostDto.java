package SoloProject.ChickEgg.user.dto;

import lombok.Getter;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Getter
public class UserPostDto {

    @NotBlank
    @Email
    //이메일
    private String email;

    @NotBlank
    //패스워드
    private String password;


    @Pattern(regexp = "^\\S+(\\s?\\S+)*$", message = "회원 닉네임은 공백이 아니어야 합니다.")
    //    이름 정보가 비어있으면(null) 유효성 검증을 하지 않습니다.
    //    이름 정보가 비어 있지 않고(not null), 공백 문자열이라면 검증에 실패합니다.
    //    시작 문자가 공백이면 검증에 실패합니다.
    //    끝 문자가 공백이면 검증에 실패합니다.
    //    문자와 문자 사이 공백이 1개를 초과하면 검증에 실패합니다.
    //닉네임
    private String nickName;

    @NotBlank
    //나이
    private int age;

    @NotBlank
    //성별
    private char gender;

}
