// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.management.network.PolicySettings;
import com.azure.management.network.WebApplicationFirewallCustomRule;
import com.azure.management.network.WebApplicationFirewallPolicyResourceState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The WebApplicationFirewallPolicy model. */
@JsonFlatten
@Fluent
public class WebApplicationFirewallPolicyInner extends Resource {
    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Describes policySettings for policy.
     */
    @JsonProperty(value = "properties.policySettings")
    private PolicySettings policySettings;

    /*
     * Describes custom rules inside the policy.
     */
    @JsonProperty(value = "properties.customRules")
    private List<WebApplicationFirewallCustomRule> customRules;

    /*
     * A collection of references to application gateways.
     */
    @JsonProperty(value = "properties.applicationGateways", access = JsonProperty.Access.WRITE_ONLY)
    private List<ApplicationGatewayInner> applicationGateways;

    /*
     * Provisioning state of the WebApplicationFirewallPolicy.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Resource status of the policy.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private WebApplicationFirewallPolicyResourceState resourceState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the WebApplicationFirewallPolicyInner object itself.
     */
    public WebApplicationFirewallPolicyInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the policySettings property: Describes policySettings for policy.
     *
     * @return the policySettings value.
     */
    public PolicySettings policySettings() {
        return this.policySettings;
    }

    /**
     * Set the policySettings property: Describes policySettings for policy.
     *
     * @param policySettings the policySettings value to set.
     * @return the WebApplicationFirewallPolicyInner object itself.
     */
    public WebApplicationFirewallPolicyInner withPolicySettings(PolicySettings policySettings) {
        this.policySettings = policySettings;
        return this;
    }

    /**
     * Get the customRules property: Describes custom rules inside the policy.
     *
     * @return the customRules value.
     */
    public List<WebApplicationFirewallCustomRule> customRules() {
        return this.customRules;
    }

    /**
     * Set the customRules property: Describes custom rules inside the policy.
     *
     * @param customRules the customRules value to set.
     * @return the WebApplicationFirewallPolicyInner object itself.
     */
    public WebApplicationFirewallPolicyInner withCustomRules(List<WebApplicationFirewallCustomRule> customRules) {
        this.customRules = customRules;
        return this;
    }

    /**
     * Get the applicationGateways property: A collection of references to application gateways.
     *
     * @return the applicationGateways value.
     */
    public List<ApplicationGatewayInner> applicationGateways() {
        return this.applicationGateways;
    }

    /**
     * Get the provisioningState property: Provisioning state of the WebApplicationFirewallPolicy.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resourceState property: Resource status of the policy.
     *
     * @return the resourceState value.
     */
    public WebApplicationFirewallPolicyResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the WebApplicationFirewallPolicyInner object itself.
     */
    public WebApplicationFirewallPolicyInner withId(String id) {
        this.id = id;
        return this;
    }
}
