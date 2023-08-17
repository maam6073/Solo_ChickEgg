package SoloProject.ChickEgg.user.controller;

import SoloProject.ChickEgg.user.dto.UserPatchDto;
import SoloProject.ChickEgg.user.dto.UserPostDto;
import SoloProject.ChickEgg.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;

@RestController // 해당 클래스가 Rest API의 리소스를 처리하기위한 API엔드포인트로 동작함을 의미함
@RequestMapping(value = "/users", produces = {MediaType.APPLICATION_JSON_VALUE})
// 클라이언트의 요청과 핸들러메서드를 매핑해 주는 역할을 함 클래스 전체에 사용되는 공통 URL 설정을 함
// produces는 응답 데이터를 어떤 미디어 타입으로 클라이언트에게 전송할지 결정하는 것
@Validated  // 컨트롤러로 들어오는 값에 유효성을 적용해주기 위해 필요한 애너테이션

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //회원가입
    @PostMapping
    public ResponseEntity postUser(@Valid @RequestBody UserPostDto userPostDto){

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    //회원수정
    @PatchMapping()
    public ResponseEntity patchUser(@Valid @RequestBody UserPatchDto userPatchDto){
        return new ResponseEntity<>(HttpStatus.OK);
    }


    //회원 조회
    //Positive 애너테이션은 양수만 가능한 유효성 조건 애너테이션이다.
    @GetMapping("/{user-id}")
    public ResponseEntity getUser(@PathVariable("user-id") @Positive long userId){
        return new ResponseEntity<>(HttpStatus.OK);
    }


    //회원 전체 조회
    @GetMapping ResponseEntity getUsers(){
        System.out.print("회원 전체 조회");
        return new ResponseEntity<>(HttpStatus.OK);
    }


    //1주일 뒤 삭제 기능 넣어야함
    //회원 탈퇴
    @DeleteMapping("/{user-id}")
    public ResponseEntity deleteUser(@PathVariable("user-id") @Positive long userId){
        System.out.print("userId : " + userId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
