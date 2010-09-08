package pl.xsolve.dao;

/**
 * Date: 2010-09-09
 *
 * @author Konrad Malawski
 */
public interface MorphiaDao<T, K extends java.io.Serializable> {
    
    com.google.code.morphia.query.Query<T> createQuery();
    
    com.google.code.morphia.query.UpdateOperations<T> createUpdateOperations();
    
    java.lang.Class<T> getEntityClass();
    
    void save(T entity);
    
    void updateFirst(com.google.code.morphia.query.Query q, com.google.code.morphia.query.UpdateOperations ops);
    
    void update(com.google.code.morphia.query.Query q, com.google.code.morphia.query.UpdateOperations ops);
    
    void delete(T entity);
    
    void deleteById(K id);
    
    void deleteByQuery(com.google.code.morphia.query.Query q);
    
    T get(K id);
    
    java.util.List<K> findIds(java.lang.String key, java.lang.Object value);
    
    java.util.List<K> findIds();
    
    java.util.List<K> findIds(com.google.code.morphia.query.Query<T> q);
    
    boolean exists(java.lang.String key, java.lang.Object value);
    
    boolean exists(com.google.code.morphia.query.Query<T> q);
    
    long count();
    
    long count(java.lang.String key, java.lang.Object value);
    
    long count(com.google.code.morphia.query.Query<T> q);
    
    T findOne(java.lang.String key, java.lang.Object value);
    
    T findOne(com.google.code.morphia.query.Query<T> q);
    
    com.google.code.morphia.query.QueryResults<T> find();
    
    com.google.code.morphia.query.QueryResults<T> find(com.google.code.morphia.query.Query<T> q);
    
    void dropCollection();
    
    com.google.code.morphia.Datastore getDatastore();
}
