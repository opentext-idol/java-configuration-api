package com.hp.autonomy.frontend.configuration;

/*
 * $Id:$
 *
 * Copyright (c) 2013, Autonomy Systems Ltd.
 *
 * Last modified by $Author:$ on $Date:$
 */

/**
 * A {@link ConfigService} which allows the config to be updated.
 * @param <T>
 */
public interface WriteableConfigService<T> extends ConfigService<T> {

    /**
     * Updates the configuration to the given config.
     *
     * This method should be thread safe.
     *
     * @param config The new config
     * @throws Exception If an error occurs while saving the config
     */
    @SuppressWarnings("ProhibitedExceptionDeclared")
    void updateConfig(final T config) throws Exception;

    /**
     * Called before the config is updated to allow properties to be added or removed. This method can be implemented
     * as an identity method.
     *
     * @param config The config to be modified.
     * @return A new config where the changes have been applied.
     */
   T preUpdate(final T config);

   void postUpdate(final T config) throws Exception;

}
