package org.redlich.publications.db.publications.publications.generated;

import com.speedment.runtime.core.manager.Manager;
import javax.annotation.Generated;
import org.redlich.publications.db.publications.publications.Publications;

/**
 * The generated base interface for the manager of every {@link
 * org.redlich.publications.db.publications.publications.Publications} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface GeneratedPublicationsManager extends Manager<Publications> {
    
    @Override
    default Class<Publications> getEntityClass() {
        return Publications.class;
    }
}