/*
 * Copyright 2013-2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.frontend.configuration;

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
     * Must be called before the config is updated to allow properties to be added or removed. This method can be
     * implemented as an identity method.
     *
     * @param config The config to be modified.
     * @return A new config where the changes have been applied.
     */
    T preUpdate(final T config);

    /**
     * Must be called by the updateConfig method after the config object has been updated successfully. This method can
     * be implemented as a no-op.
     *
     * @param config The newly updated config object
     * @throws Exception
     */
    void postUpdate(final T config) throws Exception;

}
