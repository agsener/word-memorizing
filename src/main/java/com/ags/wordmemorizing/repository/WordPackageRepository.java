package com.ags.wordmemorizing.repository;

import com.ags.wordmemorizing.model.WordPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordPackageRepository extends JpaRepository<WordPackage, String> {

}
