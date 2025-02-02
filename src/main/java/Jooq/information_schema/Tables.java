/**
 * This class is generated by jOOQ
 */
package Jooq.information_schema;


import Jooq.information_schema.tables.AdministrableRoleAuthorizations;
import Jooq.information_schema.tables.ApplicableRoles;
import Jooq.information_schema.tables.Attributes;
import Jooq.information_schema.tables.CharacterSets;
import Jooq.information_schema.tables.CheckConstraintRoutineUsage;
import Jooq.information_schema.tables.CheckConstraints;
import Jooq.information_schema.tables.CollationCharacterSetApplicability;
import Jooq.information_schema.tables.Collations;
import Jooq.information_schema.tables.ColumnColumnUsage;
import Jooq.information_schema.tables.ColumnDomainUsage;
import Jooq.information_schema.tables.ColumnOptions;
import Jooq.information_schema.tables.ColumnPrivileges;
import Jooq.information_schema.tables.ColumnUdtUsage;
import Jooq.information_schema.tables.Columns;
import Jooq.information_schema.tables.ConstraintColumnUsage;
import Jooq.information_schema.tables.ConstraintTableUsage;
import Jooq.information_schema.tables.DataTypePrivileges;
import Jooq.information_schema.tables.DomainConstraints;
import Jooq.information_schema.tables.DomainUdtUsage;
import Jooq.information_schema.tables.Domains;
import Jooq.information_schema.tables.ElementTypes;
import Jooq.information_schema.tables.EnabledRoles;
import Jooq.information_schema.tables.ForeignDataWrapperOptions;
import Jooq.information_schema.tables.ForeignDataWrappers;
import Jooq.information_schema.tables.ForeignServerOptions;
import Jooq.information_schema.tables.ForeignServers;
import Jooq.information_schema.tables.ForeignTableOptions;
import Jooq.information_schema.tables.ForeignTables;
import Jooq.information_schema.tables.InformationSchemaCatalogName;
import Jooq.information_schema.tables.KeyColumnUsage;
import Jooq.information_schema.tables.Parameters;
import Jooq.information_schema.tables.ReferentialConstraints;
import Jooq.information_schema.tables.RoleColumnGrants;
import Jooq.information_schema.tables.RoleRoutineGrants;
import Jooq.information_schema.tables.RoleTableGrants;
import Jooq.information_schema.tables.RoleUdtGrants;
import Jooq.information_schema.tables.RoleUsageGrants;
import Jooq.information_schema.tables.RoutinePrivileges;
import Jooq.information_schema.tables.Routines;
import Jooq.information_schema.tables.Schemata;
import Jooq.information_schema.tables.Sequences;
import Jooq.information_schema.tables.SqlFeatures;
import Jooq.information_schema.tables.SqlImplementationInfo;
import Jooq.information_schema.tables.SqlLanguages;
import Jooq.information_schema.tables.SqlPackages;
import Jooq.information_schema.tables.SqlParts;
import Jooq.information_schema.tables.SqlSizing;
import Jooq.information_schema.tables.SqlSizingProfiles;
import Jooq.information_schema.tables.TableConstraints;
import Jooq.information_schema.tables.TablePrivileges;
import Jooq.information_schema.tables.Transforms;
import Jooq.information_schema.tables.TriggeredUpdateColumns;
import Jooq.information_schema.tables.Triggers;
import Jooq.information_schema.tables.UdtPrivileges;
import Jooq.information_schema.tables.UsagePrivileges;
import Jooq.information_schema.tables.UserDefinedTypes;
import Jooq.information_schema.tables.UserMappingOptions;
import Jooq.information_schema.tables.UserMappings;
import Jooq.information_schema.tables.ViewColumnUsage;
import Jooq.information_schema.tables.ViewRoutineUsage;
import Jooq.information_schema.tables.ViewTableUsage;
import Jooq.information_schema.tables.Views;
import Jooq.information_schema.tables._PgForeignDataWrappers;
import Jooq.information_schema.tables._PgForeignServers;
import Jooq.information_schema.tables._PgForeignTableColumns;
import Jooq.information_schema.tables._PgForeignTables;
import Jooq.information_schema.tables._PgUserMappings;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in information_schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>information_schema._pg_foreign_data_wrappers</code>.
     */
    public static final _PgForeignDataWrappers _PG_FOREIGN_DATA_WRAPPERS = Jooq.information_schema.tables._PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS;

    /**
     * The table <code>information_schema._pg_foreign_servers</code>.
     */
    public static final _PgForeignServers _PG_FOREIGN_SERVERS = Jooq.information_schema.tables._PgForeignServers._PG_FOREIGN_SERVERS;

    /**
     * The table <code>information_schema._pg_foreign_table_columns</code>.
     */
    public static final _PgForeignTableColumns _PG_FOREIGN_TABLE_COLUMNS = Jooq.information_schema.tables._PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS;

    /**
     * The table <code>information_schema._pg_foreign_tables</code>.
     */
    public static final _PgForeignTables _PG_FOREIGN_TABLES = Jooq.information_schema.tables._PgForeignTables._PG_FOREIGN_TABLES;

    /**
     * The table <code>information_schema._pg_user_mappings</code>.
     */
    public static final _PgUserMappings _PG_USER_MAPPINGS = Jooq.information_schema.tables._PgUserMappings._PG_USER_MAPPINGS;

    /**
     * The table <code>information_schema.administrable_role_authorizations</code>.
     */
    public static final AdministrableRoleAuthorizations ADMINISTRABLE_ROLE_AUTHORIZATIONS = Jooq.information_schema.tables.AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS;

    /**
     * The table <code>information_schema.applicable_roles</code>.
     */
    public static final ApplicableRoles APPLICABLE_ROLES = Jooq.information_schema.tables.ApplicableRoles.APPLICABLE_ROLES;

    /**
     * The table <code>information_schema.attributes</code>.
     */
    public static final Attributes ATTRIBUTES = Jooq.information_schema.tables.Attributes.ATTRIBUTES;

    /**
     * The table <code>information_schema.character_sets</code>.
     */
    public static final CharacterSets CHARACTER_SETS = Jooq.information_schema.tables.CharacterSets.CHARACTER_SETS;

    /**
     * The table <code>information_schema.check_constraint_routine_usage</code>.
     */
    public static final CheckConstraintRoutineUsage CHECK_CONSTRAINT_ROUTINE_USAGE = Jooq.information_schema.tables.CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE;

    /**
     * The table <code>information_schema.check_constraints</code>.
     */
    public static final CheckConstraints CHECK_CONSTRAINTS = Jooq.information_schema.tables.CheckConstraints.CHECK_CONSTRAINTS;

    /**
     * The table <code>information_schema.collation_character_set_applicability</code>.
     */
    public static final CollationCharacterSetApplicability COLLATION_CHARACTER_SET_APPLICABILITY = Jooq.information_schema.tables.CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY;

    /**
     * The table <code>information_schema.collations</code>.
     */
    public static final Collations COLLATIONS = Jooq.information_schema.tables.Collations.COLLATIONS;

    /**
     * The table <code>information_schema.column_column_usage</code>.
     */
    public static final ColumnColumnUsage COLUMN_COLUMN_USAGE = Jooq.information_schema.tables.ColumnColumnUsage.COLUMN_COLUMN_USAGE;

    /**
     * The table <code>information_schema.column_domain_usage</code>.
     */
    public static final ColumnDomainUsage COLUMN_DOMAIN_USAGE = Jooq.information_schema.tables.ColumnDomainUsage.COLUMN_DOMAIN_USAGE;

    /**
     * The table <code>information_schema.column_options</code>.
     */
    public static final ColumnOptions COLUMN_OPTIONS = Jooq.information_schema.tables.ColumnOptions.COLUMN_OPTIONS;

    /**
     * The table <code>information_schema.column_privileges</code>.
     */
    public static final ColumnPrivileges COLUMN_PRIVILEGES = Jooq.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES;

    /**
     * The table <code>information_schema.column_udt_usage</code>.
     */
    public static final ColumnUdtUsage COLUMN_UDT_USAGE = Jooq.information_schema.tables.ColumnUdtUsage.COLUMN_UDT_USAGE;

    /**
     * The table <code>information_schema.columns</code>.
     */
    public static final Columns COLUMNS = Jooq.information_schema.tables.Columns.COLUMNS;

    /**
     * The table <code>information_schema.constraint_column_usage</code>.
     */
    public static final ConstraintColumnUsage CONSTRAINT_COLUMN_USAGE = Jooq.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE;

    /**
     * The table <code>information_schema.constraint_table_usage</code>.
     */
    public static final ConstraintTableUsage CONSTRAINT_TABLE_USAGE = Jooq.information_schema.tables.ConstraintTableUsage.CONSTRAINT_TABLE_USAGE;

    /**
     * The table <code>information_schema.data_type_privileges</code>.
     */
    public static final DataTypePrivileges DATA_TYPE_PRIVILEGES = Jooq.information_schema.tables.DataTypePrivileges.DATA_TYPE_PRIVILEGES;

    /**
     * The table <code>information_schema.domain_constraints</code>.
     */
    public static final DomainConstraints DOMAIN_CONSTRAINTS = Jooq.information_schema.tables.DomainConstraints.DOMAIN_CONSTRAINTS;

    /**
     * The table <code>information_schema.domain_udt_usage</code>.
     */
    public static final DomainUdtUsage DOMAIN_UDT_USAGE = Jooq.information_schema.tables.DomainUdtUsage.DOMAIN_UDT_USAGE;

    /**
     * The table <code>information_schema.domains</code>.
     */
    public static final Domains DOMAINS = Jooq.information_schema.tables.Domains.DOMAINS;

    /**
     * The table <code>information_schema.element_types</code>.
     */
    public static final ElementTypes ELEMENT_TYPES = Jooq.information_schema.tables.ElementTypes.ELEMENT_TYPES;

    /**
     * The table <code>information_schema.enabled_roles</code>.
     */
    public static final EnabledRoles ENABLED_ROLES = Jooq.information_schema.tables.EnabledRoles.ENABLED_ROLES;

    /**
     * The table <code>information_schema.foreign_data_wrapper_options</code>.
     */
    public static final ForeignDataWrapperOptions FOREIGN_DATA_WRAPPER_OPTIONS = Jooq.information_schema.tables.ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS;

    /**
     * The table <code>information_schema.foreign_data_wrappers</code>.
     */
    public static final ForeignDataWrappers FOREIGN_DATA_WRAPPERS = Jooq.information_schema.tables.ForeignDataWrappers.FOREIGN_DATA_WRAPPERS;

    /**
     * The table <code>information_schema.foreign_server_options</code>.
     */
    public static final ForeignServerOptions FOREIGN_SERVER_OPTIONS = Jooq.information_schema.tables.ForeignServerOptions.FOREIGN_SERVER_OPTIONS;

    /**
     * The table <code>information_schema.foreign_servers</code>.
     */
    public static final ForeignServers FOREIGN_SERVERS = Jooq.information_schema.tables.ForeignServers.FOREIGN_SERVERS;

    /**
     * The table <code>information_schema.foreign_table_options</code>.
     */
    public static final ForeignTableOptions FOREIGN_TABLE_OPTIONS = Jooq.information_schema.tables.ForeignTableOptions.FOREIGN_TABLE_OPTIONS;

    /**
     * The table <code>information_schema.foreign_tables</code>.
     */
    public static final ForeignTables FOREIGN_TABLES = Jooq.information_schema.tables.ForeignTables.FOREIGN_TABLES;

    /**
     * The table <code>information_schema.information_schema_catalog_name</code>.
     */
    public static final InformationSchemaCatalogName INFORMATION_SCHEMA_CATALOG_NAME = Jooq.information_schema.tables.InformationSchemaCatalogName.INFORMATION_SCHEMA_CATALOG_NAME;

    /**
     * The table <code>information_schema.key_column_usage</code>.
     */
    public static final KeyColumnUsage KEY_COLUMN_USAGE = Jooq.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE;

    /**
     * The table <code>information_schema.parameters</code>.
     */
    public static final Parameters PARAMETERS = Jooq.information_schema.tables.Parameters.PARAMETERS;

    /**
     * The table <code>information_schema.referential_constraints</code>.
     */
    public static final ReferentialConstraints REFERENTIAL_CONSTRAINTS = Jooq.information_schema.tables.ReferentialConstraints.REFERENTIAL_CONSTRAINTS;

    /**
     * The table <code>information_schema.role_column_grants</code>.
     */
    public static final RoleColumnGrants ROLE_COLUMN_GRANTS = Jooq.information_schema.tables.RoleColumnGrants.ROLE_COLUMN_GRANTS;

    /**
     * The table <code>information_schema.role_routine_grants</code>.
     */
    public static final RoleRoutineGrants ROLE_ROUTINE_GRANTS = Jooq.information_schema.tables.RoleRoutineGrants.ROLE_ROUTINE_GRANTS;

    /**
     * The table <code>information_schema.role_table_grants</code>.
     */
    public static final RoleTableGrants ROLE_TABLE_GRANTS = Jooq.information_schema.tables.RoleTableGrants.ROLE_TABLE_GRANTS;

    /**
     * The table <code>information_schema.role_udt_grants</code>.
     */
    public static final RoleUdtGrants ROLE_UDT_GRANTS = Jooq.information_schema.tables.RoleUdtGrants.ROLE_UDT_GRANTS;

    /**
     * The table <code>information_schema.role_usage_grants</code>.
     */
    public static final RoleUsageGrants ROLE_USAGE_GRANTS = Jooq.information_schema.tables.RoleUsageGrants.ROLE_USAGE_GRANTS;

    /**
     * The table <code>information_schema.routine_privileges</code>.
     */
    public static final RoutinePrivileges ROUTINE_PRIVILEGES = Jooq.information_schema.tables.RoutinePrivileges.ROUTINE_PRIVILEGES;

    /**
     * The table <code>information_schema.routines</code>.
     */
    public static final Routines ROUTINES = Jooq.information_schema.tables.Routines.ROUTINES;

    /**
     * The table <code>information_schema.schemata</code>.
     */
    public static final Schemata SCHEMATA = Jooq.information_schema.tables.Schemata.SCHEMATA;

    /**
     * The table <code>information_schema.sequences</code>.
     */
    public static final Sequences SEQUENCES = Jooq.information_schema.tables.Sequences.SEQUENCES;

    /**
     * The table <code>information_schema.sql_features</code>.
     */
    public static final SqlFeatures SQL_FEATURES = Jooq.information_schema.tables.SqlFeatures.SQL_FEATURES;

    /**
     * The table <code>information_schema.sql_implementation_info</code>.
     */
    public static final SqlImplementationInfo SQL_IMPLEMENTATION_INFO = Jooq.information_schema.tables.SqlImplementationInfo.SQL_IMPLEMENTATION_INFO;

    /**
     * The table <code>information_schema.sql_languages</code>.
     */
    public static final SqlLanguages SQL_LANGUAGES = Jooq.information_schema.tables.SqlLanguages.SQL_LANGUAGES;

    /**
     * The table <code>information_schema.sql_packages</code>.
     */
    public static final SqlPackages SQL_PACKAGES = Jooq.information_schema.tables.SqlPackages.SQL_PACKAGES;

    /**
     * The table <code>information_schema.sql_parts</code>.
     */
    public static final SqlParts SQL_PARTS = Jooq.information_schema.tables.SqlParts.SQL_PARTS;

    /**
     * The table <code>information_schema.sql_sizing</code>.
     */
    public static final SqlSizing SQL_SIZING = Jooq.information_schema.tables.SqlSizing.SQL_SIZING;

    /**
     * The table <code>information_schema.sql_sizing_profiles</code>.
     */
    public static final SqlSizingProfiles SQL_SIZING_PROFILES = Jooq.information_schema.tables.SqlSizingProfiles.SQL_SIZING_PROFILES;

    /**
     * The table <code>information_schema.table_constraints</code>.
     */
    public static final TableConstraints TABLE_CONSTRAINTS = Jooq.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS;

    /**
     * The table <code>information_schema.table_privileges</code>.
     */
    public static final TablePrivileges TABLE_PRIVILEGES = Jooq.information_schema.tables.TablePrivileges.TABLE_PRIVILEGES;

    /**
     * The table <code>information_schema.tables</code>.
     */
    public static final Jooq.information_schema.tables.Tables TABLES = Jooq.information_schema.tables.Tables.TABLES;

    /**
     * The table <code>information_schema.transforms</code>.
     */
    public static final Transforms TRANSFORMS = Jooq.information_schema.tables.Transforms.TRANSFORMS;

    /**
     * The table <code>information_schema.triggered_update_columns</code>.
     */
    public static final TriggeredUpdateColumns TRIGGERED_UPDATE_COLUMNS = Jooq.information_schema.tables.TriggeredUpdateColumns.TRIGGERED_UPDATE_COLUMNS;

    /**
     * The table <code>information_schema.triggers</code>.
     */
    public static final Triggers TRIGGERS = Jooq.information_schema.tables.Triggers.TRIGGERS;

    /**
     * The table <code>information_schema.udt_privileges</code>.
     */
    public static final UdtPrivileges UDT_PRIVILEGES = Jooq.information_schema.tables.UdtPrivileges.UDT_PRIVILEGES;

    /**
     * The table <code>information_schema.usage_privileges</code>.
     */
    public static final UsagePrivileges USAGE_PRIVILEGES = Jooq.information_schema.tables.UsagePrivileges.USAGE_PRIVILEGES;

    /**
     * The table <code>information_schema.user_defined_types</code>.
     */
    public static final UserDefinedTypes USER_DEFINED_TYPES = Jooq.information_schema.tables.UserDefinedTypes.USER_DEFINED_TYPES;

    /**
     * The table <code>information_schema.user_mapping_options</code>.
     */
    public static final UserMappingOptions USER_MAPPING_OPTIONS = Jooq.information_schema.tables.UserMappingOptions.USER_MAPPING_OPTIONS;

    /**
     * The table <code>information_schema.user_mappings</code>.
     */
    public static final UserMappings USER_MAPPINGS = Jooq.information_schema.tables.UserMappings.USER_MAPPINGS;

    /**
     * The table <code>information_schema.view_column_usage</code>.
     */
    public static final ViewColumnUsage VIEW_COLUMN_USAGE = Jooq.information_schema.tables.ViewColumnUsage.VIEW_COLUMN_USAGE;

    /**
     * The table <code>information_schema.view_routine_usage</code>.
     */
    public static final ViewRoutineUsage VIEW_ROUTINE_USAGE = Jooq.information_schema.tables.ViewRoutineUsage.VIEW_ROUTINE_USAGE;

    /**
     * The table <code>information_schema.view_table_usage</code>.
     */
    public static final ViewTableUsage VIEW_TABLE_USAGE = Jooq.information_schema.tables.ViewTableUsage.VIEW_TABLE_USAGE;

    /**
     * The table <code>information_schema.views</code>.
     */
    public static final Views VIEWS = Jooq.information_schema.tables.Views.VIEWS;
}
