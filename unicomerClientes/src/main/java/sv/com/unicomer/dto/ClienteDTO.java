package sv.com.unicomer.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClienteDTO {
	private Integer id;
	private String firtName;
	private String lastName;
	private Date birthday;
	private String gender;
	private String cellPhone;
	private String homePhone;
	private String homeAddress;
	private String profession;
	private float incomes;
	
	public ClienteDTO(){}
	
	public ClienteDTO(Integer id, String firtName, String lastName, Date birthday, String gender,
			String cellPhone, String homePhone, String homeAddress, String profession, float incomes) {
		super();
		this.id = id;
		this.firtName = firtName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.gender = gender;
		this.cellPhone = cellPhone;
		this.homePhone = homePhone;
		this.homeAddress = homeAddress;
		this.profession = profession;
		this.incomes = incomes;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirtName() {
		return firtName;
	}
	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public float getIncomes() {
		return incomes;
	}
	public void setIncomes(float incomes) {
		this.incomes = incomes;
	}
	

}
