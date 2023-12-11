package com.jsp.et.dto;

//Data transfer object -It will transfer data from controller to service
//It is useful to store data which entered by user in frontend files
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserDTO 
{
	private int userId;
	private String fullName;
	private String userName;
	private String mobile;
	private String email;
	private String password;
	private String repassword;
	
	private ImageDTO image;
}
