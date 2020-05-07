/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ThroughputSettingsGetPropertiesResource model.
 */
public class ThroughputSettingsGetPropertiesResource {
    /**
     * Value of the Cosmos DB resource throughput. Either throughput is
     * required or provisionedThroughputSettings is required, but not both.
     */
    @JsonProperty(value = "throughput")
    private Integer throughput;

    /**
     * Cosmos DB resource for provisioned throughput settings. Either
     * throughput is required or provisionedThroughputSettings is required, but
     * not both.
     */
    @JsonProperty(value = "provisionedThroughputSettings")
    private ProvisionedThroughputSettingsResource provisionedThroughputSettings;

    /**
     * The minimum throughput of the resource.
     */
    @JsonProperty(value = "minimumThroughput", access = JsonProperty.Access.WRITE_ONLY)
    private String minimumThroughput;

    /**
     * The throughput replace is pending.
     */
    @JsonProperty(value = "offerReplacePending", access = JsonProperty.Access.WRITE_ONLY)
    private String offerReplacePending;

    /**
     * A system generated property. A unique identifier.
     */
    @JsonProperty(value = "_rid", access = JsonProperty.Access.WRITE_ONLY)
    private String _rid;

    /**
     * A system generated property that denotes the last updated timestamp of
     * the resource.
     */
    @JsonProperty(value = "_ts", access = JsonProperty.Access.WRITE_ONLY)
    private Object _ts;

    /**
     * A system generated property representing the resource etag required for
     * optimistic concurrency control.
     */
    @JsonProperty(value = "_etag", access = JsonProperty.Access.WRITE_ONLY)
    private String _etag;

    /**
     * Get value of the Cosmos DB resource throughput. Either throughput is required or provisionedThroughputSettings is required, but not both.
     *
     * @return the throughput value
     */
    public Integer throughput() {
        return this.throughput;
    }

    /**
     * Set value of the Cosmos DB resource throughput. Either throughput is required or provisionedThroughputSettings is required, but not both.
     *
     * @param throughput the throughput value to set
     * @return the ThroughputSettingsGetPropertiesResource object itself.
     */
    public ThroughputSettingsGetPropertiesResource withThroughput(Integer throughput) {
        this.throughput = throughput;
        return this;
    }

    /**
     * Get cosmos DB resource for provisioned throughput settings. Either throughput is required or provisionedThroughputSettings is required, but not both.
     *
     * @return the provisionedThroughputSettings value
     */
    public ProvisionedThroughputSettingsResource provisionedThroughputSettings() {
        return this.provisionedThroughputSettings;
    }

    /**
     * Set cosmos DB resource for provisioned throughput settings. Either throughput is required or provisionedThroughputSettings is required, but not both.
     *
     * @param provisionedThroughputSettings the provisionedThroughputSettings value to set
     * @return the ThroughputSettingsGetPropertiesResource object itself.
     */
    public ThroughputSettingsGetPropertiesResource withProvisionedThroughputSettings(ProvisionedThroughputSettingsResource provisionedThroughputSettings) {
        this.provisionedThroughputSettings = provisionedThroughputSettings;
        return this;
    }

    /**
     * Get the minimum throughput of the resource.
     *
     * @return the minimumThroughput value
     */
    public String minimumThroughput() {
        return this.minimumThroughput;
    }

    /**
     * Get the throughput replace is pending.
     *
     * @return the offerReplacePending value
     */
    public String offerReplacePending() {
        return this.offerReplacePending;
    }

    /**
     * Get a system generated property. A unique identifier.
     *
     * @return the _rid value
     */
    public String _rid() {
        return this._rid;
    }

    /**
     * Get a system generated property that denotes the last updated timestamp of the resource.
     *
     * @return the _ts value
     */
    public Object _ts() {
        return this._ts;
    }

    /**
     * Get a system generated property representing the resource etag required for optimistic concurrency control.
     *
     * @return the _etag value
     */
    public String _etag() {
        return this._etag;
    }

}
