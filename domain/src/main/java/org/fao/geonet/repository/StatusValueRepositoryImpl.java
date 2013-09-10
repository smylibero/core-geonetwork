package org.fao.geonet.repository;

import org.fao.geonet.domain.StatusValue;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Implement custom methods for StatusValueRepository that can't be implemented by the query dsl of spring-data.
 *
 * User: Jesse
 * Date: 9/10/13
 * Time: 7:13 AM
 */
public class StatusValueRepositoryImpl extends LocalizedEntityRepositoryImpl<StatusValue, Integer> {

    @PersistenceContext
    private EntityManager _EntityManager;

    /**
     * Constructor.
     */
    public StatusValueRepositoryImpl() {
        super(StatusValue.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return _EntityManager;
    }
}