package com.tinytinybites.lifesum.model;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.tinytinybites.lifesum.model.ServingCategory;
import com.tinytinybites.lifesum.model.ServingSize;
import com.tinytinybites.lifesum.model.Food;

import com.tinytinybites.lifesum.model.ServingCategoryDao;
import com.tinytinybites.lifesum.model.ServingSizeDao;
import com.tinytinybites.lifesum.model.FoodDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig servingCategoryDaoConfig;
    private final DaoConfig servingSizeDaoConfig;
    private final DaoConfig foodDaoConfig;

    private final ServingCategoryDao servingCategoryDao;
    private final ServingSizeDao servingSizeDao;
    private final FoodDao foodDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        servingCategoryDaoConfig = daoConfigMap.get(ServingCategoryDao.class).clone();
        servingCategoryDaoConfig.initIdentityScope(type);

        servingSizeDaoConfig = daoConfigMap.get(ServingSizeDao.class).clone();
        servingSizeDaoConfig.initIdentityScope(type);

        foodDaoConfig = daoConfigMap.get(FoodDao.class).clone();
        foodDaoConfig.initIdentityScope(type);

        servingCategoryDao = new ServingCategoryDao(servingCategoryDaoConfig, this);
        servingSizeDao = new ServingSizeDao(servingSizeDaoConfig, this);
        foodDao = new FoodDao(foodDaoConfig, this);

        registerDao(ServingCategory.class, servingCategoryDao);
        registerDao(ServingSize.class, servingSizeDao);
        registerDao(Food.class, foodDao);
    }
    
    public void clear() {
        servingCategoryDaoConfig.getIdentityScope().clear();
        servingSizeDaoConfig.getIdentityScope().clear();
        foodDaoConfig.getIdentityScope().clear();
    }

    public ServingCategoryDao getServingCategoryDao() {
        return servingCategoryDao;
    }

    public ServingSizeDao getServingSizeDao() {
        return servingSizeDao;
    }

    public FoodDao getFoodDao() {
        return foodDao;
    }

}
