package member.board.vo;

import lombok.Data;

@Data
public class EmailVO {
	private String subject;//제목
	private String content;//내용
	private String date;//날짜
	private String receiver;//받는 사람(이메일 주소)
}
