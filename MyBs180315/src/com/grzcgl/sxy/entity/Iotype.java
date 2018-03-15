package com.grzcgl.sxy.entity;

public class Iotype {
/*  `typesign` int(20) NOT NULL COMMENT '标识',
  `typename` varchar(20) NOT NULL COMMENT '类型名称 （收入或收支）',
  `typeintro` varchar(20) NOT NULL COMMENT '类别',
  PRIMARY KEY (`typesign`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/
	private int typesign;//标识
	private String typename;//类型名称 （收入或收支）
	private String typeintro;//类别

	
	public int getTypesign() {
		return typesign;
	}
	public void setTypesign(int typesign) {
		this.typesign = typesign;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public String getTypeintro() {
		return typeintro;
	}
	public void setTypeintro(String typeintro) {
		this.typeintro = typeintro;
	}
	@Override
	public String toString() {
		return "Iotype [typesign=" + typesign + ", typename=" + typename + ", typeintro=" + typeintro + "]";
	}
	
	
}
