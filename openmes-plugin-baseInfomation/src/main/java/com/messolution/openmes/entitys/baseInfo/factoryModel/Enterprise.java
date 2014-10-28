package com.messolution.openmes.entitys.baseInfo.factoryModel;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.messolution.opemmes.hibernate.common.IEntity;


/**
 * 
 * @declaration:
 * @project : openmes-plugin-baseInfomation
 * @package : com.messolution.openmes.baseInfo.entitys.factoryModel
 * @create_time : 2014年10月19日下午4:28:14
 * @author : panzhichun
 * @mail : mmcpanzhichun@gmail.com
 */
@Entity
@Table(name="bi_fm_enterprise")
public class Enterprise extends IEntity {

	private static final long serialVersionUID = -495934259897317309L;
   
	private String name;
	
	private String description;

	
	private List<Site> sites;
	
	@Column(length=32)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length=32)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(mappedBy="enterprise")
	public List<Site> getSites() {
		return sites;
	}

	public void setSites(List<Site> Enterprise) {
		this.sites = sites;
	}
	
}