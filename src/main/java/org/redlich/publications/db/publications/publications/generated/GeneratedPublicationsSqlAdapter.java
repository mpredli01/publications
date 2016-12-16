package org.redlich.publications.db.publications.publications.generated;

import com.speedment.common.injector.annotation.ExecuteBefore;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.sql.SqlPersistenceComponent;
import com.speedment.runtime.core.component.sql.SqlStreamSupplierComponent;
import com.speedment.runtime.core.exception.SpeedmentException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.annotation.Generated;
import org.redlich.publications.db.publications.publications.Publications;
import org.redlich.publications.db.publications.publications.PublicationsImpl;
import static com.speedment.common.injector.State.RESOLVED;
import static com.speedment.runtime.core.internal.util.sql.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link
 * org.redlich.publications.db.publications.publications.Publications} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public abstract class GeneratedPublicationsSqlAdapter {
    
    private final TableIdentifier<Publications> tableIdentifier;
    
    protected GeneratedPublicationsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("db", "publications", "publications");
    }
    
    @ExecuteBefore(RESOLVED)
    void installMethodName(SqlStreamSupplierComponent streamSupplierComponent, SqlPersistenceComponent persistenceComponent) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }
    
    protected Publications apply(ResultSet resultSet) throws SpeedmentException{
        final Publications entity = createEntity();
        try {
            entity.setId(resultSet.getLong(1));
            entity.setVersion(resultSet.getLong(2));
            entity.setTypeId(resultSet.getLong(3));
            entity.setTitle(resultSet.getString(4));
            entity.setAuthorId(resultSet.getLong(5));
            entity.setPublisherId(resultSet.getLong(6));
            entity.setDueDate(getTimestamp(resultSet, 7));
            entity.setSubmitDate(getTimestamp(resultSet, 8));
            entity.setPublishDate(getTimestamp(resultSet, 9));
            entity.setUrl(getString(resultSet, 10));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    protected PublicationsImpl createEntity() {
        return new PublicationsImpl();
    }
}