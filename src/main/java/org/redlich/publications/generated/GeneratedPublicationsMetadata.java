package org.redlich.publications.generated;

import com.speedment.runtime.core.internal.AbstractApplicationMetadata;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * A {@link com.speedment.runtime.core.ApplicationMetadata} class for the {@link
 * com.speedment.runtime.config.Project} named publications. This class contains
 * the meta data present at code generation time.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public class GeneratedPublicationsMetadata extends AbstractApplicationMetadata {
    
    private final static String METADATA = init();
    
    private static String init() {
        final StringBuilder sb = new StringBuilder();
        initPart0(sb);
        initPart1(sb);
        initPart2(sb);
        initPart3(sb);
        initPart4(sb);
        initPart5(sb);
        initPart6(sb);
        return sb.toString();
    }
    
    @Override
    protected Optional<String> getMetadata() {
        return Optional.of(METADATA);
    }
    
    private static void initPart0(StringBuilder sb) {
        Stream.of(
            "{",
            "  \"config\" : {",
            "    \"expanded\" : true,",
            "    \"companyName\" : \"company\",",
            "    \"name\" : \"publications\",",
            "    \"packageLocation\" : \"src/main/java/\",",
            "    \"packageName\" : \"org.redlich.publications\",",
            "    \"dbmses\" : [",
            "      {",
            "        \"expanded\" : true,",
            "        \"port\" : 3306,",
            "        \"schemas\" : [",
            "          {",
            "            \"tables\" : [",
            "              {",
            "                \"foreignKeys\" : [",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"foreignKeyColumns\" : [",
            "                      {",
            "                        \"foreignDatabaseName\" : \"db\",",
            "                        \"foreignSchemaName\" : \"publications\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"state_id\",",
            "                        \"foreignColumnName\" : \"id\",",
            "                        \"foreignTableName\" : \"states\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"name\" : \"FKD9771048E2C4D1AB\",",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"expanded\" : true,",
            "                \"primaryKeyColumns\" : [",
            "                  {",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"ordinalPosition\" : 1",
            "                  }",
            "                ],",
            "                \"indexes\" : [",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : true,",
            "                    \"name\" : \"PRIMARY\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"id\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : false,",
            "                    \"name\" : \"FKD9771048E2C4D1AB\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"state_id\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"columns\" : [",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"autoIncrement\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"ordinalPosition\" : 1,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"version\",",
            "                    \"ordinalPosition\" : 2,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"prefix\",",
            "                    \"ordinalPosition\" : 3,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\","
        ).forEachOrdered(sb::append);
    }
    
    private static void initPart1(StringBuilder sb) {
        Stream.of(
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"last_name\",",
            "                    \"ordinalPosition\" : 4,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"first_name\",",
            "                    \"ordinalPosition\" : 5,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"middle_init\",",
            "                    \"ordinalPosition\" : 6,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"suffix\",",
            "                    \"ordinalPosition\" : 7,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"address\",",
            "                    \"ordinalPosition\" : 8,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"city\",",
            "                    \"ordinalPosition\" : 9,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"state_id\",",
            "                    \"ordinalPosition\" : 10,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"zip_code\",",
            "                    \"ordinalPosition\" : 11,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"home_phone\",",
            "                    \"ordinalPosition\" : 12,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"cell_phone\",",
            "                    \"ordinalPosition\" : 13,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"work_phone\",",
            "                    \"ordinalPosition\" : 14,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"home_email\",",
            "                    \"ordinalPosition\" : 15,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"work_email\",",
            "                    \"ordinalPosition\" : 16,"
        ).forEachOrdered(sb::append);
    }
    
    private static void initPart2(StringBuilder sb) {
        Stream.of(
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"name\" : \"authors\",",
            "                \"enabled\" : true",
            "              },",
            "              {",
            "                \"foreignKeys\" : [",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"foreignKeyColumns\" : [",
            "                      {",
            "                        \"foreignDatabaseName\" : \"db\",",
            "                        \"foreignSchemaName\" : \"publications\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"publisher_id\",",
            "                        \"foreignColumnName\" : \"id\",",
            "                        \"foreignTableName\" : \"publishers\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"name\" : \"FK37B8A3C77A7F3855\",",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"foreignKeyColumns\" : [",
            "                      {",
            "                        \"foreignDatabaseName\" : \"db\",",
            "                        \"foreignSchemaName\" : \"publications\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"author_id\",",
            "                        \"foreignColumnName\" : \"id\",",
            "                        \"foreignTableName\" : \"authors\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"name\" : \"FK37B8A3C794A38877\",",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"foreignKeyColumns\" : [",
            "                      {",
            "                        \"foreignDatabaseName\" : \"db\",",
            "                        \"foreignSchemaName\" : \"publications\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"type_id\",",
            "                        \"foreignColumnName\" : \"id\",",
            "                        \"foreignTableName\" : \"types\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"name\" : \"FK37B8A3C7D1FF4899\",",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"expanded\" : true,",
            "                \"primaryKeyColumns\" : [",
            "                  {",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"ordinalPosition\" : 1",
            "                  }",
            "                ],",
            "                \"indexes\" : [",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : true,",
            "                    \"name\" : \"PRIMARY\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"id\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : false,",
            "                    \"name\" : \"FK37B8A3C77A7F3855\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"publisher_id\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : false,",
            "                    \"name\" : \"FK37B8A3C794A38877\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\","
        ).forEachOrdered(sb::append);
    }
    
    private static void initPart3(StringBuilder sb) {
        Stream.of(
            "                        \"expanded\" : true,",
            "                        \"name\" : \"author_id\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : false,",
            "                    \"name\" : \"FK37B8A3C7D1FF4899\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"type_id\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"columns\" : [",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"autoIncrement\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"ordinalPosition\" : 1,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"version\",",
            "                    \"ordinalPosition\" : 2,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"type_id\",",
            "                    \"ordinalPosition\" : 3,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"title\",",
            "                    \"ordinalPosition\" : 4,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"author_id\",",
            "                    \"ordinalPosition\" : 5,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"publisher_id\",",
            "                    \"ordinalPosition\" : 6,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.sql.Timestamp\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"due_date\",",
            "                    \"ordinalPosition\" : 7,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.sql.Timestamp\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"submit_date\",",
            "                    \"ordinalPosition\" : 8,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.sql.Timestamp\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"publish_date\",",
            "                    \"ordinalPosition\" : 9,",
            "                    \"enabled\" : true",
            "                  },"
        ).forEachOrdered(sb::append);
    }
    
    private static void initPart4(StringBuilder sb) {
        Stream.of(
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"url\",",
            "                    \"ordinalPosition\" : 10,",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"name\" : \"publications\",",
            "                \"enabled\" : true",
            "              },",
            "              {",
            "                \"expanded\" : true,",
            "                \"primaryKeyColumns\" : [",
            "                  {",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"ordinalPosition\" : 1",
            "                  }",
            "                ],",
            "                \"indexes\" : [",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : true,",
            "                    \"name\" : \"PRIMARY\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"id\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"columns\" : [",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"autoIncrement\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"ordinalPosition\" : 1,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"version\",",
            "                    \"ordinalPosition\" : 2,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"publisher\",",
            "                    \"ordinalPosition\" : 3,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"last_name\",",
            "                    \"ordinalPosition\" : 4,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"first_name\",",
            "                    \"ordinalPosition\" : 5,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"email\",",
            "                    \"ordinalPosition\" : 6,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"phone\",",
            "                    \"ordinalPosition\" : 7,",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"name\" : \"publishers\",",
            "                \"enabled\" : true",
            "              },"
        ).forEachOrdered(sb::append);
    }
    
    private static void initPart5(StringBuilder sb) {
        Stream.of(
            "              {",
            "                \"expanded\" : true,",
            "                \"primaryKeyColumns\" : [",
            "                  {",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"ordinalPosition\" : 1",
            "                  }",
            "                ],",
            "                \"indexes\" : [",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : true,",
            "                    \"name\" : \"PRIMARY\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"id\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"columns\" : [",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"autoIncrement\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"ordinalPosition\" : 1,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"version\",",
            "                    \"ordinalPosition\" : 2,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"state\",",
            "                    \"ordinalPosition\" : 3,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"mnemonic\",",
            "                    \"ordinalPosition\" : 4,",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"name\" : \"states\",",
            "                \"enabled\" : true",
            "              },",
            "              {",
            "                \"expanded\" : true,",
            "                \"primaryKeyColumns\" : [",
            "                  {",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"ordinalPosition\" : 1",
            "                  }",
            "                ],",
            "                \"indexes\" : [",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : true,",
            "                    \"name\" : \"PRIMARY\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"id\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"columns\" : [",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"autoIncrement\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"ordinalPosition\" : 1,",
            "                    \"enabled\" : true",
            "                  },"
        ).forEachOrdered(sb::append);
    }
    
    private static void initPart6(StringBuilder sb) {
        Stream.of(
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"version\",",
            "                    \"ordinalPosition\" : 2,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"type\",",
            "                    \"ordinalPosition\" : 3,",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"name\" : \"types\",",
            "                \"enabled\" : true",
            "              }",
            "            ],",
            "            \"expanded\" : true,",
            "            \"name\" : \"publications\",",
            "            \"enabled\" : true",
            "          }",
            "        ],",
            "        \"typeName\" : \"MySQL\",",
            "        \"ipAddress\" : \"127.0.0.1\",",
            "        \"name\" : \"db\",",
            "        \"enabled\" : true,",
            "        \"username\" : \"root\"",
            "      }",
            "    ],",
            "    \"enabled\" : true",
            "  }",
            "}"
        ).forEachOrdered(sb::append);
    }
}