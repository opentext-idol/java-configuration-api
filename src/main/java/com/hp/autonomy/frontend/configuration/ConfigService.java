/*
 * Copyright 2013-2015 Open Text.
 *
 * Licensed under the MIT License (the "License"); you may not use this file
 * except in compliance with the License.
 *
 * The only warranties for products and services of Open Text and its affiliates
 * and licensors ("Open Text") are as may be set forth in the express warranty
 * statements accompanying such products and services. Nothing herein should be
 * construed as constituting an additional warranty. Open Text shall not be
 * liable for technical or editorial errors or omissions contained herein. The
 * information contained herein is subject to change without notice.
 */

package com.hp.autonomy.frontend.configuration;


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
