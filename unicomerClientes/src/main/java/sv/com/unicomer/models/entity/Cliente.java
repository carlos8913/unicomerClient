package sv.com.unicomer.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="clientuni")
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "firtName", nullable = false, length = 50)
	private String firtName;
	
	@Column(name = "lastName", nullable = false, length = 50)
	private String lastName;

	@Temporal(TemporalType.DATE)
	private Date birthday;
	
	@Column(name = "gender", nullable = false, length = 1)
	private String gender;
	
	@Column(name = "cellPhone", nullable = false, length = 9)
	private String cellPhone;
	
	@Column(name = "homePhone", nullable = false, length = 9)
	private String homePhone;
	
	@Column(name = "homeAddress", nullable = false, length = 200)
	private String homeAddress;
	
	@Column(name = "profession", nullable = false, length = 50)
	private String profession;
	
	private float incomes;
	
	@PrePersist
	public void prePersist() {
	}

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
