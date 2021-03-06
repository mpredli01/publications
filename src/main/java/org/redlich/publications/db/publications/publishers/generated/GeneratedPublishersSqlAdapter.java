package org.redlich.publications.db.publications.publishers.generated;

import com.speedment.common.injector.annotation.ExecuteBefore;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.sql.SqlPersistenceComponent;
import com.speedment.runtime.core.component.sql.SqlStreamSupplierComponent;
import com.speedment.runtime.core.exception.SpeedmentException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.annotation.Generated;
import org.redlich.publications.db.publications.publishers.Publishers;
import org.redlich.publications.db.publications.publishers.PublishersImpl;
import static com.speedment.common.injector.State.RESOLVED;
import static com.speedment.runtime.core.internal.util.sql.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link
 * org.redlich.publications.db.publications.publishers.Publishers} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public abstract class GeneratedPublishersSqlAdapter {
    
    private final TableIdentifier<Publishers> tableIdentifier;
    
    protected GeneratedPublishersSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("db", "publications", "publishers");
    }
    
    @ExecuteBefore(RESOLVED)
    void installMethodName(SqlStreamSupplierComponent streamSupplierComponent, SqlPersistenceComponent persistenceComponent) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }
    
    protected Publishers apply(ResultSet resultSet) throws SpeedmentException{
        final Publishers entity = createEntity();
        try {
            entity.setId(resultSet.getLong(1));
            entity.setVersion(resultSet.getLong(2));
            entity.setPublisher(resultSet.getString(3));
            entity.setLastName(resultSet.getString(4));
            entity.setFirstName(resultSet.getString(5));
            entity.setEmail(getString(resultSet, 6));
            entity.setPhone(getString(resultSet, 7));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    protected PublishersImpl createEntity() {
        return new PublishersImpl();
    }
}