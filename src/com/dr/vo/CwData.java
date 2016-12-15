package com.dr.vo;

public class CwData {
    private String dataid; //培训资料的编号
  
	private String datatitle;  //培训资料的主题

    private String datatype;  //培训资料的类型
 
    private String datacontent;  //培训资料的内容

    private String datapubltime;  //培训公布的时间
    
    private int intcount;     //分页的实现

    public int getIntcount() {
		return intcount;
	}

	public void setIntcount(int intcount) {
		this.intcount = intcount;
	}

	public void setDataid(String dataid) {
    	this.dataid = dataid;
    }
    
//    public BigDecimal getDataid() {
//        return dataid;
//    }
//
//    public void setDataid(BigDecimal dataid) {
//        this.dataid = dataid;
//    }

    public String getDatatitle() {
        return datatitle;
    }

    public String getDataid() {
		return dataid;
	}

	public void setDatatitle(String datatitle) {
        this.datatitle = datatitle == null ? null : datatitle.trim();
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype == null ? null : datatype.trim();
    }

    public String getDatacontent() {
        return datacontent;
    }

    public void setDatacontent(String datacontent) {
        this.datacontent = datacontent == null ? null : datacontent.trim();
    }

    public String getDatapubltime() {
        return datapubltime;
    }

    public void setDatapubltime(String datapubltime) {
        this.datapubltime = datapubltime == null ? null : datapubltime.trim();
    }
}