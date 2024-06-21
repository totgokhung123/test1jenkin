package com.bookstore.validator;

import jakarta.validation. Constraint;
import jakarta.validation. Payload;
import java. lang.annotation .*;
import static java. lang.annotation.ElementType .*;
import static java. lang.annotation. RetentionPolicy. RUNTIME;

@Target({TYPE, FIELD}) //Áp dụng cho các loại dữ Liệu (class) và các trường (field). 1usage
@Retention(RUNTIME) //Cho phép được sử dụng runtime để thực hiện các kiểm tra.
//Lop Validator cần kiểm tra
@Constraint(validatedBy = ValidUserIdValidator.class)
public @interface ValidUserId {
    String message() default "Hehe đăng nhập không hợp lệ"; //Thông báo khi vi pham ràng buộc
    Class <? >[] groups() default {};
    Class <? extends Payload>[] payload() default {};

}