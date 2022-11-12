package com.ags.wordmemorizing.controller;

import com.ags.wordmemorizing.model.GenericResponse;
import com.ags.wordmemorizing.service.WordPackageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("word")
public class WordController {

    public final WordPackageService wordPackageService;

    public WordController(WordPackageService wordPackageService) {
        this.wordPackageService = wordPackageService;
    }

    @GetMapping("/packages")
    public GenericResponse getWordPackages(){
        GenericResponse response = new GenericResponse();
        response.setData(wordPackageService.getWordPackages());
        return response;
    }
}
