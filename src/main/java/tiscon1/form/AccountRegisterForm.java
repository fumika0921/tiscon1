package tiscon1.form;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author kawasima
 */
@Data
public class AccountRegisterForm implements Serializable {
    @Size(min = 1, max = 100)
    @NotNull
    private String name;

    @Email
    @NotEmpty
    @NotNull
    private String email;

    @Size(min = 6)
    @Pattern(regexp= "^(?=.*[a-zA-Z])(?=.*[0-9]).*")
    @NotNull
    private String password;
}
