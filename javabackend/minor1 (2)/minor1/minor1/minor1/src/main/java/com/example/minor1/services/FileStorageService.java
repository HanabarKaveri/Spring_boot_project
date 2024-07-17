package com.example.minor1.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileStorageService {
    private final String uploadDir = "uploads/";

    public FileStorageService() {
        // Create the upload directory if it doesn't exist
        File directory = new File(uploadDir);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    public String saveFile(MultipartFile file) throws IOException {
        // Get the file name
        String fileName = file.getOriginalFilename();
        // Get the file path
        Path filePath = Paths.get(uploadDir, fileName);
        // Save the file
        Files.write(filePath, file.getBytes());
        return fileName;
    }
}

