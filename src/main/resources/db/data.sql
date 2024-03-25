-- 사용자 테이블
insert into user_tb(email, my_name, password, phone, address, birth, role, img_file_name,created_at)
values ('bluepig4b@naver.com','심유주','1234','010-9011-5822','부산광역시 부산진구 범향빌딩 405호','1999-09-30','1','0ff7e86a-d0db-4d7c-ad5b-bd68682ccb11_user01.png',now());
insert into user_tb(email, my_name, password, phone, address, birth, role, img_file_name,created_at)
values ('blueocean@naver.com','이서현','1234','010-1555-5842','부산광역시 사상구 괘법동 234번지 괘법아파트','2000-10-06','1','702385bb-c937-4204-a142-7583f908bfaf_user02.png',now());
insert into user_tb(email, my_name, password, phone, address, birth, role, img_file_name,created_at)
values ('hamimi1997@naver.com','김하형','1234','010-2684-5842','부산광역시 해운대구 우동 789번지 센텀시티 202호','1997-05-23','1','706ffd65-ca99-4b91-a4e1-c73741f9b23f_user03.png',now());

insert into user_tb(email, my_name, password, phone, address, birth, business_number, comp_name, homepage, role, photo,img_file_name, created_at)
values ('g@n','이혁근','1234','010-5678-5822','부산광역시 부산진구 범향빌딩403호','1999-06-02','301-15-12412','네이버','www.naver.com','2', '/images/naver.png','7d7ce466-b2b0-424d-bc2b-c233d98030f6_kakao.png', now());

-- 이력서 테이블
insert into resume_tb(user_id, title, area, edu, career, introduce, port_link,  created_at)
values (1, '신입 백엔드 개발자', '부산', '대졸', '신입', 'ERD를 설계하고, MySQL, MariaDB를 사용할 수 있습니다. JavaScript, TypeScript, HTML/CSS 프론트엔드 개발도 가능합니다.', 'naver.com/universe00',now());
insert into resume_tb(user_id, title, area, edu, career, introduce, port_link, created_at)
values (2, 'Back-End / Software Engineer', '부산', '고졸', '신입', '[성장]을 목표로 달려나가며, 도전적인 것을 좋아하는 이 서 연 입니다!', 'nate.com/blueocean',now());
insert into resume_tb(user_id, title, area, edu, career, introduce, port_link, created_at)
values (3, 'Java-Spring 개발자', '부산', '대졸', '미들(4~8년)', 'Java를 메인으로 Back-end 개발에 관심을 가지고 있습니다. 다양한 환경과 회사를 접하며 웹서비스를 개발하고, 서비스 해본 경험이 있습니다.', 'naver.com/githa',now());
