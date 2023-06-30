package com.wildcodeschool.wizardsnpotions.repository;

import com.wildcodeschool.wizardsnpotions.entity.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WizardRepository extends JpaRepository<Wizard, Long> {
}
