package com.grzcgl.sxy.entity;

public class Iotype {
/*  `typesign` int(20) NOT NULL COMMENT '��ʶ',
  `typename` varchar(20) NOT NULL COMMENT '�������� ���������֧��',
  `typeintro` varchar(20) NOT NULL COMMENT '���',
  PRIMARY KEY (`typesign`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/
	private int typesign;//��ʶ
	private String typename;//�������� ���������֧��
	private String typeintro;//���

	
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
