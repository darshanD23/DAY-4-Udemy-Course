package net.javaguides.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
   
	public UserDto(Long id2, String firstName2, String lastName2, String email2) {
		// TODO Auto-generated constructor stub
	}
    public class User {
        public User(Long id2, String firstName2, String lastName2, String email2) {
    		// TODO Auto-generated constructor stub
    	}
	private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setId(Long userId) {
		// TODO Auto-generated method stub
		
	}
}
