package it.spindox.jhipsterpoc.gateway;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("it.spindox.jhipsterpoc.gateway");

        noClasses()
            .that()
            .resideInAnyPackage("it.spindox.jhipsterpoc.gateway.service..")
            .or()
            .resideInAnyPackage("it.spindox.jhipsterpoc.gateway.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..it.spindox.jhipsterpoc.gateway.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
