package com.ags.wordmemorizing.service;

import com.ags.wordmemorizing.model.WordPackage;
import com.ags.wordmemorizing.repository.WordPackageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordPackageService {

    public final WordPackageRepository wordPackageRepository;

    public WordPackageService(WordPackageRepository wordPackageRepository) {
        this.wordPackageRepository = wordPackageRepository;
    }

    public List<WordPackage> getWordPackages() {
        return wordPackageRepository.findAll();
    }
}
