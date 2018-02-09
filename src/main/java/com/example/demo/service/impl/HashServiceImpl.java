package com.example.demo.service.impl;


import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;

import com.example.demo.service.HashService;

@Component("hashServiceImpl")
public class HashServiceImpl implements HashService{

	@Override
	public String encode(String string) {
		String md5Hex = DigestUtils
			      .md5Hex(string).toUpperCase();
		return md5Hex;
	}

}
