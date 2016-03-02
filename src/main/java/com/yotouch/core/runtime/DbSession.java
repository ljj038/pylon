package com.yotouch.core.runtime;

import java.util.List;

import com.yotouch.core.entity.Entity;
import com.yotouch.core.entity.MetaEntity;

public interface DbSession {

    Entity newEntity(String entityName);
    
    Entity save(Entity e);

    Entity getEntity(String entityName, String uuid);
    
    Entity getEntity(MetaEntity me, String uuid);

    List<Entity> queryRawSql(String entityName, String where, Object[] args);
    
    Entity queryOneRawSql(String entityName, String where, Object[] args);

    List<Entity> getAll(String string);

    void deleteEntity(MetaEntity me, String uuid);

    void deleteRawSql(MetaEntity me, String where, Object[] args);

    

    
    
}
