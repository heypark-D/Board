package member.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import member.board.dto.CommDto;
import member.board.service.CommService;

@RestController
public class CommController {
	@Autowired
	CommService service;
	
	@PostMapping("/comm/insert")
	public String insertComm(CommDto dto) {
		int i = service.insertComm(dto);
		return i+"";
	}
	
	@DeleteMapping("/comm/delete/{cno}")
	public String deleteComm(@PathVariable int cno) {
		int i = service.deleteComm(cno);
		return i+"";
	}
}





