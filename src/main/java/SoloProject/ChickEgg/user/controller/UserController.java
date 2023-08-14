package SoloProject.ChickEgg.user.controller;

import SoloProject.ChickEgg.user.dto.UserPostDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //해당 클래스가 Rest API의 리소스를 처리하기위한 API엔드포인트로 동작함을 의미함
@RequestMapping(value = "/users", produces = {MediaType.APPLICATION_JSON_VALUE})
//클라이언트의 요청과 핸들러메서드를 매핑해 주는 역할을 함 클래스 전체에 사용되는 공통 URL 설정을 함
//produces는 응답 데이터를 어떤 미디어 타입으로 클라이언트에게 전송할지 결정하는 것
public class UserController {

    //회원가입
    @PostMapping
    public ResponseEntity createUser(UserPostDto userPostDto){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    //회원수정

}
