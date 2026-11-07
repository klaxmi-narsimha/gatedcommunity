package com.kln.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "residents")
public class ResidentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;

    private int block;
	
	private int roomNo;

	public ResidentEntity(String name, int block, int roomNo) {
	
		this.name = name;
		this.block = block;
		this.roomNo = roomNo;
	}
	
	

}
