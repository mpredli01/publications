package org.redlich.publications.db.publications.publishers.generated;

import com.speedment.runtime.core.manager.Manager;
import javax.annotation.Generated;
import org.redlich.publications.db.publications.publishers.Publishers;

/**
 * The generated base interface for the manager of every {@link
 * org.redlich.publications.db.publications.publishers.Publishers} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface GeneratedPublishersManager extends Manager<Publishers> {
    
    @Override
    default Class<Publishers> getEntityClass() {
        return Publishers.class;
    }
}