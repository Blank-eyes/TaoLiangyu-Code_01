package com.tly.utils;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

public class PhoneCode {

	private static String code;
	
	public static void main(String[] args) {
		 String phone ="18792890238";
		 getphoneMsg(phone);
	}
	
	public static String getphoneMsg(String mobile) {
		System.out.println("手机号码为："+mobile);
		
		if(null==mobile || "".equals(mobile)) {
			System.out.println("手机号为空");
			return "";
		}
		
		//短信验证--阿里大雨工具
		//设置超时i时间
		System.setProperty(StaticPeram.defaultConnectTIMEOUT, StaticPeram.Timeout);
		System.setProperty(StaticPeram.defaultReadTIMEOUT, StaticPeram.Timeout);
		//初始化ascClient
		IClientProfile profile =DefaultProfile.getProfile("cn-hangzhou", StaticPeram.accessKEYID, StaticPeram.accessKEYSecret);
		try {
			DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", StaticPeram.PRODUCT, StaticPeram.DOMAIN);
		} catch (ClientException e) {
			e.printStackTrace();
		}
		//获取验证码
		code=vCode();
		System.out.println("验证码为: "+code);
		IAcsClient acsClient=new DefaultAcsClient(profile);
		//组装请求对象
		SendSmsRequest request = new SendSmsRequest();
		//使用post提交
		request.setMethod(MethodType.POST);

		// 必填:待发送手机号。支持以逗号分隔的形式进行批量调用，批量上限为1000个手机号码,
		//批量调用相对于单条调用及时性稍有延迟,验证码类型的短信推荐使用单条调用的方式
		request.setPhoneNumbers(mobile);
		request.setSignName(StaticPeram.SignNAME);
		request.setTemplateCode(StaticPeram.TemplateCODE);

		request.setTemplateParam("{ \"code\":\""+code+"\"}");
		SendSmsResponse sendSmsResponse;
		try {
			sendSmsResponse=acsClient.getAcsResponse(request);
			if(null!=sendSmsResponse.getCode() && "OK".equals(sendSmsResponse.getCode())) {
				System.out.println("获取验证码成功。。。");
			}else {
				System.out.println("获取验证码失败。。。"+sendSmsResponse.getCode());
			}
		} catch (ClientException e) {
			e.printStackTrace();
		}
		return "true";
	}
	public static String vCode(){
		String vcode="";
		for(int i=0;i<6;i++) {
			vcode+=(int)(Math.random()*9);
			//vcode = vcode + (int)(Math.random() * 9);
		}
		return vcode;
	}
}
