package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class ShainServiceImpl implements ShainService {
	
	private final ShainRepository shainRepository;
	
	//ShainRepositoryのDI化
	public ShainServiceImpl(ShainRepository shainRepository) {
		this.shainRepository = shainRepository;
	}

	@Override
	public String findByNo(String number) {
		
		String name = shainRepository.selectByNo(number);
		return name;
	}

}
