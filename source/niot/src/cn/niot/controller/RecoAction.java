package cn.niot.controller;

import com.opensymphony.xwork2.ActionSupport;

import cn.niot.dao.*;
import cn.niot.rule.RuleFunction;

public class RecoAction extends ActionSupport {
	/**
	 * @return
	 */
	private String iotID;
	
	
	public String getIotID() {
		return iotID;
	}

	public void setIotID(String iotID) {
		this.iotID = iotID;
	}
	
	private String Msg;    // ���һ������


	public String getMsg() {    // ���getter
	return Msg;
	}
	public String execute() {
		if (iotID.equals("123456")){
			Msg = "                   "+ iotID + " is ID type A";     // �߼�����
		} else{
			Msg = "                   "+ iotID + " is not ID type A";     // �߼�����
		}
		
//		RecoDao recodao = RecoDao.getRecoDao();
//		recodao.getAdminDivisionID("110114");
		
		char [] IDstr = new char[4];
		IDstr[0] = '1';
		IDstr[1] = '1';
		IDstr[2] = '0';
		IDstr[3] = '1';
		int [] index = new int[4];
		index[0] = 0;
		index[1] = 1;
		index[2] = 2;
		index[3] = 3;
		System.out.println(RuleFunction.First4CharsofAdminDivisionforCiga(IDstr, 4, index, 4));
		
		return "sucess"; //Ԥ���峣��
	} 

}