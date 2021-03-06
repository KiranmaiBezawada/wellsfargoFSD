package com.wellsfargo.batch5.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="address_groups")
public class AddressGroup {
	
	@Id
	@Column(name="grp_id")
	private Integer groupId;
	
	@Column(name="grp_title",nullable=false,unique=true)
	private String groupTitle;
	
	@OneToMany(mappedBy="adbGroup",cascade=CascadeType.ALL)
	private Set<Contact> contacts;

	public AddressGroup() {
		
	}
	
	public AddressGroup(Integer groupId, String groupTitle) {
		super();
		this.groupId = groupId;
		this.groupTitle = groupTitle;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupTitle() {
		return groupTitle;
	}

	public void setGroupTitle(String groupTitle) {
		this.groupTitle = groupTitle;
	}

	public Set<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}
	
	
}
