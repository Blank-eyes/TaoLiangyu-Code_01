package com.tly.utils;

public class StaticPeram {

	/**
	 * 手机验证部分配置
	 */

	// 设置超时时间
	public static final String defaultConnectTIMEOUT = "sun.net.client.defaultConnectTimeout";
	public static final String defaultReadTIMEOUT = "sun.net.client.defalutReadTimeout";
	public static final String Timeout = "10000";
	// 初始化ascClient需要的几个参数
	public static final String PRODUCT = "Dysmsapi"; //短信api产品名称（产品名固定，无需修改）
	public static final String DOMAIN = "dysmsapi.aliyuncs.com"; //短信api产品域名（接口地址固定，无需修改）
	
	//替换成自己的AK
	public static final String accessKEYID="LTAI4FnEEWBtbe18txRdJ217";
	public static final String accessKEYSecret="HCvid7ndlLV9cZgo1wMAPSwi00oMWA";
	//短信签名
	public static final String SignNAME="甘道夫短信验证";
	public static final String TemplateCODE="SMS_173347804";
	
	

}
