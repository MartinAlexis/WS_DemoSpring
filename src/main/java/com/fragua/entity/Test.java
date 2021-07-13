package com.fragua.entity;
import lombok.Data;
import lombok.Builder;
import javax.persistence.Id;
import javax.persistence.Entity;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "test")
public class Test {
	@Id
	private String user;
	private String password;
}