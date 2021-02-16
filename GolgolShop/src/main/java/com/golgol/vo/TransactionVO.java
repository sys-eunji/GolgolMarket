package com.golgol.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionVO {
	private int t_idx;  			//게시글 번호
	private String id;				//작성자 아이디
	private String t_title;		//글 제목
	private String t_content;	//글 내용
	private String t_count;		//조회수
	private String t_date;		//작성일
	private int s_idx;				//글 상태-->state table's pk(판매중, 예약중, 판매완료)
}
