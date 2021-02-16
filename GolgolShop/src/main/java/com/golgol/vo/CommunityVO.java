package com.golgol.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommunityVO {
	private int c_idx;
	private String id;
	private String c_title;
	private String c_content;
	private String c_count;
	private String c_date;
}
