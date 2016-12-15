package com.dr.action;

import java.util.List;

import com.dr.dao.CwDataMapper;
import com.dr.vo.CwData;
import com.opensymphony.xwork2.ActionContext;

public class CwAciton {
	    private CwDataMapper cwdao;
	    
	    private String dataid; //培训资料的编号
	    
	    private String datatitle;  //培训资料的主题
	    
	    private String datatype;  //培训资料的类型
	    
	    private String datacontent;  //培训资料的内容
	    
	    private String datapubltime;  //培训公布的时间
	    public CwDataMapper getCwdao() {
			return cwdao;
		}

		public void setCwdao(CwDataMapper cwdao) {
			this.cwdao = cwdao;
		}

		public String getDataid() {
			return dataid;
		}

		public void setDataid(String dataid) {
			this.dataid = dataid;
		}

		public String getDatatitle() {
			return datatitle;
		}

		public void setDatatitle(String datatitle) {
			this.datatitle = datatitle;
		}

		public String getDatatype() {
			return datatype;
		}

		public void setDatatype(String datatype) {
			this.datatype = datatype;
		}

		public String getDatacontent() {
			return datacontent;
		}

		public void setDatacontent(String datacontent) {
			this.datacontent = datacontent;
		}

		public String getDatapubltime() {
			return datapubltime;
		}

		public void setDatapubltime(String datapubltime) {
			this.datapubltime = datapubltime;
		}
		/*
		 * 获取全部的
		 */
       public String query(){
         System.out.println("==============query===============");

           List<CwData> list=cwdao.queryAll();
    	   for(int i=0;i<list.size();i++){
    		   System.out.println(list.get(i).getDatacontent());
    	   }

    	   ActionContext context=ActionContext.getContext();
    	   String msg="";
    	   if(list.size()>0 && list !=null){
    		   context.put("list", list);
    		   msg="suc";
    	   }else{
    		   msg= "fail";  
    	   }
    	   return msg;
       }
       
       
       /*
		 * 新增员工
		 */
      public String insert(){
       System.out.println("=============insert================");
        CwData cwData =new CwData();
       // cwData.setDataid(dataid);
        cwData.setDatatitle(datatitle);
        cwData.setDatatype(datatype);
        cwData.setDatacontent(datacontent);
        cwData.setDatapubltime(datapubltime);
         int flag=cwdao.insert(cwData);
         System.out.println(flag);
         String msg="";
         if(flag==1){
        	 msg= "suc";
         }else{
         
        	 msg="fail";
         }
   	     return msg;
      }
      
      
        /*
		 * 通过员工id删除员工
		 */
    public String delete(){
     System.out.println("=============delete================");
       int flag=cwdao.deleteByPrimaryKey(dataid);
       System.out.println("dataid="+dataid);
       String msg="";
       System.out.println("flag="+flag);
       if(flag==1){
      	 msg= "success";
       }else{
       
      	 msg="fail";
       }
 	     return msg;
    }
    
    
    /*
	 * 通过员工id获取员工信息
	 */
	 public String queryById(){
	 System.out.println("=============queryById================");
	   
	   CwData record=cwdao.selectByPrimaryKey(dataid);
	   System.out.println("dataid="+dataid);
	   String msg="";
	   ActionContext context=ActionContext.getContext();
	   if( record !=null){
		   context.put("record", record);
		   msg= "querybyId";
	   }else{
	     
	  	   msg="fail";
	   }
		   return msg;
	}

	    /*
		 * 通过员工id获取员工信息
		 */
		 public String queryByid(){
		 System.out.println("=============queryByid================");
		   
		   CwData record=cwdao.selectByPrimaryKey(dataid);
		   System.out.println("dataid="+dataid);
		   String msg="";
		   ActionContext context=ActionContext.getContext();
		   if( record !=null){
			   context.put("record", record);
			   msg= "motify";
		   }else{
		     
		  	   msg="fail";
		   }
			   return msg;
		}
	 
	 
	 /*
		 * 修改员工信息
		 */
		 public String update(){
		   
		 System.out.println("=============update================");
	        CwData cwData =new CwData();
	        cwData.setDataid(dataid);
	        System.out.println(dataid);
	        
	        cwData.setDatatitle(datatitle);
	        
	        cwData.setDatatype(datatype);
	        System.out.println(datatype);
	          

	        cwData.setDatacontent(datacontent);
	        System.out.println(datacontent);

	        cwData.setDatapubltime(datapubltime);
	        System.out.println(datapubltime);

	         int flag=cwdao.updateByPrimaryKey(cwData);
	         System.out.println("flag="+flag);
	         String msg="";
	         if(flag==1){
	        	 msg= "success";
	         }else{
	         
	        	 msg="fail";
	         }
	   	     return msg;

		 }
}
