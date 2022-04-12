package com.roleManagement.rolebasedManagement;

//import com.roleManagement.rolebasedManagement.entity.PermissionOne;
//import com.roleManagement.rolebasedManagement.entity.RoleOne;
//import com.roleManagement.rolebasedManagement.repository.PermissionOneRepository;
//import com.roleManagement.rolebasedManagement.repository.RoleOneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class RolebasedManagementApplication  {
//@Autowired
//private RoleOneRepository roleOneRepository;
//@Autowired
//private PermissionOneRepository permissionOneRepository;
	public static void main(String[] args) {
		SpringApplication.run(RolebasedManagementApplication.class, args);
	}
//implements CommandLineRunner
//	@Override
//	public void run(String... args) throws Exception {
//		this.roleOneRepository.deleteAll();
//		RoleOne roleOne=new RoleOne("Admin");
//		RoleOne manager=new RoleOne("Manager");
//		RoleOne user=new RoleOne("User");
//		this.permissionOneRepository.deleteAll();
//		PermissionOne p1=new PermissionOne("p1");
//		PermissionOne p2=new PermissionOne("p2");
//		PermissionOne p3=new PermissionOne("p3");
////adding roleOne referances permissionOne
//		roleOne.getPermissionOne().add(p1);
//		roleOne.getPermissionOne().add(p2);
//		roleOne.getPermissionOne().add(p3);
//		manager.getPermissionOne().add(p1);
//		manager.getPermissionOne().add(p2);
//		user.getPermissionOne().add(p3);
////adding permissionOne referances roleOne
//		p1.getRoleOnes().add(roleOne);
//		p2.getRoleOnes().add(roleOne);
//		p3.getRoleOnes().add(roleOne);
//		p2.getRoleOnes().add(manager);
//		p3.getRoleOnes().add(manager);
//		p3.getRoleOnes().add(user);
//this.roleOneRepository.save(roleOne);
 	}

