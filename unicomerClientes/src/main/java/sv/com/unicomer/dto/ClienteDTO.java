package sv.com.unicomer.dto;

import java.sql.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClienteDTO {
	private String firtName;
	private String lastName;
	private Date birthday;
	private boolean gender;
	private String cellPhone;
	private String homePhone;
	private String homeAddress;
	private String profession;
	private String incomes;

}
