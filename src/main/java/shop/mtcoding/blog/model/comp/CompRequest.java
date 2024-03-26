package shop.mtcoding.blog.model.comp;

import lombok.Data;
import shop.mtcoding.blog.model.skill.SkillRequest;
import shop.mtcoding.blog.model.user.User;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CompRequest {

    @Data
    public static class JobsViewDTO {
        private Integer id;
        private Integer userId;
        private String compName;
        private String title;
        private String task;
        private String career;
        private List<SkillRequest.JobSkillDTO> skillList = new ArrayList<>();
        private Integer number;
    }

    @Data
    public static class ResumeViewDTO {
        private Integer id;
        private Integer userId;
        private String myName;
        private String title;
        private String edu;
        private String career;
        private String area;
        private String imgFileName;
        private List<SkillRequest.CompskillDTO> skillList = new ArrayList<>();
    }

    @Data
    public static class UserApplyDTO {
        private Integer id;
        private Integer resumeId;
        private String name;
        private String title;
        private String career;
        private List<SkillRequest.JobSkillDTO> skillList = new ArrayList<>();
    }

    @Data
    public static class UpdateDTO{
        private String myName;
        private String password;
        private String compName;
        private String phone;
        private String address;
        private LocalDate birth;
        private String businessNumber;
        private String homepage;
    }

    @Data
    public static class CompJoinDTO {
        private Integer id;
        private String email;
        private String myName;
        private String password;
        private String phone;
        private String address;
        private LocalDate birth;
        private String businessNumber;
        private String photo;
        private String compName;
        private String homepage;
        private Timestamp createdAt;

        public User toEntity(Integer role) {
            return User.builder()
                    .id(id)
                    .email(email)
                    .myName(myName)
                    .password(password)
                    .phone(phone)
                    .address(address)
                    .birth(birth)
                    .businessNumber(businessNumber)
                    .photo(photo)
                    .compName(compName)
                    .homepage(homepage)
                    .role(role)
                    .createdAt(createdAt)
                    .build();
        }
    }


}