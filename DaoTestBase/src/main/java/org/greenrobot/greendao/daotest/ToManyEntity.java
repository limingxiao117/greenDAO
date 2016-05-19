package org.greenrobot.greendao.daotest;

import org.greenrobot.greendao.annotation.*;

import java.util.List;
import org.greenrobot.greendao.daotest.DaoSession;
import org.greenrobot.greendao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "TO_MANY_ENTITY".
 */
@Entity(active = true)
public class ToManyEntity {

    @Id
    private Long id;
    private String sourceJoinProperty;

    /** Used to resolve relations */
    @Generated
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated
    private transient ToManyEntityDao myDao;

    @ToMany(joinOn = {
        @JoinOn(source = "id", target = "toManyId")
    })
    @OrderBy("id ASC")
    private List<ToManyTargetEntity> toManyTargetEntityList;

    @ToMany(joinOn = {
        @JoinOn(source = "id", target = "toManyIdDesc")
    })
    @OrderBy("id DESC")
    private List<ToManyTargetEntity> toManyDescList;

    @ToMany(joinOn = {
        @JoinOn(source = "sourceJoinProperty", target = "targetJoinProperty")
    })
    @OrderBy("id ASC")
    private List<ToManyTargetEntity> toManyByJoinProperty;

    @ToMany(joinOn = {
        @JoinOn(source = "id", target = "toManyId"),
        @JoinOn(source = "sourceJoinProperty", target = "targetJoinProperty")
    })
    @OrderBy("targetJoinProperty DESC, id DESC")
    private List<ToManyTargetEntity> toManyJoinTwo;

    @ToMany
    @JoinEntity(entity = JoinManyToDateEntity.class, sourceProperty = "idToMany", targetProperty = "idDate")
    private List<DateEntity> dateEntityList;

    @Generated
    public ToManyEntity() {
    }

    public ToManyEntity(Long id) {
        this.id = id;
    }

    @Generated
    public ToManyEntity(Long id, String sourceJoinProperty) {
        this.id = id;
        this.sourceJoinProperty = sourceJoinProperty;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getToManyEntityDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSourceJoinProperty() {
        return sourceJoinProperty;
    }

    public void setSourceJoinProperty(String sourceJoinProperty) {
        this.sourceJoinProperty = sourceJoinProperty;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    @Generated
    public List<ToManyTargetEntity> getToManyTargetEntityList() {
        if (toManyTargetEntityList == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ToManyTargetEntityDao targetDao = daoSession.getToManyTargetEntityDao();
            List<ToManyTargetEntity> toManyTargetEntityListNew = targetDao._queryToManyEntity_ToManyTargetEntityList(id);
            synchronized (this) {
                if(toManyTargetEntityList == null) {
                    toManyTargetEntityList = toManyTargetEntityListNew;
                }
            }
        }
        return toManyTargetEntityList;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated
    public synchronized void resetToManyTargetEntityList() {
        toManyTargetEntityList = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    @Generated
    public List<ToManyTargetEntity> getToManyDescList() {
        if (toManyDescList == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ToManyTargetEntityDao targetDao = daoSession.getToManyTargetEntityDao();
            List<ToManyTargetEntity> toManyDescListNew = targetDao._queryToManyEntity_ToManyDescList(id);
            synchronized (this) {
                if(toManyDescList == null) {
                    toManyDescList = toManyDescListNew;
                }
            }
        }
        return toManyDescList;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated
    public synchronized void resetToManyDescList() {
        toManyDescList = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    @Generated
    public List<ToManyTargetEntity> getToManyByJoinProperty() {
        if (toManyByJoinProperty == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ToManyTargetEntityDao targetDao = daoSession.getToManyTargetEntityDao();
            List<ToManyTargetEntity> toManyByJoinPropertyNew = targetDao._queryToManyEntity_ToManyByJoinProperty(sourceJoinProperty);
            synchronized (this) {
                if(toManyByJoinProperty == null) {
                    toManyByJoinProperty = toManyByJoinPropertyNew;
                }
            }
        }
        return toManyByJoinProperty;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated
    public synchronized void resetToManyByJoinProperty() {
        toManyByJoinProperty = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    @Generated
    public List<ToManyTargetEntity> getToManyJoinTwo() {
        if (toManyJoinTwo == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ToManyTargetEntityDao targetDao = daoSession.getToManyTargetEntityDao();
            List<ToManyTargetEntity> toManyJoinTwoNew = targetDao._queryToManyEntity_ToManyJoinTwo(id, sourceJoinProperty);
            synchronized (this) {
                if(toManyJoinTwo == null) {
                    toManyJoinTwo = toManyJoinTwoNew;
                }
            }
        }
        return toManyJoinTwo;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated
    public synchronized void resetToManyJoinTwo() {
        toManyJoinTwo = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    @Generated
    public List<DateEntity> getDateEntityList() {
        if (dateEntityList == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            DateEntityDao targetDao = daoSession.getDateEntityDao();
            List<DateEntity> dateEntityListNew = targetDao._queryToManyEntity_DateEntityList(id);
            synchronized (this) {
                if(dateEntityList == null) {
                    dateEntityList = dateEntityListNew;
                }
            }
        }
        return dateEntityList;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated
    public synchronized void resetDateEntityList() {
        dateEntityList = null;
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
