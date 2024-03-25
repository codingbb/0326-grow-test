package shop.mtcoding.blog.model.user;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shop.mtcoding.blog._core.errors.exception.Exception401;
import shop.mtcoding.blog._core.errors.exception.Exception403;
import shop.mtcoding.blog._core.util.ApiUtil;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserJPARepository userRepo;

    public User join (UserRequest.JoinDTO reqDTO, Integer role){
        return userRepo.save(reqDTO.toEntity(role));
    }

    public  User login (UserRequest.LoginDTO reqDTO){
        return userRepo.findByIdAndPassword(reqDTO.getEmail(), reqDTO.getPassword())
                .orElseThrow(() -> new Exception401("회원 정보가 없습니다."));
    }

    public User findByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    //유저 회원정보 폼 업데이트 메소드
    @Transactional
    public User updateById(User sessionUser, UserRequest.UpdateDTO requestDTO) {
        User user = userRepo.findById(sessionUser.getId())
                .orElseThrow(() -> new Exception401("로그인이 필요한 서비스입니다."));

        user.setPassword(requestDTO.getPassword());
    //    user.setMyName(requestDTO.getMyName());
        user.setBirth(requestDTO.getBirth());
        user.setPhone(requestDTO.getPhone());
        user.setAddress(requestDTO.getAddress());

        return user;
    }


    //유저 회원 정보 업데이트용 조회
    public User findById(Integer sessionUserId) {
        User user = userRepo.findById(sessionUserId)
                .orElseThrow(() -> new Exception401("로그인이 필요한 서비스입니다."));
        return user;

    }
}
