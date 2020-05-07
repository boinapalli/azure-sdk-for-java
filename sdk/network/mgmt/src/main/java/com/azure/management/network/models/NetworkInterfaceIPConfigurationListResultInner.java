// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The NetworkInterfaceIPConfigurationListResult model. */
@Fluent
public final class NetworkInterfaceIPConfigurationListResultInner {
    /*
     * A list of ip configurations.
     */
    @JsonProperty(value = "value")
    private List<NetworkInterfaceIPConfigurationInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: A list of ip configurations.
     *
     * @return the value value.
     */
    public List<NetworkInterfaceIPConfigurationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of ip configurations.
     *
     * @param value the value value to set.
     * @return the NetworkInterfaceIPConfigurationListResultInner object itself.
     */
    public NetworkInterfaceIPConfigurationListResultInner withValue(List<NetworkInterfaceIPConfigurationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }
}
