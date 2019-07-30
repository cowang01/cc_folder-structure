package com.codeclan.example.FolderStructure.components;

import com.codeclan.example.FolderStructure.models.File;
import com.codeclan.example.FolderStructure.models.Folder;
import com.codeclan.example.FolderStructure.models.User;
import com.codeclan.example.FolderStructure.repository.FileRepository;
import com.codeclan.example.FolderStructure.repository.FolderRepository;
import com.codeclan.example.FolderStructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){


        User userA = new User("Summer");
        userRepository.save(userA);

        User userB = new User("Winter");
        userRepository.save(userB);

        User userC = new User("Autumn");
        userRepository.save(userC);

        User userD = new User("Spring");
        userRepository.save(userD);


        Folder folderA = new Folder("green", userA);
        folderRepository.save(folderA);

        Folder folderB = new Folder("blue", userA);
        folderRepository.save(folderB);

        Folder folderC = new Folder("orange", userB);
        folderRepository.save(folderC);

        Folder folderD = new Folder("red", userC);
        folderRepository.save(folderD);

        Folder folderE = new Folder("yellow", userC);
        folderRepository.save(folderE);

        Folder folderF = new Folder("white", userD);
        folderRepository.save(folderF);


        File fileA = new File("alpha", ".exe", 40, folderA);
        fileRepository.save(fileA);

        File fileB = new File("beta", ".html", 40, folderA);
        fileRepository.save(fileB);

        File fileC = new File("charlie", ".md", 40, folderA);
        fileRepository.save(fileC);

        File fileD = new File("delta", ".md", 40, folderB);
        fileRepository.save(fileD);

        File fileE = new File("echo", ".md", 40, folderC);
        fileRepository.save(fileE);

        File fileF = new File("foxtrot", ".exe", 40, folderD);
        fileRepository.save(fileF);

        File fileG = new File("golf", ".md", 40, folderD);
        fileRepository.save(fileG);

        File fileH = new File("hotel", ".md", 40, folderF);
        fileRepository.save(fileH);
    }
}
