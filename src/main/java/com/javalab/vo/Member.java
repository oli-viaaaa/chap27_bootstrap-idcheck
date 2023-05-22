package com.javalab.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	
	// 멤버 변수
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String joindate;

	public Member(String id) {
		this.id = id;
	}
}
