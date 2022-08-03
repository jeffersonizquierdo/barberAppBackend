package com.barberapp.servicies.barbershop;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.barberapp.entities.Barbershop;
import com.barberapp.repositories.RepositoryBarbershop;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Service
public class ServicieBarbershopImpl implements ServiceBarbershop{
	
	@Autowired(required = true) private RepositoryBarbershop repositoryBarbershop;

	@Override
	@Transactional(readOnly = true)
	public List<Barbershop> findAll() {
		
		return repositoryBarbershop.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Barbershop> findAll(Pageable pageable) {
		
		return repositoryBarbershop.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Barbershop> findById(Long id) {
		
		return repositoryBarbershop.findById(id);
	}

	@Override
	public Barbershop save(Barbershop barbershop) {
		
		return repositoryBarbershop.save(barbershop);
	}

	@Override
	public void deleteById(Long id) {
		repositoryBarbershop.deleteById(id);
		
	}
	
	Cloudinary cloudinary;
	private Map<String, String> valuesMap = new  HashMap<>();
	public ServicieBarbershopImpl() {
		valuesMap.put("cloud name", "dmfy3y2nz");
		valuesMap.put("api key", "586515517252353");
		valuesMap.put("api secret", "9QGxkX83AmSaGlQRXWD1CJfEEDE");
		cloudinary = new Cloudinary(valuesMap);
	}
	
	public Map upload(MultipartFile multipartFile) {
		File file = convert(multipartFile);
		Map result = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
		file.delete();
		return result;
	}
	
	public Map delete(String id) {
		Map result = cloudinary.uploader().destroy(id, ObjectUtils.emptyMap());
		return result;
	}
	
	private File convert(MultipartFile multipartFile) {
		File file = new File(multipartFile.getOriginalFilename());
		FileOutputStream fo = new FileOutputStream(file);
		fo.write(multipartFile.getBytes());
		fo.close(); 
		return file;
	}

}
