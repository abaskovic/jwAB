package hr.algebra.jw.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserDto {
    private String email;
    private String password;
    private String role;
    private String fullname;


}
