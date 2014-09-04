package com.hp.autonomy.frontend.configuration;

/*
 * $Id:$
 *
 * Copyright (c) 2013, Autonomy Systems Ltd.
 *
 * Last modified by $Author:$ on $Date:$
 */
public enum ProductType {

    AXE("Content"),
    SERVICECOORDINATOR("Coordinator"),
    UASERVER("Community");

    private final String friendlyName;

    private ProductType(final String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getFriendlyName() {
        return friendlyName;
    }
}
