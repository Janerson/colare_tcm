package com.dom.colare.data.naming;

import org.hibernate.boot.model.naming.*;
import org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy;

public class ColareNameStrategy extends SpringImplicitNamingStrategy {

    @Override
    public Identifier determineIdentifierColumnName(ImplicitIdentifierColumnNameSource source) {
        Identifier id = this.toIdentifier(this.transformAttributePath(source.getIdentifierAttributePath()), source.getBuildingContext());
        System.out.println("determineIdentifierColumnName: "+id.getText());
        System.out.println("determineIdentifierColumnName: "+id.getCanonicalName());
        return id;
    }

    @Override
    public Identifier determineForeignKeyName(ImplicitForeignKeyNameSource source) {
        Identifier userProvidedIdentifier = source.getUserProvidedIdentifier();
        source.getBuildingContext().getBuildingOptions().getSchemaCharset();
        return userProvidedIdentifier != null ? userProvidedIdentifier :
                this.toIdentifier("FK_"
                                + source.getTableName().getText().toUpperCase() + "_"
                                + source.getReferencedTableName().getText().toUpperCase() + "_"
                                + source.getColumnNames().get(0).getText().toUpperCase(),
                        source.getBuildingContext());
    }

    @Override
    public Identifier determineUniqueKeyName(ImplicitUniqueKeyNameSource source) {
        Identifier userProvidedIdentifier = source.getUserProvidedIdentifier();
        return userProvidedIdentifier != null ? userProvidedIdentifier :
                this.toIdentifier("UK_"
                        + source.getTableName().getText().toUpperCase() + "_"
                        + source.getColumnNames().get(0).getText().toUpperCase(),
                        source.getBuildingContext());
    }

    @Override
    public Identifier determineIndexName(ImplicitIndexNameSource source) {
        Identifier userProvidedIdentifier = source.getUserProvidedIdentifier();
        return userProvidedIdentifier != null ? userProvidedIdentifier :
                this.toIdentifier("IDX_"
                        + source.getTableName().getText().toUpperCase() + "_"
                        + source.getColumnNames().get(0).getText().toUpperCase(),
                        source.getBuildingContext());
    }
}
