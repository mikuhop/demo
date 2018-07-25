package com.example.springcloud.service;

import java.util.List;

import com.atguigu.springcloud.entities.Dept;
import com.example.springcloud.entities.Dept;

public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
