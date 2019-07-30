package com.codeclan.example.FolderStructure;

import com.codeclan.example.FolderStructure.models.File;
import com.codeclan.example.FolderStructure.models.Folder;
import com.codeclan.example.FolderStructure.models.User;
import com.codeclan.example.FolderStructure.repository.FileRepository;
import com.codeclan.example.FolderStructure.repository.FolderRepository;
import com.codeclan.example.FolderStructure.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FolderStructureApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;


	@Test
	public void contextLoads() {
	}



	@Test
	public void canCreateFileStructure() {
		User userA = new User("Joe Blogg");
		userRepository.save(userA);
		Folder folderA = new Folder("ROOT_ONE", userA);
		folderRepository.save(folderA);
		File fileA = new File("test", "/home/", 20, folderA);
		fileRepository.save(fileA);

//		folderA.addFile(fileA);
//		userA.addFolder(folderA);

	}

}
