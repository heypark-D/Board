package member.board.dto;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class MemDto {
	
	@NotNull(message="id is null.")
	@NotEmpty(message="id is empty.")
	private String id;
	@NotNull(message="password is null.")
	@NotEmpty(message="password is empty.")
	private String  password;
	private String name;
	@DateTimeFormat(pattern = "yyyyMMdd")
	private Date birth; 
	private String address;
	
}
