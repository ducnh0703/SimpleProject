/**
 * This class is generated by jOOQ
 */
package Jooq.information_schema.tables.records;


import Jooq.information_schema.tables.CharacterSets;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CharacterSetsRecord extends TableRecordImpl<CharacterSetsRecord> implements Record8<String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -1311606640;

    /**
     * Setter for <code>information_schema.character_sets.character_set_catalog</code>.
     */
    public void setCharacterSetCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.character_sets.character_set_catalog</code>.
     */
    public String getCharacterSetCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.character_sets.character_set_schema</code>.
     */
    public void setCharacterSetSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.character_sets.character_set_schema</code>.
     */
    public String getCharacterSetSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.character_sets.character_set_name</code>.
     */
    public void setCharacterSetName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.character_sets.character_set_name</code>.
     */
    public String getCharacterSetName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.character_sets.character_repertoire</code>.
     */
    public void setCharacterRepertoire(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.character_sets.character_repertoire</code>.
     */
    public String getCharacterRepertoire() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.character_sets.form_of_use</code>.
     */
    public void setFormOfUse(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.character_sets.form_of_use</code>.
     */
    public String getFormOfUse() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.character_sets.default_collate_catalog</code>.
     */
    public void setDefaultCollateCatalog(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.character_sets.default_collate_catalog</code>.
     */
    public String getDefaultCollateCatalog() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.character_sets.default_collate_schema</code>.
     */
    public void setDefaultCollateSchema(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.character_sets.default_collate_schema</code>.
     */
    public String getDefaultCollateSchema() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.character_sets.default_collate_name</code>.
     */
    public void setDefaultCollateName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.character_sets.default_collate_name</code>.
     */
    public String getDefaultCollateName() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return CharacterSets.CHARACTER_SETS.CHARACTER_SET_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CharacterSets.CHARACTER_SETS.CHARACTER_SET_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CharacterSets.CHARACTER_SETS.CHARACTER_SET_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CharacterSets.CHARACTER_SETS.CHARACTER_REPERTOIRE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CharacterSets.CHARACTER_SETS.FORM_OF_USE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CharacterSets.CHARACTER_SETS.DEFAULT_COLLATE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return CharacterSets.CHARACTER_SETS.DEFAULT_COLLATE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return CharacterSets.CHARACTER_SETS.DEFAULT_COLLATE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCharacterSetCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCharacterSetSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCharacterSetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCharacterRepertoire();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFormOfUse();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDefaultCollateCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDefaultCollateSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDefaultCollateName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterSetsRecord value1(String value) {
        setCharacterSetCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterSetsRecord value2(String value) {
        setCharacterSetSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterSetsRecord value3(String value) {
        setCharacterSetName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterSetsRecord value4(String value) {
        setCharacterRepertoire(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterSetsRecord value5(String value) {
        setFormOfUse(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterSetsRecord value6(String value) {
        setDefaultCollateCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterSetsRecord value7(String value) {
        setDefaultCollateSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterSetsRecord value8(String value) {
        setDefaultCollateName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterSetsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CharacterSetsRecord
     */
    public CharacterSetsRecord() {
        super(CharacterSets.CHARACTER_SETS);
    }

    /**
     * Create a detached, initialised CharacterSetsRecord
     */
    public CharacterSetsRecord(String characterSetCatalog, String characterSetSchema, String characterSetName, String characterRepertoire, String formOfUse, String defaultCollateCatalog, String defaultCollateSchema, String defaultCollateName) {
        super(CharacterSets.CHARACTER_SETS);

        set(0, characterSetCatalog);
        set(1, characterSetSchema);
        set(2, characterSetName);
        set(3, characterRepertoire);
        set(4, formOfUse);
        set(5, defaultCollateCatalog);
        set(6, defaultCollateSchema);
        set(7, defaultCollateName);
    }
}
