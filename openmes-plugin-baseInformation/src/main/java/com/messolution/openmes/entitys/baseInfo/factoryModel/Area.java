package com.messolution.openmes.entitys.baseInfo.factoryModel;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.messolution.opemmes.hibernate.common.IEntity;

/**
 * 
 * @declaration: physical, geographical or logical grouping determined by the site
 *               NOTE It can contain process cells, production units, production lines, and storage zones.
 * @project : openmes-plugin-baseInfomation
 * @package : com.messolution.openmes.entitys.baseInfo.factoryModel
 * @create_time :2014年10月29日 下午8:28:29
 * @author : panzhichun
 * @mail : mmcpanzhichun@gmail.com
 */
@Entity
@Table(name="bi_fm_area")
public class Area extends IEntity {


	private static final long serialVersionUID = -3314520372507575495L;

	private String name;
	
	private String description;
	
	private AreaCategory areaCategory;
	
	private Site site;
	
	private Set<ProcessCell> processCells;
	
	private Set<ProductionUnit> productionUnits;
	
	private Set<ProductionLine> productionLines;
	
	private Set<StorageZone> storageZones;

	@Column(name="areaName",length=16)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length=64)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ManyToOne
	@JoinColumn(name="category_Id")
	public AreaCategory getAreaCategory() {
		return areaCategory;
	}

	public void setAreaCategory(AreaCategory areaCategory) {
		this.areaCategory = areaCategory;
	}

	@ManyToOne
	@JoinColumn(name="site_Id")
	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	@OneToMany(mappedBy="area")
	@Cascade({CascadeType.SAVE_UPDATE})
	public Set<ProcessCell> getProcessCells() {
		return processCells;
	}

	public void setProcessCells(Set<ProcessCell> processCells) {
		this.processCells = processCells;
	}

	@OneToMany(mappedBy="area")
	@Cascade({CascadeType.SAVE_UPDATE})
	public Set<ProductionUnit> getProductionUnits() {
		return productionUnits;
	}

	public void setProductionUnits(Set<ProductionUnit> productionUnits) {
		this.productionUnits = productionUnits;
	}

	@OneToMany(mappedBy="area")
	@Cascade({CascadeType.SAVE_UPDATE})
	public Set<ProductionLine> getProductionLines() {
		return productionLines;
	}

	public void setProductionLines(Set<ProductionLine> productionLines) {
		this.productionLines = productionLines;
	}

	@OneToMany(mappedBy="area")
	@Cascade({CascadeType.SAVE_UPDATE})
	public Set<StorageZone> getStorageZones() {
		return storageZones;
	}

	public void setStorageZones(Set<StorageZone> storageZones) {
		this.storageZones = storageZones;
	}
}
