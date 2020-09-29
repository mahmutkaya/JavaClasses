package techproedenglish01.techproedenglish01api;

import java.util.HashMap;
import java.util.Map;

public class Data {

private Integer id;
private String employeeName;
private Integer employeeSalary;
private Integer employeeAge;
private String profileImage;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getEmployeeName() {
return employeeName;
}

public void setEmployeeName(String employeeName) {
this.employeeName = employeeName;
}

public Integer getEmployeeSalary() {
return employeeSalary;
}

public void setEmployeeSalary(Integer employeeSalary) {
this.employeeSalary = employeeSalary;
}

public Integer getEmployeeAge() {
return employeeAge;
}

public void setEmployeeAge(Integer employeeAge) {
this.employeeAge = employeeAge;
}

public String getProfileImage() {
return profileImage;
}

public void setProfileImage(String profileImage) {
this.profileImage = profileImage;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
