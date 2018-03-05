package com.vue.adminlte4j.web.config;

import com.vue.adminlte4j.model.UIModel;
import com.vue.adminlte4j.support.ModelConfigManager;

/**
 * Created by bjliuyong on 2018/3/5.
 */
public interface ApiAdminConfig {

    /**
     * config menu
     * @param uiModel
     */
    default void configureMenu(UIModel uiModel) {
        uiModel.menu(MenuConfig.systemMenu())
            .menu(ModelConfigManager.getMenu()) ;
    }
}