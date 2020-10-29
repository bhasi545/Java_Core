package com.jcg.hibernate.maven;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "UserListOfAddress_Hibernate")
public class UserListofAddressCollection {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "my_sequence")    
	@TableGenerator(
	  name = "my_sequence",
	  table = "id_gen",
	  pkColumnName = "gen_name",
	  valueColumnName = "gen_val",
	  initialValue = 1000,
	  allocationSize = 10)
	private int user_id;

	private String user_name;

	private String created_by;

	private Date created_date;
	
	private int user_salary;
	@ElementCollection
	@JoinTable(name="USER_ADDRESS",
	   joinColumns=@JoinColumn(name="USER_ID"))
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@CollectionId(columns = { @Column(name="collection_id") }, generator = "hilo-gen", type = @Type(type="long"))
	private Collection<Address> listOfAdresses = new ArrayList<Address>();
	
	public Collection<Address> getListOfAdresses() {
		return listOfAdresses;
	}

	public void setListOfAdresses(Collection<Address> listOfAdresses) {
		this.listOfAdresses = listOfAdresses;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public int getUser_salary() {
		return user_salary;
	}

	public void setUser_salary(int user_salary) {
		this.user_salary = user_salary;
	}
	
	

	
}

/*
 * 
 * @JoinTable(name="USER_ADDRESS",
			   joinColumns=@JoinColumn(name="USER_ID"))
*/