package com.autonomy.frontend.configuration;

/*
 * $Id$
 *
 * Copyright (c) 2013, Autonomy Systems Ltd.
 *
 * Last modified by $Author$ on $Date$
 */

/**
 * The core interface of the configuration library.  Most clients of the configuration library should consume
 * implementations of this interface.
 *
 * @author alex.scown
 * @param <T> The type of the configuration object provided by the service. This should be an immutable type.
 */
public interface ConfigService<T> {

    /**
     * Gets the current configuration object.
     *
     * This method should not return null during normal application operation.
     *
     * @return The current configuration object
     */
    T getConfig();

}
