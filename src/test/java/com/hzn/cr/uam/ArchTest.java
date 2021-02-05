package com.hzn.cr.uam;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {

        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.hzn.cr.uam");

        noClasses()
            .that()
                .resideInAnyPackage("com.hzn.cr.uam.service..")
            .or()
                .resideInAnyPackage("com.hzn.cr.uam.repository..")
            .should().dependOnClassesThat()
                .resideInAnyPackage("..com.hzn.cr.uam.web..")
        .because("Services and repositories should not depend on web layer")
        .check(importedClasses);
    }
}
