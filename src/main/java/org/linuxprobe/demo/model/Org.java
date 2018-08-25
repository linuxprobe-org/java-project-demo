package org.linuxprobe.demo.model;

import org.linuxprobe.crud.core.annoatation.PrimaryKey;
import org.linuxprobe.crud.core.annoatation.Table;
import org.linuxprobe.crud.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table("org")
@Getter
@Setter
@ToString
public class Org extends BaseModel{
	@PrimaryKey
	private String id;
	private String name;
}