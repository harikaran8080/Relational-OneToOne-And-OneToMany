package com.mapping.TryMap.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "company")
public class Mapping {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_id;

	private String company_name;

	private int pincode;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "fk_a_id")
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_c_id",referencedColumnName = "c_id")
	private List<Address> address;
//	private Address address1;

}
