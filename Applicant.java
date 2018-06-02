import java.util.List;

public class Applicant {
	private String Uuid;
	private String Fname;
	private String Lname;
	private String Phone;
	private String Address;
	private String Mail;
	private String Birthday;
	private String Occupation;
	private String Picture_name;
	private String Create_at;
	private String Update_at;
	private String Delete_at;
	private String Delete_is;
	private List<String> skills;
	private List<String> experiences;
	private List<String> educations;
	
	public void setUuid(String Uuid){
		this.Uuid = Uuid;
	}
	
	public String getUuid(){
		return this.Uuid;
	}
	
	public void setFname(String Fname){
		this.Fname = Fname;
	}
	
	public String getFname(){
		return this.Fname;
	}
	
	public void setLname(String Lname){
		this.Lname = Lname;
	}
	
	public String getLname(){
		return this.Lname;
	}
	
	public void setPhone(String Phone){
		this.Phone = Phone;
	}
	
	public String getPhone(String Phone){
		return this.Phone;
	}
	
	public void setAddress(String Address){
		this.Address = Address;
	}
	
	public String getAddress(){
		return this.Address;
	}
	
	public void setMail(String Mail){
		this.Mail = Mail;
	}
	
	public String getMail(){
		return this.Mail;
	}
	
	public void setBirthday(String Birthday){
		this.Birthday = Birthday;
	}
	
	public String getBirthday(){
		return this.Birthday;
	}
	
	public void setOccupation(String Occupation){
		this.Occupation = Occupation;
	}
	
	public String getOccupation(){
		return this.Occupation;
	}
	
	public void setPicture_name(String Picture_name){
		this.Picture_name = Picture_name;
	}
	
	public String getPicture_name(){
		return this.Picture_name;
	}
	
	public void setCreate_at(String Create_at){
		this.Create_at = Create_at;
	}
	
	public String getCreate_at(){
		return this.Create_at;
	}
	
	public void setUpdate_at(String Update_at){
		this.Update_at = Update_at;
	}
	
	public String getUpdate_at(){
		return this.Update_at;
	}
	
	public void setDelete_at(String Delete_at){
		this.Delete_at = Delete_at;
	}
	
	public String getDelete_at(){
		return this.Delete_at;
	}
	
	public void setDelete_is(String Delete_is){
		this.Delete_is = Delete_is;
	}
	
	public String getDelete_is(){
		return this.Delete_is;
	}
	
	public void setskills(List<String> skills){
		this.skills = skills;
	}
	
	public List<String> getskills(){
		return this.skills;
	}
	
	public void setexperiences(List<String> experiences){
		this.experiences = experiences;
	}
	
	public List<String> getexperiences(){
		return this.experiences;
	}
	
	public void seteducations(List<String> educations){
		this.educations = educations;
	}
	
	public List<String> geteducations(){
		return this.educations;
	}
	
}
