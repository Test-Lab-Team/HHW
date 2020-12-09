package ch01.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MemberTest")
public class MemberBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer memId;
	@Column(columnDefinition = "nvarchar(MAX) NOT NULL") 
	private String memAccount;
	@Column(columnDefinition = "nvarchar(MAX) NOT NULL") 
	private String memPassword;
	@Column(columnDefinition = "nvarchar(MAX) NOT NULL") 
	private String memName;
	@Column(columnDefinition = "nvarchar(MAX) NOT NULL") 
	private String memGender;
	@Column(columnDefinition = "nvarchar(MAX) NOT NULL") 
	private String memBirthday;
	@Column(columnDefinition = "nvarchar(MAX) NOT NULL")
	private String memPhone;
	@Column(columnDefinition = "nvarchar(MAX) NOT NULL") 
	private String memMailaddress;
	@Column(columnDefinition = "nvarchar(MAX) NOT NULL") 
	private String memAddress;
	@Column(columnDefinition = "nvarchar(MAX) NOT NULL") 
	private String memIdNumber;
	@Column(columnDefinition = "int NOT NULL")
	private Integer memRefund;
	@Column(columnDefinition = "nvarchar(MAX) NOT NULL") 
	private String memPic;
		
	public MemberBean() {
		super();
	}

	public MemberBean(Integer memId, String memAccount, String memPassword, String memName, String memGender,
			String memBirthday, String memPhone, String memMailaddress, String memAddress, String memIdNumber,
			Integer memRefund, String memPic) {
		super();
		this.memId = memId;
		this.memAccount = memAccount;
		this.memPassword = memPassword;
		this.memName = memName;
		this.memGender = memGender;
		this.memBirthday = memBirthday;
		this.memPhone = memPhone;
		this.memMailaddress = memMailaddress;
		this.memAddress = memAddress;
		this.memIdNumber = memIdNumber;
		this.memRefund = memRefund;
		this.memPic = memPic;
	}




	public Integer getMemId() {
		return memId;
	}

	public void setMemId(Integer memId) {
		this.memId = memId;
	}

	public String getMemAccount() {
		return memAccount;
	}

	public void setMemAccount(String memAccount) {
		this.memAccount = memAccount;
	}

	public String getMemPassword() {
		return memPassword;
	}

	public void setMemPassword(String memPassword) {
		this.memPassword = memPassword;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemGender() {
		return memGender;
	}

	public void setMemGender(String memGender) {
		this.memGender = memGender;
	}

	public String getMemBirthday() {
		return memBirthday;
	}

	public void setMemBirthday(String memBirthday) {
		this.memBirthday = memBirthday;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	public String getMemMailaddress() {
		return memMailaddress;
	}

	public void setMemMailaddress(String memMailaddress) {
		this.memMailaddress = memMailaddress;
	}

	public String getMemAddress() {
		return memAddress;
	}

	public void setMemAddress(String memAddress) {
		this.memAddress = memAddress;
	}

	public String getMemIdNumber() {
		return memIdNumber;
	}

	public void setMemIdNumber(String memIdNumber) {
		this.memIdNumber = memIdNumber;
	}

	public Integer getMemRefund() {
		return memRefund;
	}

	public void setMemRefund(Integer memRefund) {
		this.memRefund = memRefund;
	}

	public String getMemPic() {
		return memPic;
	}

	public void setMemPic(String memPic) {
		this.memPic = memPic;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MemberBean [memId=");
		builder.append(memId);
		builder.append(", memAccount=");
		builder.append(memAccount);
		builder.append(", memPassword=");
		builder.append(memPassword);
		builder.append(", memName=");
		builder.append(memName);
		builder.append(", memGender=");
		builder.append(memGender);
		builder.append(", memBirthday=");
		builder.append(memBirthday);
		builder.append(", memPhone=");
		builder.append(memPhone);
		builder.append(", memMailaddress=");
		builder.append(memMailaddress);
		builder.append(", memAddress=");
		builder.append(memAddress);
		builder.append(", memIdNumber=");
		builder.append(memIdNumber);
		builder.append(", memRefund=");
		builder.append(memRefund);
		builder.append(", memPic=");
		builder.append(memPic);
		builder.append("]");
		return builder.toString();
	}


}
