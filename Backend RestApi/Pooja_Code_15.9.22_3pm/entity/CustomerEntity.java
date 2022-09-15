package project.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CustomerEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int customerId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column(unique = true)
	private long mobileNumber;
	@Column
	private String password;
	
	@JsonIgnore
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)  
	private List<TableBookingEntity> tableBook1;

	public CustomerEntity() {}

	public CustomerEntity(int customerId, String firstName, String lastName, long mobileNumber, String password)
	{
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<TableBookingEntity> getTableBook1() {
		return tableBook1;
	}

	public void setTableBook1(List<TableBookingEntity> tableBook1) {
		this.tableBook1 = tableBook1;
	}

	@Override
	public String toString() {
		return "CustomerEntity [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobileNumber=" + mobileNumber + ", password=" + password + ", tableBook1=" + tableBook1 + "]";
	}
}