package org.redlich.publications.db.publications.types.generated;

import com.speedment.runtime.core.manager.Manager;
import javax.annotation.Generated;
import org.redlich.publications.db.publications.types.Types;

/**
 * The generated base interface for the manager of every {@link
 * org.redlich.publications.db.publications.types.Types} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface GeneratedTypesManager extends Manager<Types> {
    
    @Override
    default Class<Types> getEntityClass() {
        return Types.class;
    }
}