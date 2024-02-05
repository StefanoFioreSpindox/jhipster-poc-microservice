package it.spindox.jhipsterpoc.products;

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
            .importPackages("it.spindox.jhipsterpoc.products");

        noClasses()
            .that()
            .resideInAnyPackage("it.spindox.jhipsterpoc.products.service..")
            .or()
            .resideInAnyPackage("it.spindox.jhipsterpoc.products.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..it.spindox.jhipsterpoc.products.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
